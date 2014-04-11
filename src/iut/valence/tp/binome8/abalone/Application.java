package iut.valence.tp.binome8.abalone;

/** Classe d'initialisation du jeu. */
public class Application {

	public static void main(String[] args) throws NumberFormatException, ErreurCase {
		Jeu j = new Jeu("Tom","Jerry");
		j.jouer();
	}

}
