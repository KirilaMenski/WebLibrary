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
<%@ include file="pattern/main.jsp"%>
<title>Library</title>
</head>

<body>

	<div id="window" align="center">
		<div id="view">
			<div id="res1">
				<p>
					Назва<b><span id="res1"></span></b>
				</p>
			</div>
			<span id="res2">Date</span>

			<p>
				Апісанне<span id="res3"></span>
			</p>
			<p>
				Навіна<span id="res4"></span>
			</p>
		</div>

	</div>
	<div id="addComment">
		Ваш каментарый:
		<textarea id="commentText"></textarea>
		<button id="addBut">Дадаць</button>
	</div>

	<div id="commentBlock">
		<div id="comments"></div>
	</div>


</body>
</html>