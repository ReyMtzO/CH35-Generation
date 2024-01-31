package org.generation.calculadora;

public class CalculadoraMain {

	public static void main(String[] args) {

		//Instanciar objetos
		Calculadora calculadora = new Calculadora();
		
		//System.out para invocar los métodos
		//Método sumar
		System.out.println("El resultado de la suma es " + calculadora.sumar(7, 9));
		
		//Método restar
		System.out.println("El resultado la resta es " + calculadora.restar(7, 9));
		
		//Método multiplicar
		System.out.println("El resultado de la multiplicación es " + calculadora.multiplicar(7, 9));
		
		//Método dividir
		System.out.println("El resultado de la división es " + calculadora.dividir(50, 9));
		
	}
}
