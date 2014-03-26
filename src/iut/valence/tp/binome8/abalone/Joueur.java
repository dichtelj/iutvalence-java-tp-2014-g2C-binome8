package iut.valence.tp.binome8.abalone;

/**Classe définissant l'état du joueur*/
public class Joueur {
    public final String  name;
    public final boolean colorPlayer;

    public static final boolean white = true;
    public static final boolean black  = false;


    public Joueur(String name, boolean colorJ) {
        this.name = name;
        this.colorPlayer = colorJ;
    }

    public String getName() {
        return this.name;
    }

    public boolean getColor() {
        return colorPlayer;
    }


}
