package ESAME_IS_N46003800_TEST;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import control.*;
import entity.*;


public class Negozio_TestTest {
	
	
	GestioneSpese gestione = new GestioneSpese();
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		GestioneSpese gestione = new GestioneSpese();
	}

	@After
	public void tearDown() throws Exception {
		gestione = null;
	}

	@Test
	public void test1() {
		System.out.print("TEST 1 \n");
		
		ArrayList<Utente> utentiReport = gestione.generaReport(-1);
		assertTrue(utentiReport.isEmpty());
	}
	
	@Test
	public void test2() {
		System.out.print("TEST 2 \n");
		
		
		ArrayList<Utente> utentiReport = gestione.generaReport(2);
		assertTrue(utentiReport.isEmpty());
		
	}
	
	@Test
	public void test3() {
		System.out.print("TEST 3 \n");
		gestione.utentiRegistrati.add(new Utente("Carmine", "Carmine123", "1234567890", "0000000000000000"));
		ArrayList<Utente> utentiReport = gestione.generaReport(0);
		assertTrue(utentiReport.size() == 1);
	}
	
	@Test
	public void test4() {
		System.out.print("TEST 4 \n");
		gestione.utentiRegistrati.add(new Utente("Carmine", "Carmine123", "1234567890", "0000000000000000"));
		ArrayList<Utente> utentiReport = gestione.generaReport(1);
		assertTrue(utentiReport.size() == 0);
		
	}
	
	@Test
	public void test5() {
		System.out.print("TEST 5 \n");
		gestione.prodottiInseriti.add(new Prodotto("Dixan", 2.5, 100));
		gestione.utentiRegistrati.add(new Utente("Carmine", "Carmine123", "1234567890", "0000000000000000"));
		gestione.creaCarrello();
		gestione.utentiRegistrati.get(0).addSpesa(gestione.speseEffettuate.get(0));
		ArrayList<Utente> utentiReport = gestione.generaReport(1);
		assertTrue(utentiReport.size() == 0);
		
		
	}
	
	@Test
	public void test6() {
		System.out.print("TEST 6 \n");
		gestione.prodottiInseriti.add(new Prodotto("Dixan", 2.5, 100));
		gestione.utentiRegistrati.add(new Utente("Carmine", "Carmine123", "1234567890", "0000000000000000"));
		ProdottoOrdinato prodotto1 = new ProdottoOrdinato(gestione.prodottiInseriti.get(0), 5);
		gestione.creaCarrello();
		gestione.aggiungiProdottoCarrello(prodotto1, 0);
		gestione.chiudiCarrello(0);
		gestione.utentiRegistrati.get(0).addSpesa(gestione.speseEffettuate.get(0));
		ArrayList<Utente> utentiReport = gestione.generaReport(5);
		assertTrue(utentiReport.size() == 0);
		
		
	}
	
	@Test
	public void test7() {
		System.out.print("TEST 7 \n");
		
		gestione.prodottiInseriti.add(new Prodotto("Dixan", 2.5, 100));
		gestione.utentiRegistrati.add(new Utente("Carmine", "Carmine123", "1234567890", "0000000000000000"));
		ProdottoOrdinato prodotto1 = new ProdottoOrdinato(gestione.prodottiInseriti.get(0), 5);
		gestione.creaCarrello();
		gestione.aggiungiProdottoCarrello(prodotto1, 3);
		gestione.chiudiCarrello(3);

		gestione.utentiRegistrati.get(0).addSpesa(gestione.speseEffettuate.get(0));
		ArrayList<Utente> utentiReport = gestione.generaReport(1);
		
		assertTrue(utentiReport.size() == 1);
		
		
	}

	

	

}
