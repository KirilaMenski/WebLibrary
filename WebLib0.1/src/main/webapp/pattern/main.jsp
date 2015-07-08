<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" 
  "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

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
				<a href="savecitation_reg"><p id="regis">
						<spring:message code="label.signUp" />
					</p></a>
			</div>
		</div>

		<div id="windowhead">
			<ul>
				<li><a href="savecitation"><spring:message code="page.main" /></a>
				</li>
				<li><a href="savecitation_news"><spring:message
							code="page.news" /></a></li>
				<li><a href="savecitation_lib"><spring:message
							code="page.lib" /></a>
					<ul>
						<li><a href="savecitation_authors"><spring:message
									code="label.authors" /></a></li>
						<li><a href="savecitation_books"><spring:message code="label.books" /></a></li>
						<li><a href="savecitation_lib"><spring:message code="label.genre" /></a></li>
					</ul></li>
				<li><a href="savecitation_chat"><spring:message
							code="page.chat" /></a></li>
				<li><a href="savecitation_programs"><spring:message
							code="page.prog" /></a></li>
			</ul>

		</div>
</body>
</html>