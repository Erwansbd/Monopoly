package fr.gtm.monopoly;
///
public class Pion {
	private String nom;
	private Joueur joueur;
	private Case position;

	public Pion(String nom) {
		this.nom = nom;
	}

	public Pion() {
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Joueur getJoueur() {
		return joueur;
	}

	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}

	public Case getPosition() {
		return position;
	}

	public void setPosition(Case position) {
		this.position = position;
	}

	public void avancer(int r) {
		for (int i = 0; i < r; i++) {
			position = position.getNext();
			Case nouvelle = position;
			System.out.println(nouvelle.getName());
			position.passer(joueur);
//		System.out.println(String.format("%s était sur la case %s, il avance a la case %d\n", nouvelle.getName(),r));
		}
		position.arreter(joueur);
		System.out.println(joueur.getNom()+" dispose de "+joueur.getSolde()+" en euros");
	}

}
