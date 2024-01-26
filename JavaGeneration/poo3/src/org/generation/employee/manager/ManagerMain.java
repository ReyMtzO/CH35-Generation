package org.generation.employee.manager;

public class ManagerMain {
	public static void main(String[] args) {
		Manager Fernanda = new Manager("Fernanda Ramos", 136, 45365.20d, "Manager", 0);
		System.out.println(Fernanda);
		
		//Método calcular salario
		double salarioFer = Fernanda.getSalarioBase();
		//System.out.println("El salario base de "+ Fernanda.getNombreCompleto() + " con posición de " + Fernanda.getPuesto() + "es de $" + salarioFer + " pero posee una antigüedad de " + Fernanda.getAntiguedad() + " años, por lo tanto su salario incrementa a " + );
	}
}
