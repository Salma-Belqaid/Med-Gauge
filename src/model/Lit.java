package model;

public class Lit {

	private int 	num_lit;
	private int etat_serum;
	private int num_sale;
	
	public Lit() {
		super();
	}

	public Lit(int num_lit, int etat_serum, int num_sale) {
		super();
		this.num_lit = num_lit;
		this.etat_serum = etat_serum;
		this.num_sale = num_sale;
	}

	public int getNum_lit() {
		return num_lit;
	}

	public void setNum_lit(int num_lit) {
		this.num_lit = num_lit;
	}

	public int getEtat_serum() {
		return etat_serum;
	}

	public void setEtat_serum(int etat_serum) {
		this.etat_serum = etat_serum;
	}

	public int getNum_sale() {
		return num_sale;
	}

	public void setNum_sale(int num_sale) {
		this.num_sale = num_sale;
	}

	@Override
	public String toString() {
		return "Lit [num_lit=" + num_lit + ", etat_serum=" + etat_serum + ", num_sale=" + num_sale + "]";
	}
	
	
}
