package com.donreydev.interfaces;

public class Circulo2 implements FiguraInterfaz, Dibujable, Rotable {
	
	private double radio;
	
	public Circulo2() {
	}
	
	public Circulo2(double radio) {
		this.radio = radio;
	}
	
	@Override
	public double calcularArea() {
		double pi = 3.14;
		double resultado = pi * radio * radio;
		return resultado;
	}

	@Override
	public void rotar() {
		System.out.println("Hola, estoy rotando un círculo");
	}

	@Override
	public void dibujar() {
		System.out.println("Hola, estoy dibujando un círculo");
	}

}
