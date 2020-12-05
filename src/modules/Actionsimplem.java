package modules;
import java.sql.Connection;
import connexion.connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.Soundbank;

import com.mysql.jdbc.Statement;

public class Actionsimplem implements action {
	public void addprofession(profession p) {
		Connection conn=connection.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("insert into profession values (?,?,?,?)");
		    ps.setString(1, p.getNom_p());
		    ps.setString(2, p.getPrenom_p());
		    ps.setString(3, p.getType_pr());
		    ps.setString(4, p.getPasswd());
		    ps.executeUpdate();
		    //ps.executeQuery();
		    //ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("erreur ");
		}
		
	};
	
	public void deleteprofession(profession p) {
		Connection conn=connection.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("delete FROM profession where nom_p= ? and prenom_p= ? and type_pr= ? and passwd= ?");
		    ps.setString(1, p.getNom_p());
		    ps.setString(2, p.getPrenom_p());
		    ps.setString(3, p.getType_pr());
		    ps.setString(4, p.getPasswd());
		    ps.executeUpdate();
		   // ps.close();
		} catch (SQLException e) {
			System.out.println("erreur de connexion  ");
		}
	};

		public void updateprofession(profession p) {
			Connection conn=connection.getConnection();
			try {
				Statement smt = (Statement) conn.createStatement();
	
				ResultSet sql=smt.executeQuery("select * from profession ");
				while(sql.next())
				{
					System.out.println("password de bd  : "+sql.getString("passwd"));
					String pass= p.getPasswd();
					System.out.println("hahiya pass liktbti"+pass);
					if(p.getPasswd()!=sql.getString("passwd"))
					{
						String name =p.getNom_p();
						System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
						String requete="update profession set nom_p='"+name+"'";
						smt.executeUpdate(requete);
					}
					
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("ereeur");
			}

			
		}

		@Override
		public boolean authentifier( administrateur p ) {
			Connection conn=connection.getConnection();
			String pass=p.getPasswd();
			String user=p.getLogin();
			
			Statement st;
			try {
				st = (Statement) conn.createStatement();
				
				String consulter="SELECT * FROM administrateur" ;
				ResultSet rs=st.executeQuery(consulter);
				
				while(rs.next()) {
					
					if(user.equals(rs.getString("login"))&&pass.equals(rs.getString("passwd"))) 
					{
						
						return true;
					}
					
						
						
				}
			} catch (SQLException e) {
				
				System.out.println("salma");
			}
			
			
			return false;
			
		}
	

}
