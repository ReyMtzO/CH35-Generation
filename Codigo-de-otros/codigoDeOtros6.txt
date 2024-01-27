//Rey David Martínez Olivares   4/5
package codigoOtros6;

import java.util.Scanner;

public class Codigo6 {   //Nombre de clase iniciando con mayúsculas
	  public static void main(String[] args) {
		  		  
	    int[] n = new int[20];    //Agregamos palabra reservada "new" porque se guarda un nuevo arreglo en la variable

	    for (int i = 0; i < 20; i++) {  //Le faltaba un signo de "+"
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.println(n[i] + " ");    //Estaba mal escrito el System.out.println();
	    }
	    
	    System.out.println("\n¿Qué números quiere resaltar? ");  //Faltaba una "n"
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    Scanner scanner = new Scanner(System.in);
	    
	    int opcion = scanner.nextInt();
		
	   // int opcion = Integer.parseInt(System.console().readLine());   //Agregamos ")" por sintaxis

	    int multiplo = ((opcion == 1) ? 5 : 7);  //Invertimos ? y :

	    for (int e : n) {			//Cambiamos el nombre del ciclo, de foreach a for.
	      if (e % multiplo == 0) {		//Cambiamos el tdd char por int
	        System.out.print("[" + e + "] ");
	      } else {								//Faltaba "}" en el else
	        System.out.print(e + " ");      //Cambiamos a .out
	      }
	      
	     }
	    
	    scanner.close();
	    }
	
	}