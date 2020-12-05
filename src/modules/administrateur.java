package modules;

public class administrateur {
	public String login;
	public String passwd;

	public administrateur() {
		
		 login="";
		 passwd="";
	}

	public administrateur(String login, String passwd) {
		this.login = login;
		this.passwd = passwd;
	}

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

}
