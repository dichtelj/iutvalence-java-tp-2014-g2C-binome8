package Game;

import java.util.*;



public class Plateau {
	private int nbLigne;
	private int nbColonne;
	private char[][] Plat;
	private int i;
	private int j;
	
	public void Plat(int n, int m)
	{
		nbLigne=n;
		nbColonne=m;
		Plat = new char [nbLigne][nbColonne];
		for(int i=0;i<nbLigne;i++){
			for(int j=0;j<nbColonne;j++){
				Plat [i][j] ='x';
				}
			}
		}
    public void afficher(){
        System.out.println();
        for(int i=1;i<nbLigne;i=9){
            for(int j=1;j<nbColonne;j=9){
                System.out.print(" | "+Plat[i][j]);
            }
            System.out.println(" | ");
        }
        System.out.println();
    }
	}
