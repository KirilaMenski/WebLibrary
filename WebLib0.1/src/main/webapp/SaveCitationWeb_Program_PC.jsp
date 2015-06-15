<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" 
  "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="style.css">
<script type='text/javascript'
	src='http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js'></script>
<script type="text/javascript" src="js/jquery.js"></script>
<title>Library</title>
</head>

<body>

	<div class="mainblock">
		<a href="SaveCitationWeb.jsp"><p id="welcomtext">
				<spring:message code="label.welcom" />
			</p></a>

		<div id="baner">
			<marquee scrollamount="10">
				<a href="SaveCitationWeb.jsp"><img src="image/Ornament.bmp"></a>
			</marquee>
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
		<div id="window">
			<div id="text">
				<ul>
					<li><a href="http://www.alreader.com/">AlReader 2.5</a></li>
					<li><a href="http://coolreader.org/">Coolreader</a></li>
					<li><a href="http://www.msolt.chat.ru/">Book Seer</a></li>
					<li><a href="http://www.fbreader.org">FBReader</a></li>
					<li><a href="http://haali.cs.msu.ru/">Haali Reader 2</a></li>
					<li><a href="http://www.ice-graphics.com/">Ice Book Reader
							Professional</a></li>
					<li><a href="http://www.text-reader.com">BookShelf v5.00</a></li>
					<li><a href="http://windjview.sourceforge.net/">WinDjView</a></li>
					<li><a href="http://www.adobe.com/">Adobe Reader</a></li>
					<li><a href="http://www.bravaviewer.com">Brava Reader</a></li>
					<li><a href="http://www.visagesoft.com">eXPert PDF Reader</a></li>
					<li><a href="http://www.foxitsoftware.com">Foxit Reader</a></li>
					<li><a href="http://blog.kowalczyk.info/software/sumatrapdf">Sumatra
							PDF</a></li>
					<li><a href="http://www.docu-track.com">PDF-XChange Viewer</a></li>
					<li><a href="http://textory.ru/node/28">ExRe</a></li>
					<li><a href="http://tomreader.chat.ru/">ToM Reader</a></li>
					<li><a
						href="http://www.ice-graphics.com/ICEReader/IndexR.html">BookReader</a></li>
					<li><a href="http://freesoft.ru/bookview">BookView</a></li>
				</ul>
			</div>
		</div>

	</div>


</body>
</html>