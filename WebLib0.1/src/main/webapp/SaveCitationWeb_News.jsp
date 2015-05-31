<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" 
  "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="styleNews.css">
<script type='text/javascript'
	src='http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js'></script>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/news_js.js"></script>
<%@ include file="pattern/main.jsp" %>
<title>Library</title>
</head>

<body>

		<div id="addNews">
			<input type="text" placeholder="Назва" size="26" id="title">
			<textarea placeholder="Апісанне" id="description" rows="5" cols="22"></textarea>
			<textarea placeholder="Навіна" id="news" rows="13" cols="22"></textarea>
			<button id="add">
				<spring:message code="but.addNews" />
			</button>
		</div>


		<div id="window">

			<div id="newsBlock"></div>

		</div>



</body>
</html>