package com.donreydev.encapsulamiento;

public class Encapsulamiento {

	public static void main(String[] args) {
		
		Alumno alu = new Alumno();
		Alumno alu2 = new Alumno(29, "Rey David", "Martínez");
		
		System.out.println("Id: " + alu2.getId());
		System.out.println("Nombre: " + alu2.getNombre());
		System.out.println("Apellido: " + alu2.getApellido());
	}
}
