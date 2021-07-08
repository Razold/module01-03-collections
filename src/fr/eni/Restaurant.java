package fr.eni;

public class Restaurant {

	private String nom;
	
	public Restaurant(String nom) {
		this.nom=nom;
	}

	protected String getNom() {
		return nom;
	}

	protected void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Restaurant [nom=" + nom + "]";
	}
	
}
