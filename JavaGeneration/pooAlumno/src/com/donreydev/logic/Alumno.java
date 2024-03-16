package com.donreydev.logic;

public class Alumno {
	
	long id;
	String nombre;
	String apellido;
	
	
	public Alumno() {
	}
	
	
	public Alumno(long id, String nombre, String apellido) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}  


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public void mostrarNombre() {
		System.out.println("Hola, soy un alumno y sé decir mi nombre");
	}

}
