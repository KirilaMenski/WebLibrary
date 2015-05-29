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
				<a href="savecitation_reg.by"><p id="regis">
						<spring:message code="label.signUp" />
					</p></a>
			</div>
		</div>

		<div id="addNews">
			<input type="text" placeholder="Назва" size="26" id="title">
			<textarea placeholder="Апісанне" id="description" rows="5" cols="22"></textarea>
			<textarea placeholder="Навіна" id="news" rows="13" cols="22"></textarea>
			<button id="add">
				<spring:message code="but.addNews" />
			</button>
		</div>

		<div id="windowhead">
			<ul>
				<li><a href="savecitation.by"><spring:message
							code="page.main" /></a>
					<ul>
						<!-- Выправіць -->
						<li><a href="SaveCitationWeb.jsp" title="Для ПК"><spring:message
									code="label.aboutProj" /></a></li>
						<!-- Выправіць -->
						<li><a href="SaveCitationWeb.jsp"
							title="Для мабільных прылад"><spring:message
									code="label.aboutAuthor" /></a></li>
					</ul></li>
				<li><a href="savecitation_news.by"><spring:message
							code="page.news" /></a></li>
				<li><a href="savecitation_lib.by"><spring:message
							code="page.lib" /></a></li>
				<li><a href="savecitation_chat.by"><spring:message
							code="page.chat" /></a></li>
				<li><a href="savecitation_programs.by"><spring:message
							code="page.prog" /></a>
					<ul>
						<!-- Выправіць -->
						<li><a href="SaveCitationWeb_Program_PC.jsp" title="Для ПК"><spring:message
									code="label.PC" /></a></li>
						<!-- Выправіць -->
						<li><a href="SaveCitationWeb_Program_Mobile.jsp"
							title="Для мабільных прылад"><spring:message
									code="label.mobiles" /></a></li>
					</ul></li>
			</ul>

		</div>

		<div id="window">

			<div id="newsBlock"></div>


			<!-- <div id="text">
				<p><b><span id="titleNews">sfsfg</span></b> <span id="date">sfgsfg</span></p>
				<p><span id="descriptionNews">sfgsfgsfgsfg</span></p>
			</div>-->
		</div>


	</div>


</body>
</html>