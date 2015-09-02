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

	<div id="addNews" align="center">
		<!-- <input type="text" placeholder="Назва" size="26" id="title">
		<textarea placeholder="Апісанне" id="description" rows="5" cols="22"></textarea>
		<textarea placeholder="Навіна" id="news" rows="13" cols="22"></textarea>
		<button id="add">
			<spring:message code="but.add" />
		</button>-->
		<a href="addAuthorPage"><spring:message code="label.addAuthor" /></a>
	</div>
	<div id="window">

		<div id="authorsBlock">
			<c:forEach items="${allAuthors}" var="allAuthors">
				<div id="allAuthors">
					<table width="600px">
						<tr>
							<td width="100px" rowspan="3"><a
								href="savecitation_viewauthor_${allAuthors.id}"><img
									height="125" width="100" src="${allAuthors.picture}"></a></td>
						</tr>
						<tr>
							<td width="100px"><spring:message code="label.author" />
							<td><a href="savecitation_viewauthor_${allAuthors.id}">${allAuthors.id}
									- ${allAuthors.firstName} ${allAuthors.lastName}</a></td>
						</tr>
					</table>
				</div>
			</c:forEach>

		</div>

	</div>



</body>
</html>