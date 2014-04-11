package iut.valence.tp.binome8.abalone;

public enum Type {
	/**Enumeration de type de deplacement*/
	
	PousserDiag("Diag"),
	PousserLigne("Ligne"),
	Decaler("Dec");

	
	public final String type;
	
	Type(String type) {
		this.type = type;
	}
}