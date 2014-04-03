package iut.valence.tp.binome8.abalone;

/**Classe définissant l'état du joueur*/
public class Joueur {
    public final String  name;
    public final String colorPlayer;

    public enum TypeCase
    {
    	Black("B"),
    	White("W"),
    	Invalid(" "),
    	Void(".");

    	
    	public final String typeCase;
    	
    	TypeCase(String typeCase) {
    		this.typeCase = typeCase;
    	}
    }
    

    public Joueur(String name, TypeCase typeCase) {
        this.name = name;
        this.colorPlayer = this.toString();
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return colorPlayer;
    }
    
    @Override
    public String toString() {
    	return colorPlayer;
    }
}
