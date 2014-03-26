package iut.valence.tp.binome8.abalone;

import java.util.Scanner;

/**Classe de lancement du jeu */

public class Jeu {
	private final Plateau plat;
	private Joueur joueurCourant;
	private final Joueur j1;
	private final Joueur j2;
	
	/* TODO Rajouter tour courant. */
	
	public Jeu(String nomJoueur1, String nomJoueur2) {
		this.j1 = new Joueur(nomJoueur1, Joueur.white);
		this.j2 = new Joueur(nomJoueur2, Joueur.black);
		plat = new Plateau(j1,j2);
		joueurCourant = j1;
	}
	public void joueurSuivant()
	{
		this.joueurCourant = joueurCourant.equals(j1) ? j2 : j1;
	}

	
	/** Initialisation du tour.*/
	public void jouer()
	{

		int i,j,k,l;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir la coordonnées x de départ:");
		String str = sc.nextLine();
		i = Integer.parseInt(str);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Veuillez saisir la coordonnées y de départ:");
		String str1 = sc1.nextLine();
		j = Integer.parseInt(str1);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Veuillez saisir la coordonnées x d'arrivée:");
		String str2 = sc.nextLine();
		k = Integer.parseInt(str2);
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Veuillez saisir la coordonnées y d'arrivée:");
		String str3 = sc.nextLine();
		l = Integer.parseInt(str3);
		}
		while (!plat.mouvementPossible(i, j, k, l));
		plat.deplacerBille(i, j, k, l);
		System.out.println(plat);
		joueurSuivant();
	}
}
