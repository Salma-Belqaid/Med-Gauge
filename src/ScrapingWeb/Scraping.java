package ScrapingWeb;

import java.io.IOException;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
// la classe livre 
class msg{
	String name;
	String prix;
	String image ;
	
	public msg() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
}

public class Scraping {

	public static void main(String[] args) {

		livre_medicaux();

	}
	
	static String tab[]= {"https://www.livres-medicaux.com/dentaire.html"
			,"https://www.livres-medicaux.com/paramedical.html"
			,"https://www.livres-medicaux.com/etudiants-medecine.html"
			,"https://www.livres-medicaux.com/specialites-medicales.html"
			,"https://www.livres-medicaux.com/pediatrie.html"
			,"https://www.livres-medicaux.com/medecine-de-reeducation.html"
			,"https://www.livres-medicaux.com/imagerie-medicale.html"
			,"https://www.livres-medicaux.com/gynecologie-obstetrique.html"
			,"https://www.livres-medicaux.com/chirurgie-orthopedique.html"
			,"https://www.livres-medicaux.com/chirurgie.html"
			,"https://www.livres-medicaux.com/anesthesie-reanimation-urgences.html"
			,"https://www.livres-medicaux.com/anatomopathologie.html"
		}; 
	static void msg()
	{
		
	}
	static void livre_medicaux() 
	{
		int i;
		for(i=0;i< tab.length ;i++)
		{  
		try {
			Document doc = Jsoup.connect(tab[i]).get();
			Elements links = doc.select("div.product-shop");
			Elements categ=doc.select("h1");
			String categorie=categ.text();
			for (Element s : links) {
				livre l=new livre();
				String name = s.select("h2.product-name").text();
				Elements p= s.select("span.price").eq(0);
				String price =p.text();
				Elements a=s.select("div.do-auteur");
				String author = a.select("a").text();
				String dateP=s.select("div.do-date-parution").text();
			String description=s.select("div.desc").select("p").text();
			String src=s.select("noscript").select("img").attr("src");
			l.setDate_parution(dateP);
			l.setCategory(categorie);
			l.setPrix(price);
			l.setDesc(description);
			l.setPhoto(src);
			l.setAuteur(author);
			l.setNom(name);
			//System.out.println(l.getPhoto());
			Connection conn = null;
			try {

				//db parameters
				String url = "jdbc:mysql://localhost:3306/sante";
				String user = "root";
				String password = "";

				//create a connection to the database
				conn = (Connection) DriverManager.getConnection(url, user, password);

				Statement smt = (Statement) conn.createStatement();
				String requete = "INSERT INTO livre (nom_liv,auteur_liv, prix_liv,category,descp,date_parution,url)" + " VALUES (\""
						+l.getNom()+ "\",\""+ l.getAuteur() + "\",\""+ l.getPrix()+ "\",\"" + l.getCategory()+"\",\""+l.getDesc()
						+"\",\""+l.getDate_parution()+"\",\""+l.getPhoto()+"\")";
				smt.executeUpdate(requete);

			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			}
		} catch (IOException ex) {
			Logger.getLogger(Scraping.class.getName()).log(Level.SEVERE, null, ex);
		} //i++;
		}
	}
}
	//class="category-products"

