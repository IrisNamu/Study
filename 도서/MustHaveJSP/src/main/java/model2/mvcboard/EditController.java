package model2.mvcboard;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;

import fileupload.FileUtil;
import utils.JSFunction;

@WebServlet("/mvcboard/edit.do")
public class EditController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idx = request.getParameter("idx");
		MVCBoardDAO dao = new MVCBoardDAO();
		MVCBoardDTO dto = dao.selectView(idx);
		request.setAttribute("dto", dto);
		request.getRequestDispatcher("/14MVCBoard/Edit.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest requset, HttpServletResponse response)
			throws ServletException, IOException {
		
		// 1. 파일 업로드 처리 
		// 파일이 업로드될 디렉터리의 물리적 경로와
		String saveDirectory = requset.getServletContext().getRealPath("/Uploads");

		// 첨부 파일 최대 용량 
		ServletContext application = this.getServletContext();
		int maxPostSize = Integer.parseInt(application.getInitParameter("maxPostSize"));

		// 물리적 경로와 업로드 제한 용량을 얻어온 후 파일 업로드!
		MultipartRequest mr = FileUtil.uploadFile(requset, saveDirectory, maxPostSize); 

		//파일 업로드 실패
		if (mr == null) {
			JSFunction.alertBack(response, "첨부 파일이 제한 용량을 초과합니다.");
			return;
		}

		// 2. 파일 업로드 외 처리 
		// 수정 내용을 매개변수에서 얻어옴 -> DTO에 저장할 예정
		String idx = mr.getParameter("idx");
		String prevOfile = mr.getParameter("prevOfile");
		String prevSfile = mr.getParameter("prevSfile");

		String name = mr.getParameter("name");
		String title = mr.getParameter("title");
		String content = mr.getParameter("content");

		// 비밀번호 session에서 가져옴
		HttpSession session = requset.getSession();
		String pass = (String) session.getAttribute("pass");

		// DTO에 저장
		MVCBoardDTO dto = new MVCBoardDTO();
		dto.setIdx(idx);
		dto.setName(name);
		dto.setTitle(title);
		dto.setContent(content);
		dto.setPass(pass);

		// 원본 파일명과 저장된 파일 이름 설정
		String fileName = mr.getFilesystemName("ofile");
		if (fileName != null) {
			
			// 첨부 파일이 있으면 새롭게 바꿔주기
			String now = new SimpleDateFormat("yyyyMMdd_HmsS").format(new Date());
			String ext = fileName.substring(fileName.lastIndexOf("."));
			String newFileName = now + ext;

			// 파일명 변경
			File oldFile = new File(saveDirectory + File.separator + fileName);
			File newFile = new File(saveDirectory + File.separator + newFileName);
			oldFile.renameTo(newFile);

			// DTO에 저장
			dto.setOfile(fileName); // 원래 파일 이름
			dto.setSfile(newFileName); // 서버에 저장된 파일 이름

			// 기존 파일 삭제
			FileUtil.deleteFile(requset, "/Uploads", prevSfile);
		} else {
			// 첨부 파일이 없으면 기존 이름 유지
			dto.setOfile(prevOfile);
			dto.setSfile(prevSfile);
		}

		// DB에 수정 내용 반영하기!
		MVCBoardDAO dao = new MVCBoardDAO();
		int result = dao.updatePost(dto);
		dao.close();

		// 성공하면 1
		if (result == 1) {
			session.removeAttribute("pass");
			response.sendRedirect("../mvcboard/view.do?idx=" + idx);
		} else { 
			JSFunction.alertLocation(response, "비밀번호 검증을 다시 진행해주세요.", "../mvcboard/view.do?idx=" + idx);
		}
	}
}