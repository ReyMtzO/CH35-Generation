package com.donreydev.herencia;

public class Herencia {

	public static void main (String[] args) {
		
		Empleado emple = new Empleado();
		
		emple.getNum_legajo();
		emple.getNombre();
		
		Consultor consul = new Consultor();
		consul.getNum_consultor();
		consul.getNombre();
		
		Persona vector [] = new Persona [5];
		vector [0] = new Persona();
		vector [1] = new Empleado();
		vector [2] = new Consultor();
		vector [3] = new Jefe();
		
		Persona person = new Persona();
		Consultor consult = new Consultor();
		Jefe jefe = new Jefe();
		
		person = consult;
	}
}
