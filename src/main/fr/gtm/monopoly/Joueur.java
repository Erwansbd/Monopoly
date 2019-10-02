package fr.gtm.monopoly;
///

public class Joueur {
	private String nom;
	private Pion pion;
	private int solde = 1500;
	
	
	public String getNom() {
		return nom;
	}
	
	

	public Joueur(String nom) {
		super();
		this.nom = nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}

	public Pion getPion() {
		return pion;
	}

	public void setPion(Pion pion) {
		this.pion = pion;
	}
	
	public int getSolde() {
		return solde;
	}

	public void jouer(De d1, De d2) {
		Case old = pion.getPosition();
		int r = d1.lancer() + d2.lancer();
//		System.out.println(String.format("%s était sur la case %s, il obtient %d\n", old.getName(),r));
	}
	public void crediter(int c) {
		solde += c;
	}
	public void debiter(int d) {
		solde -= d;
	}

	@Override
	public String toString() {
		return nom;
	}

	public static void interesseParAchat(Propriete p, Joueur j) {
		// TODO Auto-generated method stub
		if(j.getSolde()>p.getPrixAchat()) {
			System.out.println("Le prix de la case "+p + " est de : " +p.getPrixAchat());
			p.setProprietaire(j);
			System.out.println(j+" est le proprietaire de "+p );
			j.debiter(p.getPrixAchat());
		}
	}
}
