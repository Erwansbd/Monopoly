package fr.gtm.monopoly;
///
public class TaxeLuxe extends Case {

	
	public TaxeLuxe() {
		
	}
	public TaxeLuxe(String string) {
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
