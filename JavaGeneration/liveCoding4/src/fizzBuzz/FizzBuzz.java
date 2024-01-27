//Rey David Martínez Olivares
/*
 * Retroalimentación:
 * - Buen manejo de la lógica de programación
 * - Conocimiento de ciclo for y de if's anidados
 * - Explicación clara del proceso (comprender algoritmo - plasmar en código)
 * - Seguir practicando para más agilidad al resolver algoritmos
 * */
package fizzBuzz;

class FizzBuzz {

	public void imprimir() {
     for (int i = 1; i <= 100; i++) {
         if (i % 3 == 0 && i % 5 == 0) {
             System.out.println("FizzBuzz");
         } else if (i % 3 == 0) {
             System.out.println("Fizz");
         } else if (i % 5 == 0) {
             System.out.println("Buzz");
         } else {
             System.out.println(i);
         }
     }
   }
}

 class Main {
 public static void main(String[] args) {
     // Crear objeto de la clase FizzBuzz
     FizzBuzz fizzBuzz = new FizzBuzz();

     // Llamar al método imprimir para mostrar los resultados
     fizzBuzz.imprimir();
  }
}
