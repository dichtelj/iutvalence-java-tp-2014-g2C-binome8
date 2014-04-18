package iut.valence.tp.binome8.abalone;

/**Classe d�finissant l'�tat du joueur*/
public class Joueur {
	public final String  name;
    public final TypeCase colorPlayer;

    /** Initialisation du nom et de la couleur du joueur*/
    public Joueur(String name, TypeCase typeCase) 
    {
        this.name = name;
        this.colorPlayer = typeCase;
    }
/** Recuperation du nom du joueur*/
    public String getName() 
    {
        return this.name;
    }
/** R�cuperation de la couleur*/
    public TypeCase getColor() 
    {
        return colorPlayer;
    }
    /** conversion de la couleur en caract�re via le type de case*/
    public String toString() {
    	return colorPlayer.toString();
    }
    
}
