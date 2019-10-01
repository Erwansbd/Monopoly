package fr.gtm.monopoly;

public class Rue extends Propriete {


//	private static int prixAchat = 100;
//	private static int loyer;

//	public Rue(String nom) {
//		super(prixAchat,loyer);
//		name = nom;
//		// TODO Auto-generated constructor stub
//	}


	@Override
	public String toString() {
		return "Rue [getName()=" + getName() + "]";
	}
	
	public Rue(int prixAchat, int loyer) {
		super(prixAchat, loyer);
		// TODO Auto-generated constructor stub
	}
	public Rue(String nom, int prixAchat, int loyer) {
		super(prixAchat,loyer);
		name = nom;
	}

	@Override
	public void arreter(Joueur j) {
		// TODO Auto-generated method stub
		Joueur.interesseParAchat(this,j);

	}

	@Override
	public void passer(Joueur j) {
		// TODO Auto-generated method stub

	}


}
