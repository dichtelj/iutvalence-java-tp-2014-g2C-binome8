package iut.valence.tp.binome8.abalone;

/**Classe définissant l'état du joueur*/
public class Joueur {
	public final String  name;
    public final TypeCase colorPlayer;

    public Joueur(String name, TypeCase typeCase) 
    {
        this.name = name;
        this.colorPlayer = typeCase;
    }

    public String getName() 
    {
        return this.name;
    }

    public TypeCase getColor() 
    {
        return colorPlayer;
    }
    
    public String toString() {
    	return colorPlayer.toString();
    }
    
}
