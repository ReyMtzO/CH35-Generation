//Rey David Martínez Olivares  4/5
package codigoOtros5;

import java.util.Scanner;  //Importamos la clase Scanner

public class Codigo5 {
		public static void main(String[] args) {

	    Scanner s = new Scanner(System.in);  //Agregamos (System.in)
	    System.out.println("Introduzca un número: ");  //Cerrar comillas dobles en String
	    int numIngresado = s.nextInt();  //Cambiamos nextLine() por nextInt() para que el usuario ingrese datos de tipo número y también cambiamos el tipo de dato de la variable a int
	    int num = numIngresado; 
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (numIngresado > 0) {
		  int digito = (int)(numIngresado % 10);
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
		  
			numIngresado /= 10;
	    }
	    if (afo > noAfo) {
	      System.out.println("El " + num + " es un número afortunado.");  //Faltaba la "t" en println()
	    } else {
	      System.out.println("El " + num + " no es un número afortunado.");
	    } 
	    break;  //Agregamos un break para no generar un ciclo infinito
	  }
	  
	    s.close();  //Cerramos el Scanner
	}
}
