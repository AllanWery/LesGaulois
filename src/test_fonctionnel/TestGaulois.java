package test_fonctionnel;

import gaulois.Gaulois;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois ast = new Gaulois("Ast�rix", 18);
		Gaulois obe = new Gaulois("Ob�lix", 18);
		ast.parler("Bonjour Ob�lix");
		obe.parler("Bonjour Ast�rix. Ca te dirais d'aller chasser des\r\n" + "sangliers ?");
		ast.parler("Oui tr�s bonne id�e.");

	}
}
