package game;

/* TODO Javadoc. */
/* TODO Nom de package pertinent. */
public class Joueur {
    public final String  nom;
    public final boolean couleurJoueur;
    public final boolean IA;

    public static final boolean Blanc = true;
    public static final boolean Noir  = false;


    public Joueur(String nom, boolean couleurJoueur, boolean iA) {
        this.nom = nom;
        this.couleurJoueur = couleurJoueur;
        IA = iA;
    }

    /* TODO Franglais. */
    public String getName() {
        return this.nom;
    }

    /* TODO Franglais. */
    public boolean getColor() {
        return couleurJoueur;
    }

    /* TODO Franglais. */
    public boolean getIA() {
        return IA;
    }

}
