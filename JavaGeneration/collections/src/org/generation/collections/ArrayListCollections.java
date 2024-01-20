package org.generation.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCollections {

	public static void main(String[] args) {
		//********** Arrays ***********//
		String[] names = {"Jonathan", "Eunice", "Braulio", "Arturo", "Ana", "Rocio", "Martín"};
		//Imprimiendo Arrays
		System.out.println(Arrays.toString(names));
		
		int[] edades = {12, 54, 30, 59, 46, 26,18};
		System.out.println(Arrays.toString(edades));
		
		//Acceder a cada elemento del Array
		String name1 = names[0];
		System.out.println("El primer nombre de la lista es "+name1);
		int edad1 = edades[2];
		System.out.println("La edad de "+ name1 + " es "+ edad1 + " años"); //La edad de Jonathan es de 30 años
		
		//Obtener la longitud del Array
		int longitudNames = names.length;
		System.out.println("El array tiene "+longitudNames + " elementos");
		
		//Obtener el último elemento
		//String ultimoElemento = names[longitudNames - 1]; //La longitud ya vive en la variable ´longitudNames´
		
		String ultimoElemento = names[names.length - 1]; //La longitud NO vive en una variable
		System.out.println("El último elemento del Array names es "+ ultimoElemento); //Martín
		
		//Mostrar cada elemento utilizando forEach
		for(String name: names) {
			System.out.println(name);
		}
			
		//************** ArrayList *************//
		//Arraylist es un array que puede cambiar de tamaño. Es la clase de Java que representa la estructura de datos de Arrays. Permite elementos duplicados y recibe varios métodos para su manipulación
			ArrayList<String> films = new ArrayList<String>();
			ArrayList<Integer> matricula = new ArrayList<Integer>(); //Wrapper class
			ArrayList<Character> characters = new ArrayList<Character>();
			
			//Agregar elementos
			films.add("Inception");
			films.add("Se7en");
			films.add("The Shining");
			films.add("Pulp fiction");
			films.add("Mr. Nobody");
			films.add("The shooter island");
			films.add("Ready player One");
			
			System.out.println(films);
			
			//Obtener un elemento: name.get(index);
			String film1 = films.get(0);
			System.out.println("La primer película es "+ film1);
			
			//Modificar un elemento: name.set(index, newValue)
			String film3 = films.set(3, "Memento");
			String film3Get = films.get(3);
			System.out.println(film3Get);
			
			//Conocer el tamaño del ArrayList: name.size();
			int sizeFilms = films.size();
			System.out.println("El tamaño del ArrayList films es de "+ sizeFilms + " elementos");
			
			//Agregar un elemento y después eliminarlo: name.remove(index);
			films.add("The fountain");
			System.out.println(films);
			
			films.remove(7);
			System.out.println(films);
			
			//Mostrando los elementos del ArrayList en lista
			System.out.println("**** Films en lista ****");
			for(String film : films) {
				System.out.println(film);
			}
			
			matricula.add(25253);
			System.out.println(matricula);
	}
}
