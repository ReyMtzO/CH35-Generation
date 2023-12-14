/**
 * == Arrays ==
 * Es una colección o agrupación de elementos en una misma variable, cada uno de ellos ubicado por la posición que ocupa el array.
 * Los arrays se utilizan para almacenar y organizar datos de manera más eficiente.
 */

// Crear un Array
const numeros = [1,2,3,4,5];

// Crear un Array de cadena de texto
const comida = ["Tacos", "Sopa", "Pan", "Jugo"];
console.log(comida);

// Crear un Array mixto
const mixto = [
    "pluma",
    8,
    true,
    {nombre: "Mar"}
];
console.log(mixto);

// Crear un Array vacío
const lista = [];
console.log(lista);

// Agregar elementos a mi array vacío
lista[0] = "Leche";
lista[1] = "Carne de pollo";
lista[2] = "Espinaca";
lista[3] = "Huevos";
console.log(lista);

// Otra manera de crear Arrays
const frutas = new Array("Manzanas", "Naranjas", "Peras", "Sandía", "Uvas");
console.log(frutas);

/**
 Esta sintaxis se puede emplear en Arrays porque son Objects, es una manera de mandar a llamar un nuevo Objeto de tipo Array
 */

// Longitud de un Array
console.log(frutas.length);

// Acceder a los elementos del Array, acorde a su índice
console.log(frutas[3]); // Sandía
console.log(frutas[6]); // undefined

// Modificar un elemento del Array por el índice
const cremeria = ["Jamón", "Salchicha", "Quesillo", "Queso fresco", "Yogurt", "Crema ácida"];
console.log(cremeria);
// Cambiamos un elemento de "Quesillo" a "Queso de hebra"
cremeria[2] = "Queso de hebra";
cremeria[4] = "Danonino"
console.log(cremeria);

// Arreglo de arreglos o multidimencional
console.log("Arreglo de arreglos");

// Estados : Estado de México, Jalisco, Yucatán, Sonora, Oaxaca, CDMX.

// Platillos : Guajolocombo, Torta ahogada, Panuchos, Dogos, Tlayudas, Tacos.

const estados = ["Estado de México", "Jalisco", "Yucatán", "Sonora", "Oaxaca", "CDMX"];

const platillos = ["Guajolocombo", "Torta ahogada", "Panuchos", "Dogos", "Tlayudas", "Tacos"];

const menu = [estados, platillos];

console.log(menu[0][2]);
/**
 * En el primer corchete se establece el índice del array y en el segundo corchete se establece el índice del elemento de dicho array.
 */

console.log(`El ${menu [1][0]} se come en ${menu [0][0]}`);

/**
 * == Métodos de Arreglos ==
 * Método de cola (queue). Los métodos de cola implican agregar elementos al final del array y eliminar elementos al inicio del array. Sigue el principio de FIFO (First-in-first-out), lo que significa que el primer elemento añadido es el primer elemento eliminado.
 * - push
 * - shift
 * - unshift
 * 
 * Método de pila (stack). Implica agregar elementos al final de array y eliminar elementos del final del array. Sigue el principio LIFO (Last-in-first-out), lo que significa el último elemento añadido es el primero en ser eliminado.
 * - push
 * - pop
 */

console.log("Métodos de Arrays");
const ch35 = ["Dani", "Fer", "Maara", "Gaby", "Mar", "Paola", "Enrique"];
console.log(ch35);

// pop() Eliminar el último elemento del array
let popch35 = ch35.pop();
console.log(popch35); // devuelve el dato eliminado
console.log(ch35); // elimina el dato de la lista

// push() Agregar al final del array
let pushch35 = ch35.push("Mony");
console.log(ch35);

// shift() Quitar primer elemento del array
let shiftch35 = ch35.shift();
console.log(ch35);

// unshift() Agregar elemento en el primer elemento del array
let unshiftch35 = ch35.unshift("Dani");
console.log(ch35);

// reverse() Cambia el sentido del ordenamiento del array
let reversech35 = ch35.reverse();
console.log(ch35);

/**
 * Investigar:
 * - sort
 * - forEach
 * - slice
 * - splice
 * - indexOf
 */

