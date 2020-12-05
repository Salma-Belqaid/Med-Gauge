package connexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection {
	private static Connection connection;
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 String url       = "jdbc:mysql://localhost:3306/sante";
          	    String user      = "root";
          	    String password  ="";
          	    
          	    // create a connection to the database
          	    connection = (Connection) DriverManager.getConnection(url, user, password);
          	    System.out.println("rajaa");
			//connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sante", "root", "");
		} catch (Exception e) {
			// TODO Auto-generated catch block
		System.out.println("eeeeeeechhhhhhhhhecc");
		}
	}
	public static Connection getConnection() {
		return connection;
	}
}
