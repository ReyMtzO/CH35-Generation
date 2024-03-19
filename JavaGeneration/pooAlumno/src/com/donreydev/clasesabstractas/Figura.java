package com.donreydev.clasesabstractas;

public abstract class Figura {

	protected double x; //Posición en x
	protected double y; //Posición en y
	
	protected Figura() {
	}
	
	protected Figura(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract double calcularArea();
}
