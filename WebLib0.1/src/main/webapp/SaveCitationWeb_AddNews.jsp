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

		<div id="addNewsForm" align="center">
			<form:form action="addNews" method="POST" commandName="news">
				<form:input type="text" placeholder="Назва" size="94" id="title" path="title"/>
				<form:textarea placeholder="Апісанне" id="description" rows="5" cols="80" path="description"/>
				<form:textarea placeholder="Навіна" id="news" rows="13" cols="80" path="news"/>
				<input type="submit" value="<spring:message code="but.addNews"/>" />
			</form:form>
		</div>


	</div>

</body>
</html>