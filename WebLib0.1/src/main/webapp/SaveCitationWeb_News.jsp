<%@ include file="pattern/include.jsp"%>
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
<script type="text/javascript" src="js/animate.js"></script>
<%@ include file="pattern/main.jsp"%>
<title>Library</title>
</head>

<body>
	<sec:authorize access="hasRole('ADMIN')">
		<div id="addNews" align="center">

			<a href="addNewsPage"><spring:message code="label.addNews" /></a>

		</div>
	</sec:authorize>

	<div id="window">

		<div id="newsBlock">
			<c:forEach items="${news}" var="news">
				<div class="newsClass">
					<span id="titleRes"> <b><a
							href="savecitation_viewnews_${news.id}">${news.title}</a></b>
					</span><br /> <span id="dateRes"> ${news.date}</span> <br /> <br /> <span
						id="descriptionRes">${news.description}</span>
				</div>
			</c:forEach>
		</div>

		<div class="pages">

			<ul id ="num_pages">
				<c:forEach items="${page}" var="page">
				<li><a href="savecitation_news_${page}"> - ${page} </a></li>
				</c:forEach>
			</ul>

		</div>

	</div>



</body>
</html>