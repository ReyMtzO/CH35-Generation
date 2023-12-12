// Comentario de una sola línea.

/* Comentario 
multilínea */

//alert("Hola mundo!");

//console.log("Hola, nene. Este es un mensaje desde VSCode");

/*var nombre = prompt("Ingresa tu nombre");
alert("Hola " + nombre + ", Bienvenido a CH35!");*/

/*var number1 = parseInt (prompt("Ingresa el primer número: "));
var number2 = parseInt (prompt("Ingresa el segundo número: "));

console.log("La suma de ambos números es: " + (number1 + number2));
console.log("La resta de ambos números es: " + (number1 - number2));
console.log("La multiplicación de ambos números es: " + (number1 * number2));
console.log("La división de ambos números es: " + (number1 / number2)); */


/* Ejercicio en clase con condicionales (ejemplo de restricciones para entrada a un bar)*/
var edad = prompt ("Bienvenido al bar. Ingresa tu edad");

if (edad < 18) {
    alert("Bebecito, No puedes pasar");
}
else if (edad >= 18 && edad <= 65) {
    alert("Eres mayor de 18 años y lo suficientemente cool para pasar, Adelante");
}else{
    alert("Demasiado viejo hermano, No puedes pasar");
}