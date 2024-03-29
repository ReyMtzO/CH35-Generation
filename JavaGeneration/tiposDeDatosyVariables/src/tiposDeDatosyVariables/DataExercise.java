package tiposDeDatosyVariables;
import java.lang.Integer; 

public class DataExercise {

	public static void main(String[] args) {

		System.out.println("Hello, World!");
		
		byte age = 30; //Sirve para representar un número entero 8 bits(-128 al 127)
		System.out.println("La edad del participante es: "+age);
		
		short newUsers = 200; //Sirve para representar un número entero 16 bits (-23768 al 32767)
		System.out.println("Usuarios nuevos: " +newUsers);
		
		int totalUsers = 8752; //Sirve para representar un número entero 32 bits (-2147483648 al 2147483647)
		System.out.println("Usuarios Totales: "+totalUsers);
		
		long premiumUsers = 9512; //Sirve para representar un número entero con valores mucho mayores
		System.out.println("Usuarios premium: "+premiumUsers);
		
		
		//Tipos de datos con números decimales
		
		float altura = 1.73f; //Sirve para representar un valor numérico con números decimales, cuyo valor es de 23 bits, puede tener 8 caracteres despues del punto decimal y tiene que llevar una f al final
		System.out.println("Altura del usuario: "+altura);
		
		double peso = 75.200; //Sirve para representar valores numericos con decimales, cuyo valor es de 64 bits y puede tener hasta quince caracteres despues del punto decimal
		System.out.println("El peso del usuario es: "+peso);
		
		String userName = "Rey David"; //Es una clase para tener cadenas de texto
		System.out.println("Usuario: "+userName);

		
		String costoBoleto = "500";//Es una clase para tener cadenas de texto
		System.out.println("Usuario "+costoBoleto);
		
		String zonaBoleto = "52";
		System.out.println("Zona a la que pertenece "+zonaBoleto);
		
		char section = 'B'; //Sirve para representar valores con un solo caracter
		System.out.println("Sección "+section);
		
		boolean frecuentClient = true; //Sirve para obtener true o false utilizando condicionales
		System.out.println("Es cliente "+ userName + " es un cliente Frecuente..."+frecuentClient);
		
		
		//Conversión de tipos
		int pesoCambio = (int) peso;
		
		//Casteo entero
		long pesoCambio1 = (long) peso;
		
		System.out.println("double: "+peso);
		System.out.println("int: "+pesoCambio);
		System.out.println("long: "+pesoCambio1);
		
		int nombreCambio = Integer.parseInt(costoBoleto);
		double zonaCambio = Double.parseDouble(zonaBoleto);
		
		System.out.println("Zona del usuario según su boleto "+(nombreCambio * zonaCambio));
		
		
		/* Operadores aritméticos 
		+ suma
		- resta
		* multiplicación
		/ división
		% Residuo */
		
		
		/* Operadores de comparación 
		 == compara si un opernado es igual a otro 
		 != compara si es diferente 
		 <  mayor que 
		 >  menor que 
		 <= mayor o igual que 
		 >= menor o igual que */
		
		
	}

}

/*Comentario
 * multilinea*/

//Comentario de una sola línea

