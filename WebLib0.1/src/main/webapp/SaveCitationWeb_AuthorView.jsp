<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
<script type="text/javascript" src="js/newsView_js.js"></script>
<%@ include file="pattern/main.jsp"%>
<title>Library</title>
</head>

<body>

	<div id="window">
		<div id="view">

			<table id="author_inf">
				<tr>
					<td rowspan="2"><img height="270" width="195"
						src="${author.picture}"></td>
					<td></td>
					<td><strong><spring:message code="label.name" /></strong></td>
					<td>${author.firstName}${author.lastName}</td>
				</tr>
				<tr>
					<td></td>
					<td><strong><spring:message code="label.born" /></strong></td>
					<td>${author.date}</td>
				</tr>
				<tr>
					<td colspan="4"><strong><spring:message code="label.biography" /></strong><br />${author.biography}</td>
				</tr>
			</table>
			<br /> <br /> <br /> <br /> <br /> <br /> <br /> <br /> <br />
			<br />


				<c:forEach items="${linkAuthorsBooks}" var="linkAuthorsBooks">
					<div id="books">
						<br />
						<table>
							<tr>
								<td rowspan="2" width="80"><a
									href="savecitation_viewbook_${linkAuthorsBooks.id}"><img
										src="${linkAuthorsBooks.picture}"></a></td>
								<td colspan="2">${linkAuthorsBooks.title}</td>
								<td>${linkAuthorsBooks.year}</td>
							</tr>
							<tr>
								<td colspan="4"></td>
							</tr>
							<tr>
								<td colspan="4">${linkAuthorsBooks.description}</td>
							</tr>
						</table>
						<br />
					</div>
				</c:forEach>
		</div>
	</div>


</body>
</html>