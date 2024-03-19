package com.donreydev.interfaces;

public class Cuadrado2 implements FiguraInterfaz, Dibujable {
	
	private double lado;
	
	public Cuadrado2() {
	}
	
	public Cuadrado2(double lado, double x, double y) {
		this.lado = lado;
	}
	
	@Override
	public double calcularArea() {
		double resultado = lado * lado;
		return resultado;
	}

	@Override
	public void dibujar() {
		System.out.println("Hola, estoy dibujando un cuadrado");
		
	}
}
