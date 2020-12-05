package modules;

public class profession {
	private String passwd, nom_p,prenom_p,type_pr;
	public profession() {
	 passwd="";
	 nom_p="";
	 prenom_p="";
	 type_pr="";
	}
	public profession(String passwd, String nom_p, String prenom_p, String type_pr) {
		super();
		this.passwd = passwd;
		this.nom_p = nom_p;
		this.prenom_p = prenom_p;
		this.type_pr = type_pr;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getNom_p() {
		return nom_p;
	}
	public void setNom_p(String nom_p) {
		this.nom_p = nom_p;
	}
	public String getPrenom_p() {
		return prenom_p;
	}
	public void setPrenom_p(String prenom_p) {
		this.prenom_p = prenom_p;
	}
	public String getType_pr() {
		return type_pr;
	}
	public void setType_pr(String type_pr) {
		this.type_pr = type_pr;
	}

}
