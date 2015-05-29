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
<title>Library</title>
</head>

<body>

	<div class="mainblock">
		<a href="savecitation.by"><p id="welcomtext">
				<spring:message code="label.welcom" />
			</p></a>

		<div id="baner">
			<marquee scrollamount="10">
				<a href="savecitation.by"><img src="image/Ornament.bmp"></a>
			</marquee>
		</div>
		
		<div id="lang">
			<a href="?lang=en"><img src="image/gb.png" alt="EN"></a> <a
				href="?lang=be"><img src="image/be.png" alt="BE"></a> <a href="?lang=ru"><img
				src="image/ru.png" alt="RU"> </a>
		</div>

		<div id="searchblock">
			<spring:message code="label.search" />
			: <input id="textsearch" type="text" size="20">
			<button id="butsearch">
				<spring:message code="but.search" />
			</button>
		</div>

		<div id="login">
			<div id="logintext" align="center">
				<a href="#"><p id="enter">
						<spring:message code="label.enter" />
					</p></a>
				<div>
					<input type="text" placeholder="Логін"><input
						type="password" placeholder="Пароль">
					<button id="enterbut">
						<spring:message code="but.enter" />
					</button>
				</div>
				<a href="SaveCitationWeb_Reg.jsp"><p id="regis">
						<spring:message code="label.signUp" />
					</p></a>
			</div>
		</div>

		<div id="windowhead">
			<ul>
				<li><a href="SaveCitationWeb.jsp"><spring:message
							code="page.main" /></a>
					<ul>
						<li><a href="SaveCitationWeb.jsp" title="Для ПК"><spring:message
									code="label.aboutProj" /></a></li>
						<li><a href="SaveCitationWeb.jsp"
							title="Для мабільных прылад"><spring:message
									code="label.aboutAuthor" /></a></li>
					</ul></li>
				<li><a href="SaveCitationWeb_News.jsp"><spring:message
							code="page.news" /></a></li>
				<li><a href="SaveCitationWeb_Library.jsp"><spring:message
							code="page.lib" /></a></li>
				<li><a href="SaveCitationWeb_Chat.jsp"><spring:message
							code="page.chat" /></a></li>
				<li><a href="SaveCitationWeb_Program.jsp"><spring:message
							code="page.prog" /></a>
					<ul>
						<li><a href="SaveCitationWeb_Program_PC.jsp" title="Для ПК"><spring:message
									code="label.PC" /></a></li>
						<li><a href="SaveCitationWeb_Program_Mobile.jsp"
							title="Для мабільных прылад"><spring:message
									code="label.mobiles" /></a></li>
					</ul></li>
			</ul>

		</div>

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

	</div>


</body>
</html>