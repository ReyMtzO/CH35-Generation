package controlFlujo;

import java.util.Scanner;


public class EjercicioCine {

	public static void main(String[] args) {
		
		//Switch: para seleccionar comida de la dulcería del cine
		
				
				//Crear un menu
				System.out.println("Bienvenido a la dulcería, qué desea ordenar?");
				System.out.println("--------------------------------------------");
				System.out.print("   Menu\n"
						+ "1. Palomitas\n"
						+ "2. Refresco\n"
						+ "3. Nachos\n"
						+ "4. HotDog\n"
						+ "5. Pagar");
				
				Scanner scanner = new Scanner(System.in);		
				//Selección de opciones, Variable que almacena dicha opción
				int num = scanner.nextInt();
				
				
				switch (num) {
				//Aqui agregamos una opción y mensaje.
				case 1:
					System.out.println("Usted ha agregado Palomitas a su combo.");
					break;
				case 2:
					System.out.println("Usted ha agregado Refresco a su combo.");
					break;
				case 3: 
					System.out.println("Usted ha agregado Nachos a su combo.");
					break;
				case 4: 
					System.out.println("Usted ha agregado HotDog a su combo.");
					break;	
				case 5: 
					System.out.println("Usted ha seleccionado Pagar su combo.");
					break;
				default:
					System.out.println("No contamos con eso en nuestro menu, por favor seleccione una opción válida (1-5).");
					break;
				}
				scanner.close();
	}
}
