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

	<sec:authorize access="hasRole('ADMIN')">
		<div id="addNews" align="center">
			<!-- <input type="text" placeholder="Назва" size="26" id="title">
		<textarea placeholder="Апісанне" id="description" rows="5" cols="22"></textarea>
		<textarea placeholder="Навіна" id="news" rows="13" cols="22"></textarea>
		<button id="add">
			<spring:message code="but.add" />
		</button>-->
			<a href="addBooksPage"><spring:message code="label.addBooks" /></a>
		</div>
	</sec:authorize>


	<div id="window">

		<div id="genreBlock">
			<c:forEach items="${genreBooks}" var="genreBooks">
				<div id="genre_books">
					<table width="600px">
						<tr>
							<td width="100px" rowspan="3"><a
								href="savecitation_viewbook_${genreBooks.id}"><img
									height="125" width="75" src="${genreBooks.picture}"></a></td>
							<td width="100px"><spring:message code="label.year" /></td>
							<td colspan="2">${genreBooks.year}</td>
						</tr>
						<tr>
							<td width="100px"><spring:message code="label.author" />
							<td><a href="savecitation_viewauthor_${genreBooks.authId}">${genreBooks.author}</a></td>
						</tr>
						<tr>
							<td width="100px"><spring:message code="label.title" /></td>
							<td>${genreBooks.title}</td>
						</tr>
					</table>
				</div>
			</c:forEach>

		</div>

	</div>



</body>
</html>