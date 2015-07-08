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

			<table id="prog_inf">
				<tr>
					<td rowspan="5"><img height="270" width="195"
						src="${prog.picture}"></td>
					<td></td>
					<td><strong><spring:message code="label.developer" /></strong></td>
					<td><a href="${prog.website}">${prog.developer}</a></td>
				</tr>
				<tr>
					<td></td>
					<td><strong><spring:message code="label.title" /></strong></td>
					<td>${prog.title}</td>
				</tr>
				<tr>
					<td></td>
					<td><strong><spring:message code="label.lang" /></strong></td>
					<td>${prog.language}</td>
				</tr>
				<tr>
					<td></td>
					<td><strong><spring:message code="label.platform" /></strong></td>
					<td>${prog.platform}</td>
				</tr>
				<tr>
					<td></td>
					<td><strong><spring:message code="label.format" /></strong></td>
					<td>${prog.format}</td>
				</tr>
			</table>

		</div>
	</div>


</body>
</html>