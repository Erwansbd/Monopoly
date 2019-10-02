package fr.gtm.monopoly;
///
import java.util.Random;

public class De {
	private static final Random rand = new Random();
	private int valeur;


	public  int lancer() {
		valeur = rand.nextInt(6) + 1;
		return valeur;
	}

	public int getValeur() {
		return valeur;
	}

}