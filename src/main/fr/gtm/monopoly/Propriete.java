package fr.gtm.monopoly;
///
public abstract class Propriete extends Case {

	public Joueur proprietaire;
	private int prixAchat = 100;
	private int loyer = 10;
	
	
	public Propriete() {
		
	}
	
	public Propriete(int prixAchat, int loyer) {
		super();
		this.prixAchat = prixAchat;
		this.loyer = loyer;
	}

	@Override
	public void arreter(Joueur j) {
		if(proprietaire == null) {
			Joueur.interesseParAchat(this,j);	
		} if(j!=proprietaire){
			System.out.println(j+" n'est pas le proprietaire il doit donc payer un loyer à "+proprietaire);
			j.debiter(loyer);
			proprietaire.crediter(loyer);
			System.out.println("j paye proprietaire");
		}
		
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
