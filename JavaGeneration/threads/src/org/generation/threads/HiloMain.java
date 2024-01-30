package org.generation.threads;

/*
 * Debemos instanciar objetos, en este caso de HiloOne que no recibe argumentos
 * */

public class HiloMain {
	public static void main(String[] args) {
		HiloOne hilo1 = new HiloOne();
		Thread hilo2 = new Thread(new HiloTwo());	//Vamos a instanciar el segundo hilo pero de tipo Thread que llamaremos hiloDos que construye un nuevo Thread y recibe por argumentos la nueva Clase HiloTwo
		
		//Mandamos a llamar el primer hilo y le agregamos un método .start() que nos permite iniciar la ejecución del hilo. start() Hace que este hilo comience a ejecutarse; la Máquina Virtual Java llama al método de ejecución de este hilo.
		hilo1.start();
		hilo2.start();
		//Se ejecutan de manera simultánea según el hilo
	}

}