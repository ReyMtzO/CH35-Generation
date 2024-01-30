package org.generation.employee;

/*
 * Abstracción. Permite identificar aspectos esenciales de un objeto y ocultar los detalles irrelevantes o complejos.
 * Permite que los métodos tomen diferentes formas al ser heredadas, usando una plantilla base.
 * Interface es una tipo de "clase" que define un conjunto de métodos que pueden ser implementados por diversas clases.
 * */

public class Employee implements Trabajador {
	private String nombreCompleto;
	private int id;
	private double salario;
	private String puesto;
	
	public Employee(String nombreCompleto, int id, double salario, String puesto) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.id = id;
		this.salario = salario;
		this.puesto = puesto;
	}
	
	public void trabajar() {
		System.out.println(this.nombreCompleto + " está trabajando");
	}
	
	public void calcularSalario() {
		System.out.println("El salario base del empleado " + this.nombreCompleto + " es de $" + this.salario);
	}
	
	public void capacitarse() {
		System.out.println("El trabajador con el puesto "+ this.puesto + " se capacita");
	}
	
	public void infoGeneral() {
		System.out.println("Id: " + this.id + ", Nombre: " + this.nombreCompleto + ", Puesto: "+ this.puesto);
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return "Employee: NombreCompleto =" + nombreCompleto + ", id =" + id + ", salario =" + salario + ", puesto ="
				+ puesto;
	}
		
}
