package control;

import java.util.ArrayList;
import java.util.Date;

import entity.Impiegato;
import entity.Prodotto;
import entity.ProdottoOrdinato;
import entity.Spesa;
import entity.Stato;
import entity.Utente;




public class GestioneSpese {
	
	public ArrayList<Prodotto> prodottiInseriti = new ArrayList<Prodotto>();
	public ArrayList<Utente> utentiRegistrati = new ArrayList<Utente>();
	public ArrayList<Spesa> speseEffettuate = new ArrayList<Spesa>();
	public ArrayList<Impiegato> impiegati = new ArrayList<Impiegato>();
	
	public GestioneSpese() {
	
	}
	
	public Spesa creaCarrello() {
		Date dataCorrente = new Date();
		ArrayList<ProdottoOrdinato> prodotti = new ArrayList<ProdottoOrdinato>();
		Spesa spesa = new Spesa(dataCorrente, prodotti);
		this.speseEffettuate.add(spesa);
		return spesa;
	}
	
	
	public boolean chiudiCarrello(int idSpesa) {
		for(Spesa spesa: speseEffettuate) {
			if (spesa.getId() == idSpesa) {
				spesa.setStato(Stato.ORDINATA);
				return true;
			} 
		}
		return false;
		
	}
	
	public ArrayList<Utente> generaReport(int n_report) {
		ArrayList<Utente> utentiReport = new ArrayList<Utente>();
		for(Utente utenti: utentiRegistrati) {
			if (utenti.getSpeseEffettive() >= n_report) {
				System.out.print(utenti.toString());
				utentiReport.add(utenti);
			}
		}
		if (utentiReport.size() == 0) {
			System.out.print("Nessun utente trovato per i parametri da lei inseriti. \n");
		}
		return utentiReport;
	}
	
	public void aggiungiProdotto() {
		//TODO
	}
	
	public void modificaProdotto() {
		//TODO
	}
	
	public void rimuoviProdotto() {
		//TODO
	}
	
	public void notificaFattorino() {
		//TODO
	}
	
	public boolean aggiungiProdottoCarrello(ProdottoOrdinato prodotto, int idSpesa) {
		for(Spesa spesa: speseEffettuate) {
			if (spesa.getId() == idSpesa) {
				spesa.aggiungiProdottoCarrello(prodotto);
				return true;
			}
		}
		return false;
		
	}
	
	public void rimuoviProdottoCarrello() {
		//TODO
	}

}












