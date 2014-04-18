package iut.valence.tp.binome8.abalone;

/** enumeration du type d'etat de la case*/
public enum TypeCase
{
	BLACK("B "),
	WHITE("W "),
	INVALID("  "),
	VOID(". ");

	
	public final String typeCase;
	
	TypeCase(String typeCase) 
	{
		this.typeCase = typeCase;
	}
	/** Conversion d'un Type de case en caractère*/
	@Override
	public String toString() {
		return typeCase;
	}
}