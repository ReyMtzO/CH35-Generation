package org.generation.employee.developer;

import org.generation.employee.Employee;

public class Developer extends Employee {
	public String lenguajeProgramacion;

	public Developer(String nombreCompleto, int id, double salario, String puesto, String lenguajeProgramacion) {
		super(nombreCompleto, id, salario, puesto);
		this.lenguajeProgramacion = lenguajeProgramacion;
	}

	public String getLenguajeProgramación() {
		return lenguajeProgramacion;
	}

	public void setLenguajeProgramación(String lenguajeProgramación) {
		this.lenguajeProgramacion = lenguajeProgramación;
	}
	
	public void codear() {
		System.out.println("El programador " + this.getNombreCompleto() + " utiliza " + this.lenguajeProgramacion);
	}

	@Override
	public String toString() {
		return "Developer [Id=" + getId() + ", NombreCompleto=" + getNombreCompleto() + ", Puesto=" + getPuesto() + ", Salario="	+ getSalario() + ", lenguajeProgramacion=" + lenguajeProgramacion + "]";
	}

}
