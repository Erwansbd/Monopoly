package fr.gtm.monopoly;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;

class MainMonopoly {

    public static void main(String[] args) {
   	 // TODO Auto-generated method stub
    	Plateau p = new Plateau();
    	//assertNotNull(p);
    	Case depart = p.getCaseDepart();
    	//assertNotNull(depart);
    	Case c = depart;
    	int cpt = 0;
    	do {
        	cpt++;
        	assertNotSame(c, c.getNext());
        	c = c.getNext();
    	}while(c!=depart);
    	//assertEquals(40, cpt);

    	Monopoly m = new Monopoly();
    	Joueur j1 = new Joueur("Jacques");
    	Joueur j2 = new Joueur("Henry");
    	Pion p1 = new Pion();
    	Pion p2 = new Pion();
    	m.addJoueur(j1, p1);
    	m.addJoueur(j2, p2);
//    	De d1 = new De();
//    	De d2 = new De();
    	m.jouer();
//    	j1.jouer(d1, d2);
//    	p1.avancer(d1.getValeur()+d2.getValeur());
//    	j2.jouer(d1, d2);
//    	p2.avancer(d1.getValeur()+d2.getValeur());
    }

}



