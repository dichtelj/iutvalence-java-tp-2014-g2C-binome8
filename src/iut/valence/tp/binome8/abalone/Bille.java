package iut.valence.tp.binome8.abalone;

/** Classe définissant l'état de la bille. */
public class Bille {
    private Joueur player;

    public Bille(Joueur player) {
       this.player = player;
    }
/**Récuperation du joueur associé à la bille */
    public Joueur getPlayer() {
        return this.player;
    }
    
    /** Conversion d'un joueur en caractère via une couleur*/
    public String toString() {
    	return player.toString();
    }
}
	