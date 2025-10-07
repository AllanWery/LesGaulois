package gaulois;

public class Village {

	private String nom;
	private int nbVillageois;
	private Gaulois chef;
	
	public Village(String nom, int nbVillageois, Gaulois chef) {
		this.nom = nom;
		this.nbVillageois = nbVillageois;
		this.chef = chef;
		chef.setVillage(this);
	}
	
	public String getNom() {
		return nom;
	}
	
	private Gaulois getChef() {
		return chef;
	}
	
	public void ajouterVillageois(Gaulois gaulois, int NB_Case) {
		
		//tab = new 
	}
}
