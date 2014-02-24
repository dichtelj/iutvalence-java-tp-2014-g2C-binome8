package game;

public class Bille {

	private int nbLigne;
	private int nbColonne;
	private Joueur joueur;
	
	public Bille(int posLigne, int posColonne, Joueur player) 
	{
		this.nbLigne = posLigne;
		this.nbColonne = posColonne;
		this.joueur = player;
	}
	public int getLigne() 
	{
		return this.nbLigne;
	}
	public int getColonne() 
	{
		return this.nbColonne;
	}	
	public Joueur getJoueur() 
	{
		return this.joueur;
	}
}
