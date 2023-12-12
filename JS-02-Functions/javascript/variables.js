//TIPOS DE DATOS Y VARIABLES

//scope es el alcance de nuestras variables

/* var, let, const. La diferencia es el alcance 
var - tiene un alcance global
let - tiene un alcnace local
const - se mantiene sin ningun cambio */

/* string:cadena de texto (lleva comillas)
number: numero
boolena: true/false
null: nulo
undefinied:no esta asigando o definido */

/*let nombre = "Daniel";
let invitadosExtra = 2;
let esMayorEdad = true;
let edad = 24;
let invitadoEspecial = null;
let horaDeSalida = undefined;

console.log(nombre);
//document.write(nombre);
*/

/* "Encasillamiento" o "tipado" 
- Nos es útil para el mantenimiento del código, ya que lo hace más legible y fácil de entender.
- Nos ayuda a la prevención de errores para reducir la probabilidad de los mismos
- Mejora el rendimiento de nuestro programa */

/*
let number = 15;
let texto = "Quince"
*/

// Con encasillamiento:
/*
let numeroEncasillado = number = 15;
let textoEncasillado = string = "Quince"
*/

// "typeof" palabra reservada para saber qué tipo de dato tenemos

/*
console.log(typeof(nombre));

let functionNumber = console.log(typeof Number (nombre));

metodoParseInt = console.log(typeof parseInt(nombre));

metodoParseFloat = console.log(typeof parseFloat(nombre));

 parseInt y parseFloat son funciones que se utilizan para convertir cadenas de texto en números, ambas nos ayudan en este cambio */

/*
var numero1 = "4";
var numero2 = "5";

console.log("Tipo de variable numero1: "+typeof(numero1));
/*
typeof solo devuelve el tipo de variable que estas utilizando

console.log("Tipo de variable luego de aplicar un Number: "+typeof(Number(numero1)));
console.log("Tipo de variable luego de aplicar un parseInt: "+typeof(parseInt(numero1)));

Number: transforma tu variable a una variable numerica
parseInt: tranforma tu variable a un tipo de variable entera
en el ejmplo lo utilizamod para sumas dos variables tipo string

console.log(numero1+numero2);
console.log(parseInt(numero1)+parseInt(numero2));
console.log(Number(numero1)+Number(numero2));
*/

/* Conversión de number a string */

console.log(typeof String(edad));
console.log(typeof edad.toString());

/* Conversión de boolean a number */
let numero = Number(esMayorEdad);
console.log(typeof(numero));

/* Conversión de boolean a string */
let texto = String(esMayorEdad);
console.log(typeof(texto));
console.log(typeof esMayorEdad.toString());

let negative = !esMayorEdad;
console.log(negative);

// Concatenar es unir strings

let saludo = "Hola humanx ,";
let frase = " el futuro es hoy";

texto = saludo + frase;
document.write(texto);
