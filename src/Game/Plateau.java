/* TODO Convention java : les packages sont en minuscules */
package Game;

public class Plateau {
    /* TODO Pourquoi est-ce une variable ? */
	private int nbLigne;
    /* TODO Pourquoi est-ce une variable ? */
    private int      nbColonne;
    private char[][] Plat;
    /* TODO ??? Qu'est-ce que ? */
    private int      i;
    /* TODO ??? Qu'est-ce que ? */
    private int      j;

    /* TODO Est-ce que dans le jeu Abalone le plateau est de taille variable ? */
    public void Plat(int n, int m) {
        nbLigne = n;
        nbColonne = m;
        Plat = new char[nbLigne][nbColonne];
        /* TODO Attention, cette variable masque le champ ! */
        for (int i = 0; i < nbLigne; i++) {
            /* TODO Attention, cette variable masque le champ ! */
            for (int j = 0; j < nbColonne; j++) {
                /* TODO Pourquoi pas une constante ? */
                Plat[i][j] = 'x';
            }
        }
    }

    public void afficher() {
        System.out.println();
        /* TODO Attention, cette variable masque le champ ! */
        for (int i = 1; i < nbLigne; i = 9) {
            /* TODO Attention, cette variable masque le champ ! */
            for(int j=1;j<nbColonne;j=9){
                System.out.print(" | "+Plat[i][j]);
            }
            System.out.println(" | ");
        }
        System.out.println();
    }
	}
