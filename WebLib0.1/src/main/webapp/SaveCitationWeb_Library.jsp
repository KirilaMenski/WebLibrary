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
<script type="text/javascript" src="js/animate.js"></script>
<%@ include file="pattern/main.jsp"%>
<title>Library</title>
</head>

<body>

	<sec:authorize access="hasRole('ADMIN')">
		<div id="addGenre" align="center">
			<!-- <input type="text" placeholder="Назва" size="26" id="title">
		<textarea placeholder="Апісанне" id="description" rows="5" cols="22"></textarea>
		<textarea placeholder="Навіна" id="news" rows="13" cols="22"></textarea>
		<button id="add">
			<spring:message code="but.add" />
		</button>-->
			<a href="addGenrePage"><spring:message code="label.addGenre" /></a>
		</div>
	</sec:authorize>

	<div id="window">
		<div id="text">
			<c:forEach items="${genre}" var="genre">
				<a href="savecitation_genre_${genre.id}"><img
					alt="${genre.genre}" src="${genre.picture}"></a>
			</c:forEach>
		</div>
	</div>


</body>
</html>