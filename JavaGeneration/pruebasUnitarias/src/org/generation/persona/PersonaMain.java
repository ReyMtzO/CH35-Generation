package org.generation.persona;

public class PersonaMain {
	public static void main(String[] args) {
		//Instanciar los objetos
		Persona persona1 = new Persona("Daniel", "Maldonado", "daniel@gmail.com", 36);
		Persona persona2 = new Persona("Mariana", "Valladolid", "mariana.val@hotmail.com", 26);
		Persona persona3 = new Persona("Enrique", "Cano", "enrique.cano@gmail.com", 41);
		Persona persona4 = new Persona("Maara", "Lomeli", "maara.lomeli@generation.org", 31);
		
		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println(persona3);
		System.out.println(persona4);
	}
}