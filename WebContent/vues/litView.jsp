<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Hospital</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/bootstrap/css/bootstrap-theme.min.css">

</head>
<body>


	<div class="container">

		<h2>Lits</h2>
		<table border="2"  class="table table-striped">
		<tr>
		<td>num_lit</td>
		<td>etat_serum</td>
		<td>num_sale</td>
		</tr>
                <c:forEach items="${lits}" var="lit">
                    <tr>
                        <td>${lit.getNum_lit()}</td>
                      <td>${lit.getEtat_serum()}</td>
                        <td>${lit.getNum_sale()}</td>
                    </tr>
                </c:forEach>

            </table>

	</div>


	<script
		src="${pageContext.request.contextPath}/jquery/jquery-3.4.1.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>

</body>
</html>