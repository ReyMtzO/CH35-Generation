package com.donreydev.logic;

public class AlumnoMain {
	
	public static void main(String[] args) {
		
		Alumno alu1 = new Alumno();
		Alumno alu2 = new Alumno(5, "Luisina", "de Paula");
		
		System.out.println("El id del alumno 2 es: " + alu2.getId());
		System.out.println("El nombre del alumno 2 es: " + alu2.getNombre());
		System.out.println("El apellido del alumno 2 es: " + alu2.getApellido());
		
		
		alu1.setId(4);
		alu1.setNombre("Carlos");
		alu1.setApellido("Mclovin");
		
		System.out.println("-------------------------------");
		System.out.println("El id del alumno 1 es: " + alu1.getId());
		System.out.println("El nombre del alumno 1 es: " + alu1.getNombre());
		System.out.println("El apellido del alumno 1 es: " + alu1.getApellido());
		
		//Cambio de valor
		alu2.setId(35);
		
		System.out.println("-------------------------------");
		System.out.println("El id del alumno 2 es: " + alu2.getId());
		System.out.println("El nombre del alumno 2 es: " + alu2.getNombre());
		System.out.println("El apellido del alumno 2 es: " + alu2.getApellido());
	}
}
