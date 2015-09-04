<%@ include file="include.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" 
  "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="image/books2.png">
<script type="text/javascript" src="js/ajax.js"></script>
<script type='text/javascript'
	src='http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js'></script>
<title>Library</title>
</head>

<body>

	<div class="mainblock">
		<a href="savecitation"><p id="welcomtext">
				<spring:message code="label.welcom" />
			</p></a>

		<div id="baner">
			<marquee scrollamount="10">
				<a href="savecitation"><img src="image/Ornament.bmp"></a>
			</marquee>
		</div>

		<div id="lang">
			<a href="?lang=en"><img src="image/gb.png" alt="EN"></a> <a
				href="?lang=be"><img src="image/be.png" alt="BE"></a> <a
				href="?lang=ru"><img src="image/ru.png" alt="RU"> </a>
		</div>

		<div id="searchblock">
			<spring:message code="label.search" />
			: <input id="textsearch" type="text" size="20">
			<button id="butsearch" onclick="search()">
				<spring:message code="but.search" />
			</button>
		</div>

		<div id="login">
			<div id="logintext" align="center">
				<a href="#"><p id="enter">
						<spring:message code="label.enter" />
					</p></a>
				<div>
					<input type="text" placeholder="Логін" id="user_name"><input
						type="password" placeholder="Пароль" id="user_pass">
					<button id="enterbut" onclick="enterToAccount()">
						<spring:message code="but.enter" />
					</button>
					<button id="exitbut" onclick="exiteFromAccount()">
						<spring:message code="but.exit" />
					</button>
					<br />

				</div>


				<a href="savecitation_reg"><p id="regis">
						<spring:message code="label.signUp" />
					</p></a>

				<c:url value="login?logout" var="logoutUrl" />
                <a href="${logoutUrl}"><spring:message code="label.logout"/></a>
			</div>
		</div>
		<div id="hello">
			<spring:message code="label.helo"/>
			<sec:authentication property="name" />
			!!!
		</div>
		<div id="windowhead">
			<ul>
				<li><a href="savecitation"><spring:message code="page.main" /></a>
				</li>
				<li><a href="savecitation_news_1"><spring:message
							code="page.news" /></a></li>
				<li><a href="savecitation_lib"><spring:message
							code="page.lib" /></a>
					<ul>
						<li><a href="savecitation_authors"><spring:message
									code="label.authors" /></a></li>
						<li><a href="savecitation_books"><spring:message
									code="label.books" /></a></li>
						<li><a href="savecitation_lib"><spring:message
									code="label.genre" /></a></li>
					</ul></li>
				<li><a href="savecitation_chat"><spring:message
							code="page.chat" /></a></li>
				<li><a href="savecitation_programs"><spring:message
							code="page.prog" /></a></li>
			</ul>

		</div>
</body>
</html>