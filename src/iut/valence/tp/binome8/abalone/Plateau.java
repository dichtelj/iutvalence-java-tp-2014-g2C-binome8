package iut.valence.tp.binome8.abalone;

/** Classe d'initialisation du plateau et des cases.
 * 
 * @author ROCCI David DICHTEL Jonathan TP2C
 * @version TODO
 */
public class Plateau {
	/** Création du plateau du jeu de abalone */
	public Bille[][] plat;

	public Plateau(Joueur joueur1, Joueur joueur2,Joueur joueurNul,Joueur joueurVide) {
		this.plat = new Bille[10][10];
		
		for (int numberLine = 1; numberLine < 10 ; numberLine++)
			for (int numberColumn = 1; numberColumn < 10; numberColumn++)
				if ((numberColumn == 9 && 4<numberLine )|| (numberColumn == 8 && numberLine > 3)|| (numberColumn == 7 && (4<numberLine && numberLine<8))) {
						
						this.plat[numberLine][numberColumn] = new Bille(joueur1);
				}
				else if((numberColumn == 1 && (0<numberLine && numberLine<6))||(numberColumn == 2 && (0<numberLine && numberLine<7))|| (numberColumn == 3 && (2<numberLine && numberLine<6)))
							
						this.plat[numberLine][numberColumn] = new Bille(joueur2);
				else if ((numberColumn == 1 && numberLine>5)||(numberColumn == 2 && numberLine>6)||(numberColumn == 3 && numberLine>7)||(numberColumn == 4 && numberLine>8 || numberColumn == 9 && 5>numberLine)||(numberColumn == 8 && 4>numberLine)||(numberColumn == 7 && 3>numberLine)||(numberColumn == 6 && 2>numberLine))
					this.plat[numberLine][numberColumn] = new Bille(joueurNul);
				else
					this.plat[numberLine][numberColumn] = new Bille(joueurVide);

    }
	
	/** Creation d'un plateau en chaîne de caractère*/
	
	public String toString() {
		String plateauAsciiArt = "";
		for (int numberLine = 1; numberLine < 10 ; numberLine++)
		{
			for (int numberColumn = 1; numberColumn < 10; numberColumn++)
			{
				Bille bille = this.plat[numberLine][numberColumn];
				plateauAsciiArt += bille;
			
		}
			plateauAsciiArt += "\n";
		}
		return plateauAsciiArt;
	}

	/** Test si un mouvement est possible */
	public boolean mouvementPossible(Mouvement mouvement)  {
		Direction direction = mouvement.getDirection();
		Type type = mouvement.getType();
		if((type=Type.Decaler) != null)
		{
			if((direction=Direction.HAUT) != null)
			{
				this.deplacerBille(mouvement);
			}
			if((direction=Direction.BAS) != null)
			{
				
			}
			
		if((type=Type.PousserLigne) != null)
		{
			if((direction=Direction.DROITE) != null)
			{
				this.deplacerBille(mouvement);
			}
		}
		
			if((direction=Direction.GAUCHE) != null)
			{
				
			}

		if((type=Type.PousserDiag) != null)
		{
			if((direction=Direction.BASDROITE) != null)
			{
				this.deplacerBille(mouvement);
			}

			if((direction=Direction.BASGAUCHE) != null)
			{
				this.deplacerBille(mouvement);
			}

			if((direction=Direction.HAUTDROITE) != null)
			{
				this.deplacerBille(mouvement);
			}

			if((direction=Direction.HAUTGAUCHE) != null)
			{
				this.deplacerBille(mouvement);
			}
		}
	}
		return false;
}
/** Deplacement de bille(s)*/
	public void deplacerBille(Mouvement mouvement) 
	{
		
	}
}
