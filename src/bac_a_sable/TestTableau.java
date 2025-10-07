package bac_a_sable;

public class TestTableau {

	
	public static void main(String[]args) {
		int[] tableauEntier = {1,2,3};
		System.out.println(tableauEntier);
		for (int entier : tableauEntier) {
			System.out.print(entier + " ");
			}
		
		for (int i = 0; i < tableauEntier.length; i++) {
		int entier = tableauEntier[i];
		System.out.print(entier);
		
		if (i < tableauEntier.length - 1) {
		System.out.print(", ");
		}
		}
		String[] tableauChaines = new String[5];
		
		int nbChaines = 0;
		tableauChaines[nbChaines] = "Hello";
		nbChaines++;
		tableauChaines[nbChaines] = "World";
		nbChaines++;
		
		for (int i = 0; i < nbChaines; i++) {
			System.out.print(tableauChaines[i] + " ");
			}
		
		tableauChaines[3] = " !";
		
		for (String chaine : tableauChaines) {
			if (chaine != null) {
			System.out.print(chaine + " ");
			}
			}
	}  
}
