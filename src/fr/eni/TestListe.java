package fr.eni;

import java.util.ArrayList;
import java.util.List;

public class TestListe {

	public static void main(String[] args) {
		List<String> couleurs= new ArrayList<>();
		couleurs.add("Bleu");
		couleurs.add("Rouge");
		couleurs.add("Vert");
		
		System.out.println("\nCouleur via le foreach");
		for(String c: couleurs){
			System.out.println(" - "+ c);
		}

		System.out.println("\nCouleur via l'autre boucle for");	
		for(int indiceCouleur=0;indiceCouleur < couleurs.size(); indiceCouleur++){
			System.out.println(" - "+indiceCouleur+" : "+couleurs.get(indiceCouleur));
		}
		
		
		//on modifie l'élements à l'indice 2
		couleurs.set(2, "Vert");
		System.out.println("Indice 2 : "+couleurs.get(2));
		
		//On donne l'indice de la chaine de caractère "Vert"
		System.out.println("Vert : position "+couleurs.indexOf("Vert"));
		
		//Supprimer un élement
		couleurs.remove(1);
		
		couleurs.remove("Rouge");// remove enlève l'objet de la liste mais ne supprime pas l'objet
		
		
		//Verifions que l'élement en position 1 est supprimé (soit "Rouge")
		for(int indiceCouleur=0;indiceCouleur < couleurs.size(); indiceCouleur++){
			System.out.println(" - "+indiceCouleur+" : "+couleurs.get(indiceCouleur));
		}
		
		//Déclarer et instancier le dictionnaire clé/valeur

		System.out.println("liste vide ? "+ (couleurs.isEmpty()?"VRAI":"FAUX"));//Verifie si la liste est vide//Operateur ternaire isEmpty()?=> si(isEmpty()) faire "VRAI" sinon "FAUX"

	}

}
