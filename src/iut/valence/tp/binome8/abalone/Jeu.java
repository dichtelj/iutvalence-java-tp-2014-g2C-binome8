package iut.valence.tp.binome8.abalone;

import java.util.Scanner;

/** Classe de lancement du jeu */

public class Jeu {
	private final Plateau plat;
	private Joueur joueurCourant;
	private final Joueur j1;
	private final Joueur j2;
	private final Joueur jN;
	private final Joueur jV;

	/** TODO Rajouter tour courant. */

	public Jeu(String nomJoueur1, String nomJoueur2) {
		this.j1 = new Joueur(nomJoueur1, TypeCase.WHITE);
		this.j2 = new Joueur(nomJoueur2, TypeCase.BLACK);
		this.jN = new Joueur(nomJoueur2, TypeCase.INVALID);
		this.jV = new Joueur(nomJoueur2, TypeCase.VOID);
		plat = new Plateau(j1, j2,jN,jV);
		joueurCourant = j1;
	}
/** Attribue le joueur suivant */
	public void joueurSuivant() {
		this.joueurCourant = joueurCourant.equals(j1) ? j2 : j1;
	}

	/** Initialisation du tour. */
	public void jouer()  {
		System.out.println(plat);
		Mouvement mouvement;
		do {
			/** r�cuperation des coordonn�es de deplacement au clavier*/
			Scanner sc = new Scanner(System.in);
			System.out.println("Veuillez saisir la coordonn�es x de d�part:");
			String str = sc.nextLine();
			int i = Integer.parseInt(str);
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Veuillez saisir la coordonn�es y de d�part:");
			String str1 = sc1.nextLine();
			int j = Integer.parseInt(str1);
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Veuillez saisir la coordonn�es x d'arriv�e:");
			String str2 = sc.nextLine();
			int k = Integer.parseInt(str2);
			Scanner sc3 = new Scanner(System.in);
			System.out.println("Veuillez saisir la coordonn�es y d'arriv�e:");
			String str3 = sc.nextLine();
			int l = Integer.parseInt(str3);
			/** Translation de i,j,k,l en mouvement*/
			mouvement = new Mouvement(i,j,k,l);
		} while (!plat.mouvementPossible(mouvement));
		plat.deplacerBille(mouvement);
		System.out.println(plat);
		joueurSuivant();
	}
}
