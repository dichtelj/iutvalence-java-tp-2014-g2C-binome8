package iut.valence.tp.binome8.abalone;
/* Classe définissant l'état de la bille
 */
public class Bille {

    private int    numberLine;
    private int    numberColumn;
    private Joueur player;

    public Bille(int positionLine, int positionColumn, Joueur player) {
        this.numberLine = positionLine;
        this.numberColumn = positionColumn;
        this.player = player;
    }
	public Bille(boolean black) {
		// TODO Auto-generated constructor stub
	}
	public int getLine() {
        return this.numberLine;
    }

    public int getColumn() {
        return this.numberColumn;
    }

    public Joueur getPlayer() {
        return this.player;
    }
}
