package org.donreydev.trabajador;

public class TrabajadorMain {
	public static void main(String[] args) {
	Trabajador Jessy = new Trabajador(14, "Jessica", "Montiel", "Antropóloga Social", 20000d);
	Trabajador Rey = new Trabajador(29, "Rey David", "Martínez", "Desarrollador Backend", 25000d);
	
	
	System.out.println(Jessy);
	System.out.println(Rey);

	System.out.println("--------------------------------");
	
	Jessy.calcularSalario();
	Jessy.capacitarse();
	Rey.calcularSalario();
	Rey.capacitarse();
	
	System.out.println("--------------------------------");
	
	System.out.println("El trabajador " + Jessy.getNombre() + " " + Jessy.getApellido() + " tiene un sueldo de $" + Jessy.getSueldo());
	
	System.out.println("El trabajador " + Rey.nombre + " con puesto " + Rey.puesto + " tiene un sueldo de $" + Rey.sueldo);
	
	System.out.println("--------------------------------");

	Rey.setSueldo(26000d);
	Rey.calcularSalario();
	
	}
}