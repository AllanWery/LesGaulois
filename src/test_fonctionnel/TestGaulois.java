package test_fonctionnel;

import gaulois.Gaulois;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois ast = new Gaulois("Astérix", 18);
		Gaulois obe = new Gaulois("Obélix", 18);
		ast.parler("Bonjour Obélix");
		obe.parler("Bonjour Astérix. Ca te dirais d'aller chasser des\r\n" + "sangliers ?");
		ast.parler("Oui très bonne idée.");

	}
}
