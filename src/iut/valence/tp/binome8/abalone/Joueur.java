package iut.valence.tp.binome8.abalone;

/*Classe définissant l'état du joueur*/
public class Joueur {
    public final String  name;
    public final boolean colorPlayer;
    public final boolean IA;

    public static final boolean white = true;
    public static final boolean black  = false;


    public Joueur(String name, boolean colorJ, boolean iA) {
        this.name = name;
        this.colorPlayer = colorJ;
        IA = iA;
    }

    public String getName() {
        return this.name;
    }

    public boolean getColor() {
        return colorPlayer;
    }

    public boolean getIA() {
        return IA;
    }

}
