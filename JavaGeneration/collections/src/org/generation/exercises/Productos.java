package org.generation.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Productos {
	public static void main(String[] args) {
		/**
		 * Crear un programa que le permita al usuario agregar un id de producto y el
		 * nombre del producto. Mostrar la lista de productos.
		 */

		// Crear un HashMap para almacenar datos de productos (Id, Nombre)
		Map<Integer, String> productosData = new HashMap<>();

		// Crear un objeto Scanner para leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);

		String producto;

		do {
			System.out.print("Ingrese el Id del producto (entero) o 0 para detenerse: ");
			producto = scanner.nextLine();

			// Convertir la entrada del Scanner a un entero (Id del producto)
			int productId = Integer.parseInt(producto);

			// Pedir al usuario que ingrese el nombre del producto
			System.out.print("Ingrese el nombre del producto o 0000 para detenerse: ");
			String productName = scanner.nextLine();

			// Agregar el producto al mapa
			productosData.put(productId, productName);
			
		} while (Integer.parseInt(producto) != 0);

		// Cerrar el Scanner (buena práctica)
		scanner.close();

		// Mostrar la lista de productos
		System.out.println("\nLista de Productos:");
		for (Map.Entry<Integer, String> productoData : productosData.entrySet()) {
			if (productoData.getKey() != 0) {
				System.out.println("Id: " + productoData.getKey() + ", Producto: " + productoData.getValue());
			}
		}
	}
}