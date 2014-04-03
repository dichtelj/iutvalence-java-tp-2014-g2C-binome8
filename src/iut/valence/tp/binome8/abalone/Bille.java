package iut.valence.tp.binome8.abalone;

/** Classe définissant l'état de la bille. */
public class Bille {
    private Joueur player;

    public Bille(Joueur player) {
       this.player = player;
    }

    public Joueur getPlayer() {
        return this.player;
    }
    
    @Override
    public String toString() {
    	return player.toString();
    }
}
	