package iut.valence.tp.binome8.abalone;

/** Classe d'initialisation du plateau et des cases.
 * 
 * @author TODO
 * @version TODO
 */
public class Plateau {
	/** TODO. */
	public Bille[][] plat;

	public Plateau(Joueur joueur1, Joueur joueur2) {
		this.plat = new Bille[9][9];
		
		for (int numberLine = 0; numberLine < 9 ; numberLine++)
			for (int numberColumn = 0; numberColumn < 9; numberColumn++)
				if ((numberColumn == 9 && 4<numberLine )|| (numberColumn == 8 && numberLine > 3)|| (numberColumn == 7 && (4<numberLine && numberLine<8))) {
						
						this.plat[numberLine][numberColumn] = new Bille(joueur1);
				}
				else if((numberColumn == 1 && (0<numberLine && numberLine<6))||(numberColumn == 2 && (0<numberLine && numberLine<7))|| (numberColumn == 3 && (2<numberLine && numberLine<6)))
							
						this.plat[numberLine][numberColumn] = new Bille(joueur2);
		
    }
	
	@Override
	public String toString() {
		String plateauAsciiArt = "";
		for (int numberLine = 0; numberLine < 9 ; numberLine++)
			for (int numberColumn = 0; numberColumn < 9; numberColumn++)
				if ((numberColumn == 9 && 4<numberLine )|| (numberColumn == 8 && numberLine > 3)|| (numberColumn == 7 && (4<numberLine && numberLine<8))) {
						
							plateauAsciiArt += "B ";
				}
				else if((numberColumn == 1 && (0<numberLine && numberLine<6))||(numberColumn == 2 && (0<numberLine && numberLine<7))|| (numberColumn == 3 && (2<numberLine && numberLine<6)))
							
							plateauAsciiArt += "W ";
				else 
							plateauAsciiArt += "x ";
		
		plateauAsciiArt += "\n";
	

		return plateauAsciiArt;
	}
	 
    public boolean mouvementPossible(int positionXDepart,int positionYDepart,int positionXArrivee, int positionYArrivee)
    {
    	return true;
    }
    
    public void deplacerBille(int positionXDepart,int positionYDepart,int positionXArrivee, int positionYArrivee)
    {
    	/* Gestion de la boule principale. */
    	plat[positionXArrivee][positionYArrivee] = plat[positionXDepart][positionYDepart];
    	plat[positionXDepart][positionYDepart] = null;
    	/* Gérer les mouvements induits. */
    }
}
