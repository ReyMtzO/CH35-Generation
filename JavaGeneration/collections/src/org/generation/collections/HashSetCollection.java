package org.generation.collections;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetCollection {

	public static void main(String[] args) {
		//HashSet es una clase de Collections donde cada elemente es único, es decir, no se repiten los elementos.
		HashSet<String> animals = new HashSet<String>();
		
		animals.add("Búho");
		animals.add("Caballo");
		animals.add("Perro");
		animals.add("Gato");
		animals.add("Ornitorrinco");
		animals.add("Ornitorrinco");
		animals.add("Capibara");
		animals.add("Zebra");
		animals.add("Ornitorrinco");
		animals.add("Mapache");
		animals.add("Mapache");
		animals.add("Mapache");
		
		//Imprimir el HashSet
		System.out.println(animals);
		
		//Conocer si un elemento se encuentra dentro del Set: contains();
		System.out.println(animals.contains("Capibara"));
		
		//Eliminar un elemento: remove();
		animals.remove("Zebra"); //Elimino
		System.out.println(animals); //Imprimo el Set sin el elemento eliminado
		
		//Agregando elementos en una sola línea
		animals.addAll(Arrays.asList("Perrito", "Gatito", "Osito", "Tepezcuintle"));
		
		/*
		 * La clase HashSet no va a garantizar que los elementos se muestren según el orden establecido, ya que busca eficientar la búsqueda y recuperación de los elementos.
		 * Utiliza tablas hash para almacenar los elementos y mostrarlos al usuario.
		 * */
		//Limpiar el HashSet: .clear();
		animals.clear();
		System.out.println(animals);
	}

}
