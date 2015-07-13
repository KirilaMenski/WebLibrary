<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" 
  "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="style.css">
<script type='text/javascript'
	src='http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js'></script>
<script type="text/javascript" src="js/jquery.js"></script>
<%@ include file="pattern/main.jsp"%>
<title>Library</title>
</head>
<body>


	<div id="window">

		<div id="addNewsForm">
			<form:form action="addBooks" method="POST" commandName="books">
				<form:input type="text" placeholder="Вокладка" id="picture"
					path="picture" />
				<br />
				<spring:message code="label.title" />
				<form:input type="text" placeholder="Назва" id="title" path="title" />
				<spring:message code="label.author" />
				<form:input type="text" placeholder="Аўтар" id="author"
					path="author" />
				<spring:message code="label.authId" />
				<form:input type="text" placeholder="ID аўтара" name="authID"
					path="authId" />
				<br />
				<spring:message code="label.year" />
				<form:input type="text" placeholder="Назва" id="year" path="year" />
				<br />
				<spring:message code="label.series" />
				<form:input type="text" placeholder="Серыя кніг" id="series"
					path="series" />
				<spring:message code="label.num_series" />
				<form:input type="text" placeholder="Нумар у серыі" id="num_series"
					path="num_series" />
				<br />
				<spring:message code="label.description" />
				<form:textarea placeholder="Апісанне" id="description"
					path="description" />
				<input type="submit" value="<spring:message code="but.add"/>" />
			</form:form>
		</div>


	</div>

</body>
</html>