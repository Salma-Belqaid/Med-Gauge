
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<c:set var="pagina" value="${requestScope['javax.servlet.forward.request_uri']}" />

<%@ include file="include.jsp" %>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="/GestionEtudiant/etudiant/list?recordsPerPage=6&currentPage=1">Gestion des étudiants</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="${pagina.endsWith('/list') ? 'active' : ''}"><a href="/GestionEtudiant/etudiant/list?recordsPerPage=6&currentPage=1">Accueil</a></li>
      <li class="${pagina.endsWith('/new') ? 'active' : ''}"><a href="/GestionEtudiant/etudiant/new">Ajouter un étudiant</a></li>
    </ul>
  </div>
</nav>