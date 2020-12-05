<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.row {
margin-height: 20px;
margin-bottom: 20px;

}
.col-md-6{width:2000 px; height:30px padding-height:30px; }
tr {background-color: #00FFFF;}
.btn{width:300px; background-color:#008080; color:white;font-weight: bold;}
h1{ background-color:#F0FFF0;font-weight: bold;text-align: center;}
.container {background-color:#F0FFF0;}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>rajaa</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  
  </head>
 <body >
 <h1>cat�gorie des livres</h1>
 <div class="container">
 <div class="row">
<div class="col-md-6"><a href="#Livres Dentaire" > <input type="button" class="btn btn-outline-info" value="Livres Dentaire" > </a></div>
<div class="col-md-6"><a href="#Livres Param�dical" target="_blank"> <input type="button" value="Livres Param�dical" class="btn btn-outline-info"> </a></div>
</div>
<div class="row">
<div class="col-md-6"><a href="#Livres Etudiants M�decine" > <input type="button" value="Livres Etudiants M�decine" class="btn btn-outline-info"> </a></div>
<div class="col-md-6"><a href="#Livres Autres sp�cialit�s m�dicales" > <input type="button" value="Livres Autres sp�cialit�s m�dicales" class="btn btn-outline-info"> </a></div>
</div>
<div class="row">
<div class="col-md-6"><a href="#Livres P�diatrie" > <input type="button" value="Livres P�diatrie" class="btn btn-outline-info"> </a></div>
<div class="col-md-6"><a href="#Livres M�decine de r��ducation" target="_blank"> <input type="button" value="Livres M�decine de r��ducation" class="btn btn-outline-info"> </a></div>
</div>
<div class="row">
<div class="col-md-6"><a href="#Livres d'imagerie m�dicale" target="_blank"> <input type="button" value="Livres d'imagerie m�dicale" class="btn btn-outline-info"> </a></div>
<div class="col-md-6"><a href="#Livres Gyn�cologie-Obst�trique" target="_blank"> <input type="button" value="Livres Gyn�cologie-Obst�trique" class="btn btn-outline-info"> </a></div>
</div>
<div class="row">
<div class="col-md-6"><a href="#Livres Chirurgie orthop�dique" target="_blank"> <input type="button" value="Livres Chirurgie orthop�dique" class="btn btn-outline-info"> </a></div>
<div class="col-md-6"><a href="#Livres Gyn�cologie-Obst�trique" target="_blank"> <input type="button" value="Livres Gyn�cologie-Obst�trique" class="btn btn-outline-info"> </a></div>
</div>
<div class="row">
<div class="col-md-6"><a href="#Livres-Chirurgie" target="_blank"> <input type="button" value="Livres-Chirurgie" class="btn btn-outline-info"> </a></div>
<div class="col-md-6"><a href="#Livres Anesth�sie-R�animation-Urgences" target="_blank"> <input type="button" value="Livres Anesth�sie-R�animation-Urgences" class="btn btn-outline-info"> </a></div>
</div>
<div class="row">
<div class="col-md-6"><a href="#Livres Anatomo-Pathologie" target="_blank"> <input type="button" value="Livres Anatomo-Pathologie" class="btn btn-outline-info"> </a></div>
</div>
</div>
<c:forEach var="livre" items="${livres}" >
<h4 id="${livre.category}"><c:out value="${livre.category}"/></h4>
  <table  class="table table-striped" >
    <!-- here should go some titles... -->
    <tr>
        <th>NOM</th>
        <th>AUTEUR</th>
        <th>PRIX</th>
        <th>CATEGORY</th>
        <th>DESCRIPTION</th>
		<th>DATE DE PARUTION</th>
		<th>PHOTO</th>        
    </tr>
    <tr>
        <td>
            <c:out value="${livre.nom}" />
        </td>
        <td>
            <c:out value="${livre.auteur}" />
        </td>
        <td>
            <c:out value="${livre.prix}" />
        </td>
        <td>
            <c:out value="${livre.category}" />
        </td>
         <td>
            <c:out value="${livre.desc}" />
        </td> 
        <td>
            <c:out value="${livre.date_parution}" />
        </td>
        <td>
            <img src="${livre.photo}" />
        </td>
    </tr>
    
</table>
</c:forEach>
</body>
</html>