package iut.valence.tp.binome8.abalone;

/*Classe de lancement du jeu */

public class Jeu {
	private final Plateau plat;
	private Joueur joueurCourant;
	private final Joueur j1;
	private final Joueur j2;
	
	/* TODO Rajouter tour courant. */
	
	public Jeu(String nomJoueur1, String nomJoueur2) {
		this.j1 = new Joueur(nomJoueur1, Joueur.white, false);
		this.j2 = new Joueur(nomJoueur2, Joueur.black, false);
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
		System.out.println(plat);
		int i,j,k,l;
		do {
			/* Demander le coup à jouer. */
			i=5;
			j=7;
			k=8;
			l=2;
		}
		while (!plat.mouvementPossible(i, j, k, l));
		plat.deplacerBille(i, j, k, l);
		joueurSuivant();
	}
}
