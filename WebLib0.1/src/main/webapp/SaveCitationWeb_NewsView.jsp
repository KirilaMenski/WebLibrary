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
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="styleNews.css">
<script type='text/javascript'
	src='http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js'></script>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/newsView_js.js"></script>
<script type="text/javascript" src="js/editNews.js"></script>
<%@ include file="pattern/main.jsp"%>
<title>Library</title>
</head>

<body>

	<div id="window">
		<div id="view">
			<span id="res1">${news.title}</span><br /> <span id="res2">${news.date}</span><br />
			<p>
				<span id="res3">${news.description}</span>
			</p>
			<br />
			<p>
				<span id="res4">${news.news}</span>
			</p>
			<form:form action="savecitation_deleteNews_${news.id}" method="POST"
				commandName="news">
				<input type="submit" name="action" value="Edit" />
				<input type="submit" name="action" value="Delete" />
			</form:form>
			
			<div id="addComment">
				<spring:message code="label.addComment" />
				<textarea id="commentText"></textarea>
				<button id="addBut">
					<spring:message code="but.add" />
				</button>
			</div>

			<div id="commentBlock">
				<div id="comments"></div>
			</div>

		</div>
	</div>


</body>
</html>