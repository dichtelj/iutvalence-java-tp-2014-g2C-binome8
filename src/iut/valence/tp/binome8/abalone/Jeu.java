package iut.valence.tp.binome8.abalone;

/*Classe de lancement du jeu */

public class Jeu {
	private final Plateau plat;
	private Joueur joueurCourant;
	private final Joueur J1;
	private final Joueur J2;
	
	/* TODO Rajouter tour courant. */
	
	public Jeu(String nomJoueur1, String nomJoueur2) {
		plat = new Plateau();
		this.J1 = new Joueur(nomJoueur1, Joueur.white, false);
		this.J2 = new Joueur(nomJoueur2, Joueur.black, false);
	}
	public void setJoueurCourant()
	{
		this.joueurCourant = joueurCourant;
	}

	public Joueur getJ1()
	{
		return J1;
	}
	public Joueur getJ2()
	{
		return J2;
	}
	public Joueur getJoueurCourant()
	{
		return this.joueurCourant;

	}
	public String getNameJ1()
	{
		return J1.getName();
	}
	public String getNameJ2()
	{
		return J2.getName();
	}
	
	/** Initialisation du tour.*/
	void jouer()
	{
		
	}
}
