<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FrontController.jsp</title>
</head>
<body>
	<h3>한 번의 매핑으로 여러 가지 요청 처리하기</h3>
	${reaultValue }
	<ol>
		<li>URI : ${ uri }</li>
		<li>요청명 : ${ commandStr }</li>
	</ol>
	<ul>
		<li><a href="../13Servlet/regist.one">회원가입</a>
		<li><a href="../13Servlet/login.one">로그인</a>
		<li><a href="../13Servlet/freeboard.one">자유게시판</a>
	</ul>
</body>
</html>