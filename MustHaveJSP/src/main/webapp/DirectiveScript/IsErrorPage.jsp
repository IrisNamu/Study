<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>지시어 - errorPage, isErrorPage 속성</title>
</head>
<body>
	<h2 style="color: red;">서비스 중 일시적인 오류가 발생하였습니다.</h2>
	<p>
		<b>오류명 : </b>
		<%=exception.getClass().getName()%></br>
		 <b> 오류 메시지:</b>
		<%=exception.getMessage()%>
	</p>
</body>
</html>