package operadoresLogicos;

public class OperatorExercises {
	public static void main(String[] args) {
		
		int anios = 5;
		boolean esInfante = true;
		boolean costoInfante = anios <= 12 && esInfante;
		
		System.out.println("Es peque "+ costoInfante);
		
		String cliente = "Cliente123 ";
		String credenciales = "fertakisfuego123";
		
		boolean credencialCorrecta = cliente.equals("Cliente123") && credenciales.equals("fertakisfuego123");
		System.out.println("Las credenciales son válidas "+ credencialCorrecta);
		
		/*
		double costoPasaje = 380.50;
		int edad  = 58;
		boolean credenInapam =false; 
		
		boolean descuentoAdultoMayor = edad >= 60 || credenInapam;
		
		System.out.println("Tiene descuento? " + costoPasaje);
		
		
		
		//! not 
		
		boolean asientosDisponibles = true;
		boolean libres = true;
		boolean asientosConDescuento = !libres;
		
		
		
		System.out.println("Tenemos asientos con descuento " + asientosConDescuento);
		*/
	}
	
}


/* Operador && And devuelve true si ambas expresiones son verdaderas. 
   Operador || Or devuelve true si al menos una de las dos condiciones se cumple.
   Operador ! Not. Si la expresion booleana es false devuelve true y viceversa. */

