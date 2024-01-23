package org.generation.iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableMain {

	public static void main(String[] args) {
		//Podemos iterar sobre una colección de 3 maneras:
		
		//1. Iteración mediante un ciclo for-each
		System.out.println("******For-each******");
		List<String> nombres = new ArrayList<String>();

		nombres.addAll(Arrays.asList("Braulio", "Fernanda", "Rodrigo", "Ruben", "Marco", "Rey"));
		
		for(String nombre : nombres) {
			System.out.println(nombre);
		}
		
		//2. Iterar mediante Iterator
		System.out.println("\n******Iterator******");

		List<String> apellidos = new ArrayList<String>();
		
		apellidos.addAll(Arrays.asList("Alemán", "Garcia", "Martinez", "Cardoso", "Razo", "Ceja"));
		
		//Utilizar un nuevo Iterador y le vamos a pasar el método iterator() a nuestro ArrayList
		Iterator<String> iterador = apellidos.iterator();
		
		//Utilizando while, devuelve verdadesro si la iteración tiene más elementos, si no, se termina el ciclo
		while(iterador.hasNext()) {
			String elemento = iterador.next();
			System.out.println(elemento);
		}
		
		//3. Mediante forEach que toma una expresión Java Lambda como parámetro.
		System.out.println("\n******Lambda******");

		List<String> animales = new ArrayList<String>();
		
		animales.addAll(Arrays.asList("Cuyo", "Nahual", "Tlacuache", "Ajolote", "Tepezcuintle", "Vaquita marina"));
		
		animales.forEach((animal) -> {
			System.out.println(animal);
		});		
	}

}
