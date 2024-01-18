package ecommerce;

import java.util.Scanner;

public class FuncionDescuento {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el costo del producto"); //Obtener el precio del producto
		double precioProducto = scanner.nextDouble();
		
		double porcentajeDescuento = 15; //Obtener el porcentaje de descuento
		double descuento = calcularDescuento(precioProducto, porcentajeDescuento);
		
		double porcentajeImpuesto = 3; //Obtener el impuesto
		double impuesto = calcularImpuesto(precioProducto, porcentajeImpuesto);
		
		double total = calcularTotal(precioProducto, descuento, impuesto); //Calcular el total
		
		total = redondear(total, 2);
		
		System.out.println("Precio del producto $"+ precioProducto);
		System.out.println("Descuento aplicado al producto $"+ descuento);
		System.out.println("Impuesto aplicado $"+ impuesto);
		System.out.println("Total a pagar $"+ total);
					
	}
	
	static double calcularDescuento(double precio, double porcentajeDescuento) { //Función para calcular el descuento
		return (precio * porcentajeDescuento) / 100;
	}
	
	static double calcularImpuesto(double precio, double porcentajeImpuesto) {
		return (precio * porcentajeImpuesto) / 100;
	}
	
	static double calcularTotal(double precioProducto, double descuento, double impuesto) {
		return (precioProducto - descuento) + impuesto;
	}
	
	static double redondear(double valor, int decimales) {
		double factor = Math.pow(10, decimales);
		return Math.round(valor * factor) / factor;
	}
}

/*
 * La refactorización es reestructurar código que ya existe sin alterar su comportamiento. Tiene como objetivo mejorar la legibilidad, mantenibilidad y optimización de nuestro código.
 * */
