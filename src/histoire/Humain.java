package histoire;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;

	public Humain(String nom, String boisson, int argent) {
		super();
		this.nom = nom;
		this.boisson = boisson;
		this.setArgent(argent);

	}

	public void gagnerArgent(int gain) {
		setArgent(getArgent() + gain);

	}

	public void perdreArgent(int perte) {
		setArgent(getArgent() - perte);

	}

	public String getNom() {
		return nom;
	}

	public String getBoisson() {
		return boisson;
	}

	public void parler(String texte) {
		System.out.println("[" + nom + "] : " + texte);

	}

	public void direBonjour() {
		parler("Bonjour! Je m’appelle" + this.getNom() + "et j’aime boire du" + boisson);

	}

	public void boire() {
		parler("Mmmm, un bon verre de" + this.getBoisson() + "! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (prix <= getArgent()) {
			perdreArgent(prix);
			parler("J’ai acheté " + bien + " pour " + prix + " euros.");
		} else {
			parler("Je n’ai pas assez d’argent pour acheter " + bien + "...");
		}

	}

	public int getArgent() {
		return argent;
	}

	public void setArgent(int argent) {
		this.argent = argent;
	}

}
