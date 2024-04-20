package com.yassine;
import java.util.Scanner;


public class Point {
	
	private double x;
	private double y;
	
	public Point() {
		this(0, 0);
	}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(Point p) {
		this(p.getX(), p.getY());
	}
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getY() {
		return this.x;
	}
	
	public void translation(double dx, double dy) {
		this.x += dx;
		this.y += dy;
	}
	
	void affiche() {
		System.out.println("les coordonees sont: ");
		System.out.println("x= "+ this.x);
		System.out.println("y= "+ this.y);
	}
	
	void saisirCoordonnees() {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Entrer les coordonnees: ");
			System.out.println("x= ");
			this.x = scanner.nextDouble();
			System.out.println("y= ");
			this.y = scanner.nextDouble();
			
		} catch (Exception e) {
            System.out.println("Invalid input. entrer les valeurs numériques.");
        }
	}
	
	
	public double distance(Point p) {
		double dx = this.x - p.getX();
		double dy = this.y - p.getY();
		
		return Math.sqrt(dx * dx + dy * dy);
		
	}
	
	public Point milieu(Point p) {
		double midX = (this.x + p.getX()) / 2;
		double midY = (this.y + p.getY()) / 2;
		
		return new Point(midX, midY);
	}
	
	
    public static void main(String[] args) {
        Point p = new Point(1, 7);
        Point x = new Point(2, 3);
        
        p.affiche();
        p.translation(2, -1);
        p.affiche();
        
        System.out.println("Distance entre p et x: " + p.distance(x));
        
        Point midpoint = p.milieu(x);
        midpoint.affiche();
    }

}

