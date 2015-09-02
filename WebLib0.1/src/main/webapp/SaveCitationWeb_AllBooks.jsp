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


	<div id="window">

		<div id="booksBlock">
			<c:forEach items="${allBooks}" var="allBooks">
				<div id="allBooks">
					<table width="600px">
						<tr>
							<td width="100px" rowspan="3"><a
								href="savecitation_viewbook_${allBooks.id}"><img
									height="125" width="75" src="${allBooks.picture}"></a></td>
							<td width="100px"><spring:message code="label.year" /></td>
							<td colspan="2">${allBooks.year}</td>
						</tr>
						<tr>
							<td width="100px"><spring:message code="label.author" />
							<td><a href="savecitation_viewauthor_${allBooks.authId}">${allBooks.author}</a></td>
						</tr>
						<tr>
							<td width="100px"><spring:message code="label.title" /></td>
							<td>${allBooks.title}</td>
						</tr>
					</table>
				</div>
			</c:forEach>

		</div>

	</div>



</body>
</html>