package entity;

import java.util.Date;
import java.util.ArrayList;

public class Spesa {
	
	private int identificativo;
	private static int spesa_counter = 0;
	private Date dataSpesa;
	private double costoTotale;
	private Stato stato;
	private ArrayList<ProdottoOrdinato> prodotti = new ArrayList<ProdottoOrdinato>();
	
	
	

	public Spesa(Date dataSpesa, ArrayList<ProdottoOrdinato> prodotti) {
		this.identificativo  = ++spesa_counter;
		this.dataSpesa = new Date();
		this.prodotti = prodotti;
		this.setStato(Stato.IN_CORSO);
		
	}
	
	public void completaOrdine() {
		this.setStato(Stato.ORDINATA);
	}
	
	public void consegnaOrdine() {
		this.setStato(Stato.CONSEGNATA);
	}
	
	@Override
	public String toString() {

		StringBuffer buf = new StringBuffer();
		
		buf.append("[Spesa num:" + this.identificativo + "\n");
		buf.append("Effettuata il: " + this.dataSpesa + "\n");
		buf.append("Costo: " + this.costoTotale + "\n");
		buf.append("Stato spesa " + this.stato +"]\n");
		
		return buf.toString();
	}
	
	public double getCosto() {
		return costoTotale;
	}
	
	public void addCosto(ProdottoOrdinato prodotto) {
		this.costoTotale += prodotto.getPrezzoTot();
	}
	
	public int getId() {
		return this.identificativo;
	}
	
	public ArrayList<ProdottoOrdinato> getProdotti(){
		return this.prodotti;
	}
	
	public void aggiungiProdottoCarrello(ProdottoOrdinato newProdotto) {
		this.prodotti.add(newProdotto);
	}

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}
	

}
