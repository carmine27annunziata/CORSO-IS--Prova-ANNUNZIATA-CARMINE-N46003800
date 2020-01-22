package ESAME_IS_N46003800_TEST;

import control.*;
import entity.*;


public class Main {

	public static void main(String[] args) {
		
		GestioneSpese gestore_spese = new GestioneSpese();
		
		gestore_spese.prodottiInseriti.add(new Prodotto("Dixan", 2.5, 100));
		gestore_spese.prodottiInseriti.add(new Prodotto("Lucentiere", 1.0, 70));
		gestore_spese.prodottiInseriti.add(new Prodotto("Svelto", 3.5, 40));
		gestore_spese.prodottiInseriti.add(new Prodotto("AcmeSuper", 1.5, 20));
		gestore_spese.prodottiInseriti.add(new Prodotto("Pulitore2000", 2.0, 200));
		
		gestore_spese.utentiRegistrati.add(new Utente("Carmine", "Carmine123", "1234567890", "0000000000000000"));
		gestore_spese.utentiRegistrati.add(new Utente("Pasquale", "paquito", "13443434", "1111111111111111111"));
		gestore_spese.utentiRegistrati.add(new Utente("Saverio", "saverius", "6454343434", "22222222222222222"));
		
		gestore_spese.impiegati.add(new Impiegato());
		
		gestore_spese.generaReport(1);
		

	}

}
