package org.generation.threads;

/*Para que nuestro código extienda de hilos, utilizamos la palabra reservada Thread para heredar de la clase Hilos.
 * Un Thread es un hilo de ejecución en un programa. 
 * La Máquina Virtual Java permite que una aplicación tenga múltiples subprocesos de ejecución ejecutándose simultáneamente.
 * 
 */

public class HiloOne extends Thread {
	//Necesitamos un método que nos permita hacer funcional nuestro hilo, para ellos declaramos un método de tipo void el cual llamaremos run y agregamos una anotación @Override para indicar que estamos sobreescribiendo el método
	@Override
	public void run() {
		for(int i = 0; i <= 5; i++) {
			System.out.println(i);;
		}		
	}
	
}