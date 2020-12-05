<%@ include file="header.jsp"%>
<body>

	<div class="container">
		<c:if test="${!empty titre }">
			<h2>
				<c:out value="${titre }"></c:out>
			</h2>
		</c:if>



		<c:if test="${!empty sucess }">
			<div class="alert alert-success">
				<strong>Success!</strong>
				<c:out value="${sucess }"></c:out>
				.
			</div>
		</c:if>
		<c:if test="${!empty param['danger']  }">
			<div class="alert alert-danger">
				<strong>Danger!</strong>
				<c:out value="${param['danger']  }"></c:out>
				.
			</div>
		</c:if>



		<c:if test="${e==null }">
			<form action="/GestionEtudiant/etudiant/insert" method="post">
		</c:if>
		<c:if test="${e!=null }">
			<form action="/GestionEtudiant/etudiant/update" method="post">
		<div class="form-group">
			 <input type="hidden"
				value="<c:out value='${e.getId() }'/>" class="form-control" name="id"
				id="id" >
		</div>
		</c:if>
	

		<div class="form-group">
			<label for="nom">Nom:</label> <input type="text"
				value="<c:out value='${e.getNom() }'/>" class="form-control" name="nom"
				id="nom">
		</div>
		<div class="form-group">
			<label for="cin">Cin:</label> <input type="text"
				value="<c:out value='${e.getCin() }'/>" class="form-control" name="cin"
				id="cin">
		</div>
		<button type="submit" class="btn btn-default">Valider</button>
		</form>

	</div>






</body>
</html>