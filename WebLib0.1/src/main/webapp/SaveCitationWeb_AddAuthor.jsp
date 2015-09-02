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
<%@ include file="pattern/main.jsp"%>
<title>Library</title>
</head>
<body>


	<div id="window">

		<div id="addNewsForm">
			<form:form action="addAuthors" method="POST" commandName="authors">
				<form:input type="text" placeholder="Фота аўтара" id="picture"
					path="picture" />
				<br />
				<spring:message code="label.name" />
				<form:input type="text" placeholder="Імя" path="firstName" />
				<form:input type="text" placeholder="Прозвішча" path="lastName" /><br/>
				<spring:message code="label.biography" /><br/>
				<form:textarea type="text" placeholder="Біяграфія"
					path="biography" /><br/>
				<spring:message code="label.born" />
				<form:input type="text" placeholder="Год нараджэння"
					path="date" />
				<br />
				<input type="submit" value="<spring:message code="but.add"/>" />
			</form:form>
		</div>


	</div>

</body>
</html>