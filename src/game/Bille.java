package game;
/* TODO Javadoc. */
/* TODO Nom de package pertinent. */
public class Bille {

    private int    nbLigne;
    private int    nbColonne;
    private Joueur joueur;

    public Bille(int posLigne, int posColonne, Joueur player) {
        this.nbLigne = posLigne;
        this.nbColonne = posColonne;
        this.joueur = player;
    }
    /* TODO Franglais. */
    public int getLigne() {
        return this.nbLigne;
    }

    /* TODO Franglais. */
    public int getColonne() {
        return this.nbColonne;
    }

    /* TODO Franglais. */
    public Joueur getJoueur() {
        return this.joueur;
    }
}
