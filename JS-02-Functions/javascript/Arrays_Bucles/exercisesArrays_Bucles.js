console.log("Ejercicios");

/*
*Ejercicios

*Ejercicio de Arrays:
Descripción:
Supongamos que tienes una lista de temperaturas diarias en grados Celsius para una semana. Tienes que convertir estas temperaturas a grados Fahrenheit y mostrar los resultados.
* Temperaturas diarias en grados Celsius para una semana
const temperaturasCelsius = [22, 25, 19, 30, 27, 21, 18];

*Instrucciones:
Crea una función llamada celsiusToFahrenheit que tome una temperatura en grados Celsius y la convierta a grados Fahrenheit usando la fórmula: F = C * (9/5) + 32.
Utiliza un bucle para recorrer el array temperaturasCelsius, llama a la función celsiusToFahrenheit para cada temperatura y almacena los resultados en un nuevo array llamado temperaturasFahrenheit.
Muestra ambos arrays (temperaturasCelsius y temperaturasFahrenheit) en la consola.
*/

console.log("Ejercicio de Arrays");
// Temperaturas diarias en grados Celsius de una semana
const temperaturasCelsius = [22, 25, 19, 30, 27, 21, 18];

// Función para convertir de Celsius a Fahrenheit
function celsiusToFahrenheit(celsius) {
  return celsius * (9/5) + 32;
}

// Array para almacenar las temperaturas convertidas a Fahrenheit
const temperaturasFahrenheit = [];

// Convertir las temperaturas y almacenar en el nuevo array
for (let i = 0; i < temperaturasCelsius.length; i++) {
  const temperaturaFahrenheit = celsiusToFahrenheit(temperaturasCelsius[i]);
  temperaturasFahrenheit.push(temperaturaFahrenheit);
}

// Mostrar ambos arrays en la consola
console.log("Temperaturas en Celsius:", temperaturasCelsius);
console.log("Temperaturas en Fahrenheit:", temperaturasFahrenheit);

console.log("----------------------------");

/*
*Ejercicios de Bucles:
*Descripción:
Escribe un programa que sume los primeros 10 números naturales (1 al 10) e imprima el resultado.

*Instrucciones:

Utiliza un bucle (for o while) para sumar los números del 1 al 10.
Imprime el resultado de la suma en la consola.
Sugerencia:
Puedes usar una variable llamada suma para acumular la suma mientras recorres los números.
*/

// Bucle for similar al que vimos en ejercicios la sesión pasada
console.log("Ejercicio de Bucles");
let suma = 0;
for(let i = 1; i <= 10; i++) {
    suma += i;
}
console.log(suma);

console.log("----------------------------");


/*
*Ejercicio : Números Primos
Escribe un programa que determine si un número ingresado por el usuario es primo o no. Un número primo es aquel que solo es divisible por 1 y por sí mismo. Puedes utilizar un bucle for para verificar si el número tiene algún divisor además de 1 y él mismo.*/











/*
*Ejercicio : Secuencia de Fibonacci
Escribe un programa que genere los primeros 10 términos de la secuencia de Fibonacci. La secuencia de Fibonacci comienza con 0 y 1, y cada término subsiguiente es la suma de los dos anteriores (0, 1, 1, 2, 3, 5, 8, 13, 21, ...).

Estos ejercicios implican un poco más de lógica y son ideales para practicar conceptos más avanzados. ¡Espero que disfrutes resolviéndolos!*/

console.log("Secuencia de Fibonacci");


// Función para generar los primeros n términos de la secuencia de Fibonacci
function fibonacci(n) {
    const resultado = [0, 1]; // Inicializamos con los dos primeros términos
  
    for (let i = 2; i < n; i++) {
      const nuevoTermino = resultado[i - 1] + resultado[i - 2];
      resultado.push(nuevoTermino);
    }
    return resultado;
  }
  
  // Generar los primeros 10 términos de la secuencia de Fibonacci
  const primerosDiezTerminos = fibonacci(10);
  
  // Mostrar los resultados en la consola
  console.log("Primeros 10 términos de la secuencia de Fibonacci:", primerosDiezTerminos);
  