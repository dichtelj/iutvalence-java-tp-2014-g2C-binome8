package iut.valence.tp.binome8.abalone;

/* Erreur sur les cases en dehors du plateau de jeu*/
public class ErreurCase extends Exception 
{
	int l = 0;
	int k = 0;
	{
	
	if ((l == 1 && k>5)||(l == 2 && k>6)||(l == 3 && k>7)||(l == 4 && k>8))
	{
		System.out.println("Erreur en dehors du plateau");
	}
	else if((l == 9 && 5>k)||(l == 8 && 4>k)||(l == 7 && 3>k)||(l == 6 && 2>k))
	{
		System.out.println("Erreur en dehors du plateau");
	}
}
}
