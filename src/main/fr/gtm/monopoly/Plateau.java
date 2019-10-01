package fr.gtm.monopoly;

public class Plateau {
	private Case[] cases = new Case[40];

	public Plateau() {
		buildCases();
	}

	private void buildCases() {
		for (int i = 0; i < cases.length; i++) {

			switch (i) {
			case 0:
				cases[i] = new Depart("Case départ");
				break;
			case 4:
				cases[i] = new Impots("Case impots");
				break;
			case 38:
				cases[i] = new TaxeDeLuxe("Case taxe de luxe");
				break;
			default:
				cases[i] = new Rue("Rue "+i,100,10);
				break;
			}
		}
		for (int i = 0; i < cases.length - 1; i++) {
			cases[i].setNext(cases[i + 1]);
		}
		cases[cases.length - 1].setNext(cases[0]);
	}

	public Case getCaseDepart() {
		return cases[0];
	}
}
