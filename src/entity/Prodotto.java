package entity;

public class Prodotto {

	private static int prodotto_counter = 0;
	private int identificativo;
	private String codiceProdotto;
	private String nomeProdotto;
	private String descrProdotto;
	private double prezzo;
	private int n_Pezzi;
	
	public Prodotto(String nome, double prezzo, int quantita){
		this.identificativo = ++prodotto_counter;
		this.nomeProdotto = nome;
		this.prezzo = prezzo;
		this.n_Pezzi = quantita;
	}
	
	
	public String getNomeProdotto() {
		return this.nomeProdotto ;
	}
	
	public int getId() {
		return this.identificativo;
	}
	
	public String getDescr() {
		return this.descrProdotto;
	}
	
	public double getPrezzo() {
		return this.prezzo;
	}
	
	public int getNumPezzi() {
		return this.n_Pezzi;
	}
	
	public String getCodiceProdotto() {
		return this.codiceProdotto;
	}
	
	public void setNomeProdotto(String nome) {
		this.nomeProdotto = nome;
	}
	
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	
}
