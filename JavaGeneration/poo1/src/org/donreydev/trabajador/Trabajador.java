package org.donreydev.trabajador;

public class Trabajador {
	
	int id;
	String nombre;
	String apellido;
	String puesto;
	double sueldo;
	
	
	public Trabajador(int id, String nombre, String apellido, String puesto, double sueldo) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.puesto = puesto;
		this.sueldo = sueldo;
		
	}
	
	void trabajar() {
		System.out.println("Estoy trabajando");
	}
	
	void calcularSalario() {
		System.out.println("El sueldo del trabajador " + this.nombre + " " + this.apellido + " es de: $" + this.sueldo + " pesos");
	}
	
	void capacitarse() {
		System.out.println("El empleado con puesto " + this.puesto + " se capacita");
	}
	
	void infoGeneral() {
		System.out.println("Empleado con id " + this.id + ", de nombre " + this.nombre + " " + this.apellido + ", tiene el puesto de " + this.puesto + "con un goce de sueldo de $" + this.sueldo);
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Trabajador [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", puesto=" + puesto
				+ ", sueldo=" + sueldo + "]";
	}
	
}
