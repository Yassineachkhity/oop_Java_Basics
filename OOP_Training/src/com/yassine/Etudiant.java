package com.yassine;

public class Etudiant {
	
	private String nom;
	private float note1, note2;
	
	public Etudiant(String nom, float note1, float note2) {
		this.nom = nom;
		this.note1 = note1;
		this.note2 = note2;
	}
	
	public float calcMoy() {
		return (this.note1 + this.note2) / 2;
	}
	
	public void afficher() {
		System.out.println("Etudiant: " + this.nom + "\n moyenne: " + calcMoy());
	}
	

	public static void main(String[] args) {
		
		Etudiant etudiant = new Etudiant("yassine", 19, 15);
		etudiant.afficher();
	}

}
