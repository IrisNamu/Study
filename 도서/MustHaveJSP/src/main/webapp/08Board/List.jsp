<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="model1.board.BoardDAO"%>
<%@page import="model1.board.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
//DAO를 생성해 DB에 연결
BoardDAO dao = new BoardDAO(application);

//사용자가 입력한 검색 조건을 Map에 저장
Map<String, Object> param = new HashMap<String, Object>();
String searchField = request.getParameter("searchField");
String searchWord = request.getParameter("searchWord");
if (searchWord != null) {
	param.put("searchField", searchField);
	param.put("searchWord", searchWord);
}

int totalCount = dao.selectCount(param); //게시물 수 확인
List<BoardDTO> boardLists = dao.selectList(param); //게시물 목록 닫기
dao.close();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원제 게시판</title>
</head>
<body>
	<jsp:include page="../Common/Link.jsp" />
	<!-- 공통 링크 -->
	<h2>목록보기(List)</h2>
	<!-- 검색폼 -->
	<form method="get">
		<table border="1" width="90%">
		<tr>
			<td align="center"><select name="searchField">
					<option value="title">제목</option>
					<option value="content">내용</option>
			</select> <input type="text" name="searchWord" /> <input type="submit"
				name="검색하기" /></td>
		</tr>
	</form>
	<!-- 게시물 목록 테이블(표) -->
	<table border="1" width="90%">
		<!-- 각 컬럼의 이름 -->
		<tr>
			<th width="10%">번호</th>
			<th width="50%">제목</th>
			<th width="15%">작성자</th>
			<th width="10%">조회수</th>
			<th width="15%">작성일</th>
		</tr>
		<!-- 목록의 내용 -->
		<%
		if (boardLists.isEmpty()) {
			//게시물이 하나도 없을 떄
		%>
		<tr>
			<td colspan="5" align="center">등록된 게시물이 없습니다^^*</td>
		</tr>
		<%
		} else {
		//게시물이 있을 때
		int virtualNum = 0;
		for (BoardDTO dto : boardLists) {
			virtualNum = totalCount--; //전체 게시물 수에서 시작해 1씩 감소
		%>
		<tr align="center">
			<td><%=virtualNum%></td>
			<!-- 게시물 번호 -->
			<td align="left">
				<!-- 제목(+하이퍼링크) --> <a href="View.jsp?num=<%=dto.getNum()%>"><%=dto.getTitle()%></a>
			</td>
			<td align="center"><%=dto.getId()%></td>
			<td align="center"><%=dto.getVisitcount()%></td>
			<td align="center"><%=dto.getPostdate()%></td>
		</tr>
		<%
		}
		}
		%>
	</table>
	<table border="1" width="90%">
		<tr align="right">
			<td><button type="button" onclick="location.href='../mvcboard/Write.jsp';">글쓰기
				</button></td>
		</tr>
	</table>
</body>
</html>