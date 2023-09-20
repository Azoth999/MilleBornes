package testsFonctionnels;

import jeu.*;
import projet.*;
import projet.Probleme.Type;

public class Progtest {
	
	public static void affichage(Carte probleme) {
		StringBuilder message = new StringBuilder();
		message.append("Je pioche ");
		message.append(probleme.toString());
		System.out.println(message);
	}

	public static void main(String[] args) {
		Carte familleAccident = new Attaque(3,Type.ACCIDENT);
		Carte familleReparation = new Parade(3,Type.ACCIDENT);
		Carte familleAsDuVolant = new Botte(1,Type.ACCIDENT);
		
		Sabot sabot = new Sabot();
		sabot.ajouterFamilleCarte(familleAccident);
		sabot.ajouterFamilleCarte(familleReparation, familleAsDuVolant);
		
		affichage(sabot.piocher());
		affichage(sabot.piocher());
		affichage(sabot.piocher());
		affichage(sabot.piocher());
		affichage(sabot.piocher());
		affichage(sabot.piocher());
		affichage(sabot.piocher());
		
	}
}
