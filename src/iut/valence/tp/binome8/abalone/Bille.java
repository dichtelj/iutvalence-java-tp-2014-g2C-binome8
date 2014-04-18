package iut.valence.tp.binome8.abalone;

/** Classe d�finissant l'�tat de la bille. */
public class Bille {
    private Joueur player;

    public Bille(Joueur player) {
       this.player = player;
    }
/**R�cuperation du joueur associ� � la bille */
    public Joueur getPlayer() {
        return this.player;
    }
    
    /** Conversion d'un joueur en caract�re via une couleur*/
    public String toString() {
    	return player.toString();
    }
}
	