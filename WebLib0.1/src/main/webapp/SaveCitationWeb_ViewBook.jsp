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
<script type="text/javascript" src="js/newsView_js.js"></script>
<%@ include file="pattern/main.jsp"%>
<title>Library</title>
</head>

<body>

	<div id="window">
		<div id="view">

			<table id="book_inf">
				<tr>
					<td rowspan="4"><img height="270" width="195"
						src="${books.picture}"></td>
					<td></td>
					<td><strong><spring:message code="label.title" /></strong></td>
					<td>${books.title}</td>
				</tr>
				<tr>
					<td></td>
					<td><strong><spring:message code="label.year" /></strong></td>
					<td>${books.year}</td>
				</tr>
				<tr>
					<td></td>
					<td><strong><spring:message code="label.author" /></strong></td>
					<td><a href="savecitation_viewauthor_${books.authId}">${books.author}</a></td>
				</tr>
				<tr>
					<td></td>
					<td><strong><spring:message code="label.series" /></strong></td>
					<td>${books.series}-${books.num_series}</td>
				</tr>
				<tr>
					<td colspan="4">${books.description}</td>
				</tr>
			</table>
			<br /> <br /> <br /> <br /> <br /> <br /> <br /> <br /> <br />
			<br />
			<div id="addComment">
				<form:form action="addBookComment" method="POST"
					commandName="booksCom">
					<spring:message code="label.addComment" />
					<form:textarea id="commentText" path="comments"></form:textarea>
					<input type="submit" value="<spring:message code="but.add"/>" />
				</form:form>
			</div>


			<c:forEach items="${linkBookCom}" var="linkBookCom">
				<div class='commentClass'>
					<p>
						<strong><span id="userNameComment">${linkBookCom.userName}</span><br /></strong>
						<span id="dateComment">${linkBookCom.date}</span>
					</p>
					<p>
						<span id="comment">${linkBookCom.comments}</span>
					</p>
				</div>
			</c:forEach>
		</div>
	</div>


</body>
</html>