package loops;

public class DoWhileLoop {
	
	public static void main(String[] args) {
		/*
		 * Ciclo Do While, evalua la expresión en la parte inferior del ciclo.
		 * Por tanto, las declaraciones dentro del bloque "do" siempre se ejecutan al menos una vez.
		 * */
		
		//Cuenta del 1 al 20
		int cuenta = 1;
		do {
			System.out.println(cuenta);
			cuenta ++;
		} while (cuenta < 0); //Output, 1 ya se ejecutó al menos 1 vez.
	}

}
