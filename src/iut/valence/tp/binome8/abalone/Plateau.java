package iut.valence.tp.binome8.abalone;

/* Classe d'initialisation du plateau et des cases*/
public class Plateau {
	
	public Bille[][] plat;

	public Plateau() {
		this.plat = new Bille[9][9];
		
		for (int numberLine = 0; numberLine < 9 ; numberLine++)
			for (int numberColumn = 0; numberColumn < 9; numberColumn++)
				if ((numberColumn == 9 && 4<numberLine )|| (numberColumn == 8 && numberLine > 3)|| (numberColumn == 7 && (4<numberLine && numberLine<8))) {
						
						this.plat[numberLine][numberColumn] = new Bille(Joueur.black);
				}
				else if((numberColumn == 1 && (0<numberLine && numberLine<6))||(numberColumn == 2 && (0<numberLine && numberLine<7))|| (numberColumn == 3 && (2<numberLine && numberLine<6)))
				
					
						this.plat[numberLine][numberColumn] = new Bille(Joueur.white);
				
			
		/* TODO Initialisation des cases. */
    }
    
    //	public boolean caseVide(int nbLigne, int nbColonne)
    //	{
    //	try {
    //		return this.plat[nbLigne][nbColonne] == null;
    //	}
    //
    //	catch(ErreurCase e) {
    //		System.out.println("Erreur test case : coordonnees hors plateau");
    //		return false;
    //}
    //}
}