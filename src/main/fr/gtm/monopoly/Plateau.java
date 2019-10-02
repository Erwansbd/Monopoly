package fr.gtm.monopoly;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import fr.gtm.demoforname.Point;

public class Plateau {
	private Case[] cases = new Case[40];

	public Plateau() {

		try {
			buildCaseFile();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
			buildCases();
		} 
	}

	private void buildCaseFile() throws InstantiationException, IllegalAccessException, ClassNotFoundException {

		String fileName = "monopoly.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

			String line = br.readLine();

			for(int i = 0 ; i< cases.length ; i++) {
				String[] fields = line.split(";");
				String clazz = "fr.gtm.monopoly."+fields[1];
				
				cases[i] = (Case) Class.forName(clazz).newInstance();
				cases[i].setName(fields[2]);
				cases[i].setCouleur(fields[5]);
				line = br.readLine();
			}				
//			line = br.readLine();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		for (int i = 0; i < cases.length - 1; i++) {
			cases[i].setNext(cases[i + 1]);
		}
		cases[cases.length - 1].setNext(cases[0]);
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
				cases[i] = new TaxeLuxe("Case taxe de luxe");
				break;
			default:
				cases[i] = new Rue("Rue " + i, 100, 10);
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
