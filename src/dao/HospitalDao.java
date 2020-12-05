package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import model.Administrateur;
import model.Etage;
import model.Lit;
import model.Sale;

public class HospitalDao implements IHospitalDAO {
	
	private DaoFactory daoFactory;

	public HospitalDao(DaoFactory daoFactory) {
		super();
		this.daoFactory = daoFactory;
	}

	
	public Administrateur login(String login, String passwd) {
		String sql="select * from profession where nom_p=? and passwd=?";
		
		String _login="";
		String _passwd="";
		try {
			Connection connection=this.daoFactory.getConnection();
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1, login);
			ps.setString(2, passwd);
			ResultSet rs=ps.executeQuery();
			if (rs.next()) {
				
				_login=rs.getString("nom_p");
				_passwd=rs.getString("passwd");
				
				return new Administrateur( _login, _passwd);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("erreur en connexion de BD ");
		}
		return null;
	}

	@Override
	public
	 List<Sale> getSalesByEtage(int num_E){
	    List<Sale> sales = new ArrayList<Sale>();
        Connection connexion = null;
        Statement statement = null;
        ResultSet resultat = null;

        try {
            connexion = daoFactory.getConnection();
            statement = connexion.createStatement();
            resultat = statement.executeQuery("SELECT * FROM sale where num_E="+num_E+" ;");

            while (resultat.next()) {
            	int num_sale=resultat.getInt("num_sale");
            	int 	nbr_lit=resultat.getInt("nbr_lit");
            	int 	_num_E=resultat.getInt("num_E");
              

                Sale sale=new Sale(num_sale, nbr_lit, _num_E, null);

                sales.add(sale);
            }
        } catch (SQLException e) {
        	e.getStackTrace();
        }
        return sales;
	 }
	@Override
	public
	 List<Lit> getLitsBySale(int num_sale){
		   List<Lit> lits = new ArrayList<Lit>();
	        Connection connexion = null;
	        Statement statement = null;
	        ResultSet resultat = null;

	        try {
	            connexion = daoFactory.getConnection();
	            statement = connexion.createStatement();
	            resultat = statement.executeQuery("SELECT * FROM lit where num_sale="+num_sale+";");

	            while (resultat.next()) {
	            	int num_lit=resultat.getInt("num_lit");
	            	int 		etat_serum=resultat.getInt("etat_serum");
	            	int 	_num_sale=resultat.getInt("num_sale");
	              

	                Lit lit=new Lit(num_lit, etat_serum, _num_sale);

	                lits.add(lit);
	            }
	        } catch (SQLException e) {
	        	e.getStackTrace();
	        }
	        return lits;
	 }
	@Override
	public List<Etage> getEtages() {
	       List<Etage> etages = new ArrayList<Etage>();
	        Connection connexion = null;
	        Statement statement = null;
	        ResultSet resultat = null;

	        try {
	            connexion = daoFactory.getConnection();
	            statement = connexion.createStatement();
	            resultat = statement.executeQuery("SELECT * FROM etage;");

	            while (resultat.next()) {
	            	int num_E=resultat.getInt("num_E");
	            	int 	nbr_sale=resultat.getInt("nbr_sale");
	              

	                Etage etage =new Etage(num_E, nbr_sale, null);

	                etages.add(etage);
	            }
	        } catch (SQLException e) {
	        	e.getStackTrace();
	        }
	        return etages;
	}

	@Override
	public List<Sale> getSales() {
	    List<Sale> sales = new ArrayList<Sale>();
        Connection connexion = null;
        Statement statement = null;
        ResultSet resultat = null;

        try {
            connexion = daoFactory.getConnection();
            statement = connexion.createStatement();
            resultat = statement.executeQuery("SELECT * FROM sale;");

            while (resultat.next()) {
            	int num_sale=resultat.getInt("num_sale");
            	int 	nbr_lit=resultat.getInt("nbr_lit");
            	int 	num_E=resultat.getInt("num_E");
              

                Sale sale=new Sale(num_sale, nbr_lit, num_E, null);

                sales.add(sale);
            }
        } catch (SQLException e) {
        	e.getStackTrace();
        }
        return sales;
	}

	@Override
	public List<Lit> getLits() {
		   List<Lit> lits = new ArrayList<Lit>();
	        Connection connexion = null;
	        Statement statement = null;
	        ResultSet resultat = null;

	        try {
	            connexion = daoFactory.getConnection();
	            statement = connexion.createStatement();
	            resultat = statement.executeQuery("SELECT * FROM lit;");

	            while (resultat.next()) {
	            	int num_lit=resultat.getInt("num_lit");
	            	int 		etat_serum=resultat.getInt("etat_serum");
	            	int 	num_sale=resultat.getInt("num_sale");
	              

	                Lit lit=new Lit(num_lit, etat_serum, num_sale);

	                lits.add(lit);
	            }
	        } catch (SQLException e) {
	        	e.getStackTrace();
	        }
	        return lits;
	}


	
	
}
