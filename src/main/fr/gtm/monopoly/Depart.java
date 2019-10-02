package fr.gtm.monopoly;
///
public class Depart extends Case {

	public Depart() {
		
	}
	public Depart(String string) {
		super(string);
	}

	@Override
	public void arreter(Joueur j) {
		j.crediter(400);		
	}

	@Override
	public void passer(Joueur j) {
		System.out.println("Case départ");
		j.crediter(200);		
	}

	
}
