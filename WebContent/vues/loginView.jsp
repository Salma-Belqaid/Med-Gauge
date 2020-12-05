<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Hospital</title>

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/bootstrap/css/bootstrap-theme.min.css">

</head>
<body>


	<div class="container">

		<h3>Authentification</h3>
		<form action="/Scraping/authentifier"
			class="form-horizontal" method="post">
			<div class="form-group">
				<label for="login" class="col-xs-2 control-label">Login</label>
				<div class="col-xs-4">
					<input type="text" class="form-control" id="login"
						name="login">
				</div>
			</div>
			<div class="form-group">
				<label for="passwd" class="col-xs-2 control-label">Password</label>
				<div class="col-xs-4">
					<input type="password" class="form-control" id="passwd"
						name="passwd">
				</div>
			</div>
			<div class="form-group">
				<div class="col-xs-offset-2 col-xs-4">
					<button type="submit" class="btn btn-default">Login</button>
				</div>
			</div>
		</form>
		<a href="http://localhost:8080/Scraping/rajaa">  OFF</a>
	</div>


	<script
		src="${pageContext.request.contextPath}/jquery/jquery-3.4.1.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>

</body>
</html>