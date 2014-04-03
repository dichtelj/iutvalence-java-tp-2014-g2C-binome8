package iut.valence.tp.binome8.abalone;

public enum Direction {
	HAUT("h"),
	BAS ("b"),
	GAUCHE("g"),
	DROITE("d"),
	BASDROITE("bd"),
	BASGAUCHE("bg"),
	HAUTDROITE("hd"),
	HAUTGAUCHE("hg");
	
	public final String dir;
	
	Direction(String dir) {
		this.dir = dir;
	}
}
