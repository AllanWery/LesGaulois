package gaulois;

public class Gaulois {

	private String nom;
	private int force;
	private int numero;

	public Gaulois(String nom, int force, int numero) {
		this.nom = nom;
		this.force = force;
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public static void main(String[] args) {
		Gaulois ast = new Gaulois("Astérix", 8, 1);

		System.out.println(ast);

	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=\" + force + \"]";
	}

	public void frapper(Romain romain) {
		String nomRomain = romain.getNom();
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + nomRomain);
		int forceCoup = force / 3;
		romain.recevoirCoup(forceCoup);
	}
	public void setVillage(Village village) {
	     // String v = new village(gaulois);
	}
}
