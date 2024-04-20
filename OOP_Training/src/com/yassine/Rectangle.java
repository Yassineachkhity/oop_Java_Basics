package com.yassine;

public class Rectangle {
	
	private int largeur;
	private int hauteur;
	
	public Rectangle(int largeur, int hauteur) {
		setLargeur(largeur);
		setHauteur(hauteur);
	}
	
	public int getLargeur() {
		return this.largeur;
	}
	
	public void setLargeur(int largeur) {
		if (largeur < 1)
			this.largeur = 1;
		else
			this.largeur = largeur;
	}
	
	public int getHauteur() {
		return this.hauteur;
	}
	
	public void setHauteur(int hauteur) {
		if (hauteur < 1)
			this.hauteur = 1;
		else
			this.hauteur = hauteur;
	}
	
	public int surface() {
		return this.hauteur * this.largeur;
	}
	
	public int perimetre() {
		return 2 * (this.hauteur + this.largeur);
	}
	
	public void affichage() {
		for (int i = 0; i < this.hauteur; i++) {
			for (int j = 0; j < this.largeur; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(5, 3);
		System.out.println("The surface is : " + r.surface());
		r.affichage();
	}

}
