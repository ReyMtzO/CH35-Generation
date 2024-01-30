package org.generation.threads;

/*
 * A diferencia de la clase HiloOne que hereda de Thread, en esta clase vamos a implementar una interface de tipo Runnable.
 * La interfaz Runnable debe ser implementada por cualquier clase cuyas instancias estén destinadas a ser ejecutadas por un subproceso. 
 * La clase debe definir un método sin argumentos llamado ejecutar.
 * */

public class HiloTwo implements Runnable {
	
	@Override
	public void run() {
		for(int i = 0; i <= 5; i++) {
			System.out.println(i);;
		}		
	}
}