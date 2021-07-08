package fr.eni;

public class Ville {

	private String nom;
	
	public Ville(String nom) {
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
		return "Ville [nom=" + nom + "]";
	}
	
	

}
