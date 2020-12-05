package ScrapingWeb;

import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.eclipse.jdt.internal.compiler.ast.ReturnStatement;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

 public class GetData {
   
  public List <livre> recupererLivres()
  {
	  List <livre> livres=new ArrayList<livre>();
	  //chargement du driver 
	try {
		Class.forName("com.mysql.jdbc.Driver");
	}catch (ClassNotFoundException e) {
		System.out.println("nouha");
		}
	//connexion à la base 
	Connection connexion=null;
	Statement statement =null;
	ResultSet resultat =null ;
	try {
		connexion =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sante","root","");
		statement=(Statement) connexion.createStatement();
		//execution de la requete 
		resultat =statement.executeQuery("Select id_liv,nom_liv,auteur_liv,prix_liv,date_parution,category,descp,url from livre ");
		// Recuperatin de donnees  
		while(resultat.next())
		{
			int id=resultat.getInt("id_liv");
			String name=resultat.getString("nom_liv");
			String auteur=resultat.getString("auteur_liv");
			String prix=resultat.getString("prix_liv");
			String date =resultat.getString("date_parution");
			String categorie=resultat.getString("category");
			String desc=resultat.getString("descp");
			String url=resultat.getString("url");
			livre liv=new livre();
			liv.setId_liv(id);
			liv.setNom(name);
			liv.setAuteur(auteur);
			liv.setPrix(prix);
			liv.setDate_parution(date);
			liv.setCategory(categorie);
			liv.setDesc(desc);
			liv.setPhoto(url);
			livres.add(liv);
		}	
	}catch (SQLException ignore ) {
		System.out.println("azo");

	}finally {
		//fermeture de connexion 
		try {
			if(resultat!=null)
				resultat.close();
			if (statement!=null) 
				statement.close();
			if(connexion!=null)
			connexion.close();
			
			
		}catch(SQLException ignore) {
			System.out.println("rajaa");
		}
		
	}
	return livres;
 
}
}
	
	
	
	
