package gaulois;

public class Romain {

	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		// TODO Auto-generated method stub
		System.out.println("Le Romain" + nom + "Aie ");
		while (force >= 1) {
			force = forceCoup;
		}

	}
}
