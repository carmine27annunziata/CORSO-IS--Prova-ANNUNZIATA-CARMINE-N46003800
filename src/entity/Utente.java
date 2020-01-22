package entity;

import java.util.ArrayList;

public class Utente {
	
	private int identificativo;
	private static int utente_counter = 0;

	private String nomeUtente;
	private String passwordUtente;
	private String cellUtente;
	private String cartaCreditoUtente; 

	
	private ArrayList<Spesa> spese = new ArrayList<Spesa>();
	
	
	public Utente(String nomeUtente, String passwordUtente, String cellUtente,
			String cartaCreditoUtente) {
		super();
		this.identificativo = utente_counter++;
		this.nomeUtente = nomeUtente;
		this.setPasswordUtente(passwordUtente);
		this.setCellUtente(cellUtente);
		this.setCartaCreditoUtente(cartaCreditoUtente);
	}

	
	
	@Override
	public String toString() {

		StringBuffer buf = new StringBuffer();
		double totaleEuro = 0.0; 
		
		buf.append("Utente:" + this.identificativo + "\n");
		buf.append("Nome: " + this.nomeUtente + "\n");
		buf.append("NumeroTelefonico: " + this.cellUtente + "\n");
		buf.append("Numero Spese: " + spese.size() + "\n");
		
		for (Spesa s : this.spese) {
			buf.append("  Spesa  \n");
			buf.append(s.toString());
			totaleEuro = totaleEuro + s.getCosto();
		}
		buf.append("Euro totali spesi: " + totaleEuro +"\n");
		
		return buf.toString();
	}
	
	public int getId() {
		return this.identificativo;
	}

	
	public ArrayList<Spesa> getSpese() {
		return spese;
	}

	public void setSpese(ArrayList<Spesa> spese) {
		this.spese = spese;
	}

	public String getNome() {
		return this.nomeUtente;
	}
	
	public int getNumSpese () {
		return this.spese.size();
	}
	
	public int getSpeseEffettive() {
		int speseEffettive = 0;
		for(Spesa s: spese) {
			if (s.getStato() == Stato.ORDINATA || s.getStato() == Stato.CONSEGNATA){
				speseEffettive += 1;
			}
		}
		return speseEffettive;
	}
	
	
	public void addSpesa (Spesa newSpesa) {
		this.spese.add(newSpesa);
		
	}

	public String getPasswordUtente() {
		return passwordUtente;
	}

	public void setPasswordUtente(String passwordUtente) {
		this.passwordUtente = passwordUtente;
	}

	public String getCellUtente() {
		return cellUtente;
	}

	public void setCellUtente(String cellUtente) {
		this.cellUtente = cellUtente;
	}

	public String getCartaCreditoUtente() {
		return cartaCreditoUtente;
	}

	public void setCartaCreditoUtente(String cartaCreditoUtente) {
		this.cartaCreditoUtente = cartaCreditoUtente;
	}
	
	
}
