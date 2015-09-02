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
<%@ include file="pattern/main.jsp"%>
<title>Library</title>
</head>

<body>

	<div id="window">
		<div id="text">
			<c:forEach items="${programm}" var="programm">

				<ul>
					<a href="savecitation_viewprog_${programm.id}"><li>${programm.title}</li></a>
				</ul>

			</c:forEach>
		</div>
	</div>



</body>
</html>