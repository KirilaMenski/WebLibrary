<%@ include file="pattern/include.jsp"%>
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
			<form:form action="savecitation_editNews_${news.id}" method="POST" commandName="news">
				<form:input type="text" placeholder="id" id="id" path="id" />
				<form:input type="text" placeholder="Назва" id="title" path="title" value="${news.title}"/>
				<form:textarea placeholder="Апісанне" id="description" path="description" value="${news.description}"/>
				<form:textarea placeholder="Навіна" id="news" path="news" value="${news.news}"/>
				<input type="submit" value="Edit"/>
			</form:form>
		</div>


	</div>

</body>
</html>