<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="common.Person"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL - set 2</title>
</head>
<body>
	<h4>List 컬렉션 이용하기</h4>
	<%
	ArrayList<Person> pList = new ArrayList<Person>();
	pList.add(new Person("김바다", 35));
	pList.add(new Person("김우주", 26));
	%>
	<c:set var="personList" value="<%=pList%>" scope="request" />
	<ul>
		<li>이름 :${requestScope.personList[0].name}</li>
		<li>나이 :${personList[0].age}</li>
	</ul>

	<h4>Map 컬렉션 이용</h4>
	<%
	Map<String, Person> pMap = new HashMap<String, Person>();
	pMap.put("personArgs1", new Person("윈터", 22));
	pMap.put("personArgs2", new Person("카리나", 23));
	%>

	<c:set var="personMap" value="<%=pMap%>" scope="request" />
	<ul>
		<li>아이디 :${requestScope.personMap.personArgs2.name }</li>
		<li>비번 :${personMap.personArgs2.age}</li>
	</ul>
</body>
</html>