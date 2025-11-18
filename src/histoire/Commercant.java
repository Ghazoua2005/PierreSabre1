package histoire;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}

	int argentPerdu = getArgent();

	int seFaireExtorquer() {
		int somme = getArgent();
		parler("Le monde est vraiment trop injuste.");
		return somme;
	}

	public void recevoir(int argent) {
		setArgent(getArgent() + argent);
		parler("Merci ! Vous êtes trop bon.");

	}

}
