package histoire;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "Kombucha", 10);
		prof.direBonjour();
		prof.parler("J'ai 54 sous en poche. Je vais pouvoir m'offrir une boisson à 12 sous");
		prof.boire();
		prof.parler("J'ai 42 sous en poche. Je vais pouvoir m'offrir un jeu à 2 sous");
		prof.parler("Je n'ai plus que 40 sous en poche. Je ne peux même pas m'offrir un kimono à 50 sous");

	}

}
