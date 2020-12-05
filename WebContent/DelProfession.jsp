<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.row {
margin-height: 20px;
margin-bottom: 20px;

}
.col-md-6{width:2000 px; height:30px padding-height:30px; }
td {background-color: #00FFFF; height : 30px; weight:100px;}
.btn{width:300px; background-color:#008080; color:white;font-weight: bold;}
h1{ background-color:#F0FFF0;font-weight: bold;text-align: center; }
.container {background-color:#F0FFF0;}
table{margin-top:40px;}
img{height : 200px; weight:600px;margin-left:450px;}
body{background-color: coral;}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
       <h1>MedGauge</h1>
  <img src="C:\Users\hp\Desktop\Ensak\s7\Java\projets\Scraping\WebContent\java.PNG"  />
       <div>
    	<form  method="post" action="delser" >
    		<table class="table table-striped">
				<tr>
					<td>Nom :</td>
					<td><input type="text" name="nom_p"  value="" /></td>
						<td></td>
				</tr>
				<tr>
    				<td>Prenom :</td>
    				<td><input type="text" name="prenom_p" value=""/></td>
    				<td></td>
    			</tr>
    			<tr>
    				<td>Categorie :</td>
    				<td><input type="text" name="type_pr" value=""/></td>
    				<td></td>
    			</tr>
    			<tr>
    				<td>Password :</td>
    				<td><input type="text" name="passwd" value=""/></td>
    				<td></td>
    			</tr>
    			
    		</table>
    		   <center><input type="submit" name="action" value="delete" class="btn btn-outline-info"/></center>
    			<!--<td><input type="submit" name="action" value="edit"/></td>
    			<td><input type="submit" name="action" value="delete"/></td>-->
    	</form>
    </div>
   
</body>
</html>