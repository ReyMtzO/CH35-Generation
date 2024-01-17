package loops;

public class ForLoop {

	public static void main(String[] args) {
		/*
		 * El ciclo For, nos proporciona una forma compacta de iterar sobre valores.
		 * 
		 * for (inicialización; condición; modificación) {
		 * bloque de código
		 * } 
		 * */

		//for con variable local
		for(int number = 0; number <= 10; number ++) {
			System.out.println("Número es igual a "+ number);
		}
		
System.out.println("----------------------------------");

		//for con variable global
		int contador;
		for(contador = 1; contador <= 5; contador ++) {
			System.out.println("La cuenta es "+ contador);
		}
		
System.out.println("----------------------------------");
		
		//Bucles anidados- Bucle dentro de otro bucle.
		//Imprimir un triángulo con asteriscos
		
		int filas = 5;
		for(int i = 0; i < filas; i ++) {
			//bloque de código que va a iterar con el bucle
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}//método

}//class