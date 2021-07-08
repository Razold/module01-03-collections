package fr.eni;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMaps {

	public static void main(String[] args) {
		Map<String,String> depts= new HashMap<String,String>();
		depts.put("44", "Loire-Atlantique");
		depts.put("29", "Finistère");
		depts.put("22", "Côte d'Armor");
		depts.put("56", "Morbihan");
		depts.put("35", "Ille-Et-Vilaine");
		
		Set<String> cles = depts.keySet();
		for(String c : cles) {
			System.out.println(c+" : "+depts.get(c));
		}
		Collection<String> valeurs = depts.values();
		for(String v :valeurs) {
			System.out.println(v);
		}
		
		Restaurant r1 = new Restaurant("La villa Médicis");
		Restaurant r2 = new Restaurant("La grande Bouffe");
		
		Ville v1 = new Ville("Nantes");
		Ville v2 = new Ville("Rennes");
		
		Map<Restaurant,Ville> maMapResto= new HashMap<Restaurant,Ville>();
		maMapResto.put(r1, v1);
		maMapResto.put(r2, v2);
		
		maMapResto.values();//Renvoi la liste des valeurs ici les villes
		
		
		Set<Restaurant> clesRestaurant= maMapResto.keySet();// renvoie la liste des clés(ici des restaurants mis dans une liste
		System.out.println("Le meilleur restaurant de Nantes est:");
		//on prend la liste de tous les restaurants puis pour chacun d'entre eux on compare la ville associée au restaurant courant avec la  ville dont l'on souhaite connaître le resaurant associé
		for(Restaurant r : clesRestaurant) {
			if(maMapResto.get(r)== v1) {
				System.out.println(r.toString());
			}
		}
		
		System.out.println("Le meilleur restaurant de Rennes est:");
		//on prend la liste de tous les restaurants puis pour chacun d'entre eux on compare la ville associée au restaurant courant avec la  ville dont l'on souhaite connaître le resaurant associé
		for(Restaurant r : clesRestaurant) {
			if(maMapResto.get(r)== v2) {
				System.out.println(r.toString());
			}
		}

		//maMapResto.getKey(v2);
	

		//Faire une boucle en recherchant parmi toute les clé(keySet()) la première avec la valeur voulue pour valeur (foreach)
	}
}
