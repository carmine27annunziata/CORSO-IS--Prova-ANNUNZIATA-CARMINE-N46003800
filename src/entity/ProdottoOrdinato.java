package entity;

public class ProdottoOrdinato {
	
	private Prodotto prodotto;
	private int quantitaProdotto;
	private double prezzoTot;
	
	
	
	
	public ProdottoOrdinato(Prodotto prodotto, int quantitaProdotto) {
		super();
		this.prodotto = prodotto;
		this.quantitaProdotto = quantitaProdotto;
		this.prezzoTot = prodotto.getPrezzo() * quantitaProdotto;
	}
	
	public Prodotto getProdotto() {
		return prodotto;
	}
	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}
	public int getQuantitaProdotto() {
		return quantitaProdotto;
	}
	public void setQuantitaProdotto(int quantitaProdotto) {
		this.quantitaProdotto = quantitaProdotto;
	}

	public double getPrezzoTot() {
		return prezzoTot;
	}

	public void setPrezzoTot(double prezzoTot) {
		this.prezzoTot = prezzoTot;
	}
	

}
