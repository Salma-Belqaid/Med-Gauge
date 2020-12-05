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

		<h2>Etages</h2>

		<form action="/Scraping/sale" class="form-horizontal"
			method="post">
			<div class="form-group">
				<label for="etage" class="col-xs-2 control-label">Etage</label>
				<div class="col-xs-4">
				
					<select name='etage' class="form-control" id="etage" >
					
						<c:forEach items="${etages}" var="etage">
						
								<option value="${etage.getNum_E()}">${etage.getNum_E()}</option>
					
						</c:forEach>
					</select>
				</div>
			</div>
			<div class="form-group">
				<div class="col-xs-offset-2 col-xs-4">
					<button type="submit" class="btn btn-default">suivant</button>
				</div>
			</div>
		</form>


	</div>


	<script
		src="${pageContext.request.contextPath}/jquery/jquery-3.4.1.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>

</body>
</html>