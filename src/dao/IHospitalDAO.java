package dao;

import java.util.List;
import java.util.Optional;


import model.Administrateur;
import model.Etage;
import model.Lit;
import model.Sale;

public interface IHospitalDAO {
	
	
    
    
    Administrateur login(String login,String passwd);
    List<Etage> getEtages();
    List<Sale> getSales();
    List<Sale> getSalesByEtage(int num_E);
    List<Lit> getLitsBySale(int num_sale);
    List<Lit> getLits();
    

}
