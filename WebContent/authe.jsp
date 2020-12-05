<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
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
img{width:200 px; height:500 cm }
</style>
<head>
<meta charset="ISO-8859-1">
<title>Administrateur</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

</head>
<body>
<h1>Username</h1>
  <img src="C:\Users\hp\Desktop\Ensak\s7\Java\projets\Scraping\WebContent\java.PNG"  />
<div class="container">
<div>
	<form action="ValiderAdmin"  method="post">
		
		<div class="row"><div class="col-md-6"><label>login:  </label></div><p><div class="col-md-6"><input type="text"  name="user" id="user"></p></div></div>
		<div class="row"><div class="col-md-6"><label>password: </label></div><p><div class="col-md-6"><input type="password"  name="pass" id="pass"></p></div></div>
		<div class="row"><div class="col-md-8"><p><input type="submit"  name="entrer" id="entrer" value="entrer" class="btn btn-outline-info"></p></div></div>
	</form>
</div>
</div>
</body>
</html>