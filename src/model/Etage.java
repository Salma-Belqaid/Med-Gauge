package model;

import java.util.List;

public class Etage {

	private int num_E;
	private int nbr_sale;
	private List<Sale> sales;
	
	public Etage() {
		super();
	}

	public Etage(int num_E, int nbr_sale, List<Sale> sales) {
		super();
		this.num_E = num_E;
		this.nbr_sale = nbr_sale;
		this.sales = sales;
	}

	public int getNum_E() {
		return num_E;
	}

	public void setNum_E(int num_E) {
		this.num_E = num_E;
	}

	public int getNbr_sale() {
		return nbr_sale;
	}

	public void setNbr_sale(int nbr_sale) {
		this.nbr_sale = nbr_sale;
	}

	public List<Sale> getSales() {
		return sales;
	}

	public void setSales(List<Sale> sales) {
		this.sales = sales;
	}

	@Override
	public String toString() {
		return "Etage [num_E=" + num_E + ", nbr_sale=" + nbr_sale + ", sales=" + sales + "]";
	}

	
	
}
