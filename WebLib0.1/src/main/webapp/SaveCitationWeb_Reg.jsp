<%@ include file="pattern/include.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" 
  "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="style_reg.css">
<script type='text/javascript'
	src='http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js'></script>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/reg_js.js"></script>
<script type="text/javascript" src="js/ajax.js"></script>
<title>Library</title>
</head>

<body onload="run()">

	<div class="mainblock">
		<a href="savecitation"><p id="welcomtext">
				<spring:message code="label.welcom" />
			</p></a>

		<div id="registration">
			<div id="regiselement">
				<p align="center" id="rules">
					<a href="savecitation"><spring:message code="label.redirect" /></a>
				</p>
				<br>
				<p align="center">
					<input id="name" class="regtext" type="text" size="40"
						placeholder="Імя"></input>
				</p>
				<p align="center">
					<input id="lastname" class="regtext" type="text" size="40"
						placeholder="Прозвішча"></input>
				</p>
				<p align="center">
					<input id="password" class="regtext" type="password" size="40"
						placeholder="Пароль"></input>
				</p>
				<p align="center">
					<input id="repeatpassword" class="regtext" type="password"
						size="40" placeholder="Паўтарыце пароль"></input>
				</p>
				<p align="center">
					<input id="email" class="regtext" type="text" size="40"
						placeholder="email"></input>
				</p>
				<p align="center" id="rules">
					<a href="savecitation_rule"><spring:message
							code="label.readRule" /></a>
				</p>
				<p align="center">
					<button id="notaccept" onclick="returneToMainPage()">
						<spring:message code="but.notAccept" />
					</button>
					<button id="accept" onclick="sendMessageToServer()">
						<spring:message code="but.accept" />
					</button>
				</p>
			</div>
		</div>

	</div>


</body>
</html>

