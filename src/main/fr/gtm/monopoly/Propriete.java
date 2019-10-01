package fr.gtm.monopoly;

public abstract class Propriete extends Case {

	private Joueur proprietaire;
	private int prixAchat = 100;
	private int loyer = 10;
	
	
	public Propriete(int prixAchat, int loyer) {
		super();
		this.prixAchat = prixAchat;
		this.loyer = loyer;
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

	public int getPrixAchat() {
		return prixAchat;
	}

	public void setPrixAchat(int prixAchat) {
		this.prixAchat = prixAchat;
	}

	public int getLoyer() {
		return loyer;
	}

	public void setLoyer(int loyer) {
		this.loyer = loyer;
	}

	public Joueur getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Joueur proprietaire) {
		this.proprietaire = proprietaire;
	}
	
	

}
