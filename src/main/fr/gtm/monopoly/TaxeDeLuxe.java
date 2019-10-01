package fr.gtm.monopoly;

public class TaxeDeLuxe extends Case {

	public TaxeDeLuxe(String string) {
		super(string);
	}

	@Override
	public void arreter(Joueur j) {
		j.debiter(100);
		
	}

	@Override
	public void passer(Joueur j) {
		// TODO Auto-generated method stub
		
	}

}
