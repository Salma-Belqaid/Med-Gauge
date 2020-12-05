package model;

import java.util.List;

public class Sale {

	private int 	num_sale;
	private int nbr_lit;
	private int num_E;
	private List<Lit> lits;
	
	public Sale() {
		super();
	}

	public Sale(int num_sale, int nbr_lit, int num_E, List<Lit> lits) {
		super();
		this.num_sale = num_sale;
		this.nbr_lit = nbr_lit;
		this.num_E = num_E;
		this.lits = lits;
	}

	public int getNum_sale() {
		return num_sale;
	}

	public void setNum_sale(int num_sale) {
		this.num_sale = num_sale;
	}

	public int getNbr_lit() {
		return nbr_lit;
	}

	public void setNbr_lit(int nbr_lit) {
		this.nbr_lit = nbr_lit;
	}

	public int getNum_E() {
		return num_E;
	}

	public void setNum_E(int num_E) {
		this.num_E = num_E;
	}

	public List<Lit> getLits() {
		return lits;
	}

	public void setLits(List<Lit> lits) {
		this.lits = lits;
	}

	@Override
	public String toString() {
		return "Sale [num_sale=" + num_sale + ", nbr_lit=" + nbr_lit + ", num_E=" + num_E + ", lits=" + lits + "]";
	}

	
	
	
}
