console.log("Hola, operadores!");

/**
 * === Operadores ===
 * Son un signo que especifica qué debería efectuar una determinada operación
 */

// Operadores aritméticos (+,-,*,/,%,++,--)
// Operadores de asignación (=)
// Operadores lógicos (&&, ||, !)
// Operadores de comparación (==, ===, >, <, >=, <=, !=, !==)
// Operadores de cadena (toLowerCase, toUpperCase)


/**
 * === Operadores aritméticos ===
 * (+) : suma, se utiliza para sumar dos números
 * (-) : resta, se utiliza para restar un número de otro
 * (*) : multiplicación, se utiliza para mutiplicar dos números
 * (/) : división, se utiliza para dividir un número entre otro
 * (%) : residuo, se utiliza para obtener el resto de una división
 * (++) : incremento, aumenta de uno en uno la cantidad o el número
 * (--) : decremento, disminuye de uno en uno la cantidad o el número
 */

let numero1 = 10;
let numero2 = 8;

suma = numero1 + numero2;
resta = numero1 - numero2;
multi = numero1 * numero2;
divi = numero1 / numero2;
residuo = numero1 % numero2;
incremento = numero1;
incremento ++;
decremento = numero2;
decremento --;

console.log(suma);
console.log(resta);
console.log(multi);
console.log(divi);
console.log(residuo);
console.log(incremento);
console.log(decremento);


// Ejemplo de cómo aplicar un descuento
let precioReal = 1000;
let porcentajeDescuento = 20;

let montoDescuento = (precioReal * porcentajeDescuento) / 100;
let precioConDescuento = precioReal - montoDescuento;

console.log("Precio Real del producto: $" + precioReal);
console.log("Porcentaje de descuento: " + porcentajeDescuento + "%");
console.log("Cantidad de descuento: $" + montoDescuento);
console.log("Precio con descuento: $" + precioConDescuento);


/**
 * === Operadores de asignación ===
 * (=) : Este operador no compara, lo que hace es asignar
 */

let fruta = "manzana";
console.log(fruta);

/**
 * === Operadores de comparación ===
 * (==): igualdad, compara si nuestros valores son iguales
 */

let num3 = 10;
let text = "10";

console.log(num3 == text);

// (===) : Igualdad estricta, compara si los valores son iguales y el tipo de dato

let num4 = 10;
let text1 = "10";

console.log(num4 === text1);

// (!=) : desigualdad, verifica si dos valores no son iguales y de ser necesario realiza la conversión

let precioCaja = 1499;
let precioMaximo = 1500;

if(precioCaja != precioMaximo) {
    console.log("El precio del producto no es igual al precio máximo");
} else {
    console.log("El precio del producto es igual al precio máximo permitido");
}

// (!==) : desigualdad estricta, este operador verifica si dos valores no son iguales, pero a diferencia de (!=) en este caso ambos valores deben tener el mismo tipo y valor

let num5 = 10;
let num6 = "15";

if(num5 !== num6) {
    console.log("Son diferentes");
} else {
    console.log("Los valores son iguales");
}

// (>) : mayor que, nos indica si un valor es mayor que otro

let years = 20;
let limitAge = 30;

console.log(years > limitAge);


// (>) : menor que, nos indica si un valor es menor que otro
let anios = 20;
let edadLimit = 30;

console.log(anios < edadLimit);

// (>=) mayor o igual que, nos indica si un valor es mayor o igual a otro
let edad = 40;
let edadNecesaria = 18;

console.log(edad >= edadNecesaria);

// (<=) menor o igual que, nos indica si un valor es menor o igual a otro




/*Ejercicio 1. Crea un programa que solicite al usuario dos números y en consola nos va a decir si esos números son iguales o hay alguno que sea mayor que otro*/

let num1 = parseInt(prompt("Ingrese un número"));
let num2 = parseInt(prompt("Ingrese un segundo número"));

if(num1 === num2) {
    console.log("Los valores son iguales");
} else if (num1 > num2) {
    console.log("El primer número ingresado es mayor que el segundo");
} else {
    console.log("El segundo número ingresado es mayor que el primero");
}

/*Ejercicio 2. Crea un programa que pida al usuario dos palabras y determine si son iguales o no*/

let word1 = prompt("Ingrese una palabra");
let word2 = prompt("Ingrese una palabra");

if(word1 === word2) {
    console.log("Las palabras ingresadas son las mismas");
} else {
    console.log("Las palabras ingresadas son distintas");
}


/**
 *  === Operadores lógicos ===
 * (&&) AND, se utiliza cuando las dos condiciones deben cumplirse
 */

let mayorEdad = 18;
let tieneIdentific = true;

if (mayorEdad >= 18 && tieneIdentific) {
    console.log("Puedes rentar el salón");
} else {
    console.log("No lo puedes rentar");
}


// (||) OR, se utiliza cuando se debe cumplir una condición u otra

let esUsuario = false;
let descuento = true;

if (esUsuario || descuento) {
    console.log("Califica para descuento");
} else {
    console.log("No califica para descuento");
}


// (!) NOT, se utiliza para negar el valor de una condición

let esDiaLibre = false;

if (!esDiaLibre) {
    console.log("Se trabaja");
} else {
    console.log("Descansito");
}


/**
 * === Operadores de cadena ===
 */

// toLowerCase, hace el cambio de nuestro string a minúsculas

let mensajeUsuario = "BIENVENIDO A LA TIERRA";
let cambioMinus = mensajeUsuario.toLowerCase();

console.log(cambioMinus);


// toUpperCase, hace el cambio de nuestro string a mayúsculas

let saludo = "Casi viernes, casi navidad";
let cambioMayus = saludo.toUpperCase();

console.log(cambioMayus);


// trim, quita los espacios

let aviso = "     CH35 RIFAAAA      ";
let sinEspacios = aviso.trim();

console.log(sinEspacios);


// toString, convierte un tipo de dato "number" en "string"

let num10 = 31;
let cadena = num10.toString();

console.log(cadena);

// concat, une o concatena strings

let name2 = "Rey David";
let apellido = "Martínez"
let completeName = name2.concat(" ", apellido);

console.log(completeName);


/* === Expresiones === */

// Expresión aritmética

// let operation = 14 + 25 * 12;  combina la suma con la multiplicación

// let notification = "Casi, " + "Año nuevo";  expresión concatenando

// Expresión lógica

// let esMayorDeEdad = (23 > 18) && (23 < 65);  tiene operadores lógicos y de comparación

// Expresión de asignación

// let frasco = chocolates;  asigna el valor a la variable

