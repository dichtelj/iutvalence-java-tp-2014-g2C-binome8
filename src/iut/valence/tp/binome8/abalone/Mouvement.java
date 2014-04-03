package iut.valence.tp.binome8.abalone;

public class Mouvement {
	private Direction direction;
	private Type type;
	
	public Mouvement(int i, int j, int k, int l) {
		/* Transformer i,j,k,l en direction et type. */
		direction = null;
		type = null;
		
		if (i>k && j<l)
		{
			this.direction = Direction.BASDROITE;
			this.type = Type.PousserDiag;
		}
		else if(i>k && j>l)
		{
			this.direction = Direction.BASGAUCHE;
			this.type = Type.PousserDiag;
		}
		else if(i<k && j<l)
		{
			this.direction = Direction.HAUTDROITE;
			this.type=Type.PousserDiag;
		}
		else if(i<k && j>l)
		{
			this.direction = Direction.HAUTGAUCHE;
			this.type=Type.PousserDiag;
		}
		else if(i==k && j<l)
		{
			this.direction = Direction.HAUT;
			this.type=Type.Decaler;
		}
		else if(i==k && j>l)
		{
			this.direction = Direction.BAS;
			this.type=Type.Decaler;
		}
		else if(i<k && j==l)
		{
			this.direction = Direction.DROITE;
			this.type=Type.PousserLigne;
		}
		else if(i>k && j==l)
		{
			this.direction = Direction.GAUCHE;
			this.type= Type.PousserLigne;
			
		}
	}	
}
