package fr.gtm.monopoly;

public class Impots extends Case {

	public Impots(String string) {
		super(string);
	}
	public Impots() {
		
	}
	@Override
	public void arreter(Joueur j) {
		System.out.println("Le joueur s'arrete sur la case impots");
		if (j.getSolde() * 0.1 <= 500) {
			j.debiter((int) (j.getSolde() * 0.1));
		} else {
			j.debiter(500);
		}
		
	}

	@Override
	public void passer(Joueur j) {
		// TODO Auto-generated method stub

	}
}
