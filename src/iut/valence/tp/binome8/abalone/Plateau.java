package iut.valence.tp.binome8.abalone;

/** Classe d'initialisation du plateau et des cases.
 * 
 * @author ROCCI David DICHTEL Jonathan TP2C
 * @version TODO
 */
public class Plateau {
	/** Création du plateau du jeu de abalone */
	public Bille[][] plat;

	public Plateau(Joueur joueur1, Joueur joueur2) {
		this.plat = new Bille[10][10];
		
		for (int numberLine = 1; numberLine < 10 ; numberLine++)
			for (int numberColumn = 1; numberColumn < 10; numberColumn++)
				if ((numberColumn == 9 && 4<numberLine )|| (numberColumn == 8 && numberLine > 3)|| (numberColumn == 7 && (4<numberLine && numberLine<8))) {
						
						this.plat[numberLine][numberColumn] = new Bille(joueur1);
				}
				else if((numberColumn == 1 && (0<numberLine && numberLine<6))||(numberColumn == 2 && (0<numberLine && numberLine<7))|| (numberColumn == 3 && (2<numberLine && numberLine<6)))
							
						this.plat[numberLine][numberColumn] = new Bille(joueur2);
		
    }
	
	@Override
	public String toString() {
		String plateauAsciiArt = "";
		for (int numberLine = 1; numberLine < 10 ; numberLine++)
		{
			for (int numberColumn = 1; numberColumn < 10; numberColumn++)
			{
				Bille bille = this.plat[numberLine][numberColumn];
				if ((numberColumn == 9 && 4<numberLine )|| (numberColumn == 8 && numberLine > 3)|| (numberColumn == 7 && (4<numberLine && numberLine<8))) {
						
							plateauAsciiArt += "B ";
				}
				else if((numberColumn == 1 && numberLine<6)||(numberColumn == 2 && (0<numberLine && numberLine<7))|| (numberColumn == 3 && (2<numberLine && numberLine<6)))
				{	
							plateauAsciiArt += "W ";}
				else if ((numberColumn == 1 && numberLine>5)||(numberColumn == 2 && numberLine>6)||(numberColumn == 3 && numberLine>7)||(numberColumn == 4 && numberLine>8))
				{
					plateauAsciiArt += "  ";}
				else if ((numberColumn == 9 && 5>numberLine)||(numberColumn == 8 && 4>numberLine)||(numberColumn == 7 && 3>numberLine)||(numberColumn == 6 && 2>numberLine))
				{
					plateauAsciiArt += "  ";}
				else 
							plateauAsciiArt += ". ";
			}
			
		plateauAsciiArt += "\n";
		}
		return plateauAsciiArt;
	}

	public boolean mouvementPossible(Mouvement mouvement) {
		// TODO Auto-generated method stub
		return false;
	}

	public void deplacerBille(Mouvement mouvement) {
		// TODO Auto-generated method stub
		
	}
}
