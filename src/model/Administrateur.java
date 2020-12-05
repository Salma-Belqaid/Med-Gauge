package model;

public class Administrateur {
	
	
	private String 	nom;
	private String 	passwd;
	
	public Administrateur() {
		super();
	}

	public Administrateur(String nom, String passwd) {
		super();
		
		this.nom = nom;
		this.passwd = passwd;
	}

	
	public String getLogin() {
		return nom;
	}

	public void setLogin(String nom) {
		this.nom = nom;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Override
	public String toString() {
		return "Administrateur [ login=" + nom + ", passwd=" + passwd + "]";
	}
	
	

}
