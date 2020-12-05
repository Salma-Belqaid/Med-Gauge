package ScrapingWeb;

public class livre {
	int id_liv;
	String nom;
	String auteur;
	String prix;
	String lien;
	String category;
	String desc;
	String date_parution;
	String photo;
	public livre() {
		super();
	}
	
	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public int getId_liv() {
		return id_liv;
	}

	public void setId_liv(int id_liv) {
		this.id_liv = id_liv;
	}

	public String getDate_parution() {
		return date_parution;
	}

	public void setDate_parution(String date_parution) {
		this.date_parution = date_parution;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}
	public String getLien() {
		return lien;
	}
	public void setLien(String lien) {
		this.lien = lien;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}

