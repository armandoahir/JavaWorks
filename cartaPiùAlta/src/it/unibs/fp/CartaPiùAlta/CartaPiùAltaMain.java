package it.unibs.fp.CartaPi�Alta;

import it.unibs.fp.mylib.InputDati;

public class CartaPi�AltaMain {
	private static String BENVENUTO = "Benvenuto al gioco JUA!";
	private static String NOME_UTENTE = "Nome utente: ";
	private static String PATRIMONIO = "Qual � il tuo saldo: ";
	private static String ARRIVEDERCI = "ARRIVEDERCI";
	
	public static void main(String[] args) {
		System.out.println(BENVENUTO);
		Utente giocatore = new Utente(InputDati.leggiStringaNonVuota(NOME_UTENTE), InputDati.leggiInteroPositivo(PATRIMONIO));
		Mazzo mazzo = Partita.scegliMazzo();
		
		do {
			Partita.round(mazzo, giocatore);
		}while(!Partita.terminaPartita(giocatore));
		
		System.out.println(ARRIVEDERCI);
	}

}
