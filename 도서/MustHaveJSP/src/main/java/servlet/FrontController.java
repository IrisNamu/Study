package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.one")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = request.getRequestURI();
		int lastSlash = uri.lastIndexOf("/");
		String commandStr = uri.substring(lastSlash);

		if (commandStr.equals("/regist.one"))
			registFunc(request);
		else if (commandStr.equals("/login.one"))
			longinFuc(request);
		else if (commandStr.equals("/freeboard.one"))
			freeboardFunc(request);

		request.setAttribute("uri", uri);
		request.setAttribute("commandStr", commandStr);
		request.getRequestDispatcher("/13Servlet/FrontController.jsp").forward(request, response);
	}

	void registFunc(HttpServletRequest request) {
		request.setAttribute("resultValue", "<h4>회원가입</h4>");
	}

	void longinFuc(HttpServletRequest request) {
		request.setAttribute("resultValue", "<h4>회원가입</h4>");
	}

	void freeboardFunc(HttpServletRequest request) {
		request.setAttribute("resultValue", "<h4>회원가입</h4>");
	}
}
