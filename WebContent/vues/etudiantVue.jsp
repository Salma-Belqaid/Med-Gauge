<%@ include file="header.jsp"%>
<body>

	<div class="container">
		<h2>La liste des étudiants</h2>

		<c:if test="${!empty param['info'] }">
			<div class="alert alert-info">
				<strong>Info!</strong>
				<c:out value="${param['info'] }"></c:out>
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



		<table class="table table-hover">
			<thead>
				<tr>
					<th>Nom</th>
					<th>Cin</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${etudiants }" var="etudiant">
					<tr>
						<td><c:out value="${etudiant.getNom() }"></c:out></td>
						<td><c:out value="${etudiant.getCin() }"></c:out></td>
						<td><a
							href="/GestionEtudiant/etudiant/edit?id=${etudiant.getId() }"><button
									type="button" class="btn btn-primary">Modifier</button></a> <a
							href="/GestionEtudiant/etudiant/delete?id=${etudiant.getId() }">
								<button type="button" class="btn btn-danger">Supprimer</button>
						</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<nav aria-label="Navigation for countries">
			<ul class="pagination">
				<c:if test="${currentPage != 1}">
					<li class="page-item"><a class="page-link"
						href="/GestionEtudiant/etudiant/list?recordsPerPage=${recordsPerPage}&currentPage=${currentPage-1}">Précédent</a>
					</li>
				</c:if>

				<c:forEach begin="1" end="${noOfPages}" var="i">
					<c:choose>
						<c:when test="${currentPage eq i}">
							<li class="page-item active"><a class="page-link"> ${i}
									<span class="sr-only">(current)</span>
							</a></li>
						</c:when>
						<c:otherwise>
							<li class="page-item"><a class="page-link"
								href="/GestionEtudiant/etudiant/list?recordsPerPage=${recordsPerPage}&currentPage=${i}">${i}</a>
							</li>
						</c:otherwise>
					</c:choose>
				</c:forEach>

				<c:if test="${currentPage lt noOfPages}">
					<li class="page-item"><a class="page-link"
						href="/GestionEtudiant/etudiant/list?recordsPerPage=${recordsPerPage}&currentPage=${currentPage+1}">Suivant</a>
					</li>
				</c:if>
			</ul>
		</nav>



	</div>









</body>
</html>