console.log("Hola CH35");
/*
Control de flujo y estructuras de contro

Las estructuras de control son un componente fundamental dentro de la programación, entre algunas de las facilidades y ventajas que nos proporcionan para escribir y depurar código, podemos mencionar las siguientes:

- Tomar decisiones basadas en condiciones especificas, esto produce un codigo
 * tanto dinamico como adaptable
 * 
 * - Repetir acciones (estructuras de bucle) para iterar operaciones o procesar datos
 * de una forma eficiente sin caer en la redaccion de codigo innecesario y repetitivo
 * 
 * - Facilitar el control de flujo de una operacion, brindandonos la oportunidad de ser
 * especificos en indicar qe instrucciones ejecutar y en que orden
 * 
 * - Optimizan el rendimiento de nuestro codigo, ya que evita oportunamente ejecutar instrucciones
 * en caso de que no se necesite
 * 
 * - Facilitar tanto la escritura de codigo como la claridad de este
 * 
 * Las estructuras de control que vamos a ver durante las sesiones de JS son las siguientes
 * 
 *      - Estructura if-else
 *      - Estructura switch
 *      - Estructuras de bucles (for, do, do while)
 * 
 * Para esta sesion, nos centraremos solo en las primeras 2 señaladas en la lista
*/

/*
Declaración de sentencia if-else
Palabra reservada "if" para comenzar la declaración, se coloca un paréntesis () donde se debe colocar una expresión lógica (true/false), se abre y cierran llaves {} para indicar qué sentencia va a ejecutar si la condición se cumple (true),
después de la llave {} declarada para el bloque de ejecución if, colocamos la palabra reservada "else". Para este ejemplo no es necesario colocar más expresiones dentro de un (), simplemente colocamos otras llaves {} para indicar el bloque de código que tiene que ser ejecutado en caso de que la condición no se cumpla (false).
*/

// let n = 15;

// if (n > 10) {
//     console.log(true);
// } else {
//     console.log(false);
// }

/*
 * if-else-if
 * 
 * Se trata de la misma sentencia if-else declarada anteriormente
 * Lo que vamos a hacer diferente es, en este caso, anidar varias veces
 * esta misma sentencia, lo que nos permitira tomar decisiones
 * mas complejas
 * 
 * Usaremos la contatenación.
 * Concatenar es una elegante palabra de la programación que significa: "unir". Para unir cadenas en JavaScript el símbolo de más (+), el mismo operador que usamos para sumar números, pero en este contexto hace algo diferente.
 * 
 * Hay que tener cuidado y no realizar demasiadas anidaciones, ya que va a resultar
 * en codigo poco legible y confuso
 */

// if anidados
// let edad = 25;

// if(edad < 18) {
//     console.log("Eres menor de edad, retírate");
// } else if(edad >= 18 && edad < 65) {
//     console.log("Eres un adulto jóven");
// } else {
//     console.log("Eres un adulto mayor");
// }

/**
 * Sentencia switch
 * La sentencia switch es otro tipo de estructura de control de flujo, que, nuevamente se encuentra en diversos lenguajes de programación.
 * Es bastante parecida a la sentencia del if-else, pero diferente en cuanto a comportamiento, ya que se basa en una bifurcación (partición de caminos), sino que se secciona en múltiples casos (case) que, dependiendo de la expresión que cumpla con un caso específico, será la secuencia que se va a ejecutar, dentro de la declaración.
 * 
 * Declaración:
 * Se empieza por colocar la palabra reservada switch, seguido de esto, colocamos paréntesis () donde se debe colocar el valor que va a indicar qué sentencia/caso va a ejecutar.
 * Falta indicar el bloque de código que se limita a esta sentencia, como lo hacíamos en la sentencia if o con las funciones.
 * Dentro de este bloque de código, falta colocar los casos para cada valor que se desee, estableccer según sea el valor indicado dentro de nuestro paréntesis ().
 * Cada uno de estos casos se separa de la siguiente manera:
 * case valor : instrucción a ejecutar si el valor empata con este caso.
 * Después, para indicar que la ejecución de las sentencias debe cortarse cuando se cumpla, se coloca la instrucción "break".
 * Cuando terminemso de establecer los casos que necesitemos declarar, dentro de nuestra sentencia, debemos colocar un valor por defecto, "default".
 * Esta última sentencia nos permite establecer un valor por defecto, si es que este valor colocado no empata con ningún otro dentro de la sentencia o en ninguno de los casos.
 * default : mensaje no disponible.
 */

// let dia = "miércoles";
// switch(dia) {
//     case "lunes" :
//         console.log("Odio los lunes");
//         break;
//     case "martes" : 
//     console.log("Ni te cases ni te embarques");
//         break;
//     case "miércoles" :
//     console.log("Toca presentar proyecto integrador");
//         break;
//     case "jueves" :
//     console.log("Juevebes, casi viernes");
//         break;
//     case "viernes" :
//     console.log("Viernes de disfraces");
//         break;
//     case "sábado" :
//     console.log("Sabadrink y taquitos");
//         break;
//     case "domingo" :
//     console.log("Domingo de misa de 6 am");
//         break;
//         default :
//         console.log("Día desconocido"); 
//         break;                         
// }

/**
 * Operador ternario
 * Expresión condicional if-else más simple y legible.
 * Principalmente se usa para simplificar condiciones de una sola expresión.
 * También puede anidar sentencias if-else-if, sin embargo, no es recomendado porque el código se puede volver confuso y poco legible.
 * Su declaración es la siguiente:
 * Palabra reservada var, let, o const:
 * Se le asigna un nombre como si se trarara de una variable, más un operador de asignación "=", seguido de este operador hay que colocar una expresión lógica. Esto va dentro de un paréntesis (), después hay que colocar un caracter "?" que idica el camino a seguir, dependiendo de si se cumple o no la expresión.
 * Para separar el resultado "true" de "false" debemos agregar un caracter de :, de lado izquierdo se coloca la sentencia a ejecutar.
 * Si se cumple la condición, del lado derecho se coloca la sentencia a ejecutar
 */

// // Ejemplo de operador ternario
// let verificacion = n > 20 ? "Si es mayor" : "No es mayor";
// console.log(verificacion);


/**
 * Cuándo usar if-else y cuándo usar switch?
 * if-else : cuando necesitemos tomar decisiones bajo condiciones más flexibles.
 * switch : cuando tengamos un conjunto fijo de valores para comparar una expresión.
 */



// Ejercicios para esta sesion

/** Ejercicio 1
 * 
 * Elabora un programa que determine si una persona tiene edad
 * suficiente para votar
 * 
 * Debe recibir como parámetro la edad
 * 
 * Consideraciones: utilizar la estructura if-else
 */

let edadPersona = prompt ("Ingresa tu edad");

if (edadPersona < 18) {
    alert("Bebecito, No puedes votar.");
}
else if (edadPersona >= 18 && edadPersona <= 120) {
    alert("Eres mayor de 18 años y traes tu INE. Puedes pasar a la casilla para votar.");
}else{
    alert("Increíble!! puedes votar, pero camina con cuidado hacia la casilla.");
}

/** Ejercicio 2
 * 
 * Desarrolla un programa que evalue si un número es divisible
 * entre 7 y 8
 * 
 * Debe recibir como parámetro un número, cual sea
 * 
 * Si se cumple, imprimir verdadero
 * Si no, imprimir falso
 * 
 * 
 * Consideración - Utilizar la estructura if-else
 * Casos de prueba: 56, 7, 8, 0, 224, 73
 */

let numeroDivisible = prompt("Ingresa un número de los siguientes: 56, 7, 8, 0, 224, 73");

function esDivisiblePor7y8(numeroDivisible) {
    if (numeroDivisible % 7 == 0 && numeroDivisible % 8 == 0) {
        alert("El número ingresado es divisible por 7 y 8: true");
    } else {
        alert("El número ingresado NO es divisible por 7 y 8: false");
    }
}

// Llamamos a la función con el número ingresado por el usuario
esDivisiblePor7y8(numeroDivisible);


/** Ejercicio 3
 * 
 * Desarrolla un programa que evalue si un número es divisible
 * entre 4 o 9
 * 
 * Debe recibir como parámetro un número aleatorio
 * 
 * Si se cumple, imprimir verdadero
 * Si no, imprimir falso
 * 
 * Consideración - Utilizar la estructura if-else
 */

let numeroDivisible2 = prompt("Ingresa un número aleatorio");

function esDivisiblePor4o9(numeroDivisible2) {
    if (numeroDivisible2 % 7 == 0 || numeroDivisible2 % 8 == 0) {
        alert("El número ingresado es divisible por 4 o por 9: true");
    } else {
        alert("El número ingresado NO es divisible por 4 o por 9: false");
    }
}

// Llamamos a la función con el número ingresado por el usuario
esDivisiblePor4o9(numeroDivisible2);



/** Ejercicio 4
 * 
 * Realizar un programa que reciba como parámetro una categoría de películas
 * 
 * -acción
 * -drama
 * -comedia
 * -romance
 * -suspenso
 * -terror
 * 
 * Segun sea la categoria que se reciba, imprimir una recomendación de película
 * de acuerdo al parámetro recibido
 * 
 * Consideraciones: utilizar la estructura switch
 */

let peliCatego = "suspenso";
switch(peliCatego) {
    case "action" :
        console.log("Duro de matar");
        break;
    case "drama" : 
    console.log("La milla verde");
        break;
    case "comedia" :
    console.log("Scary Movie");
        break;
    case "romance" :
    console.log("Titanic");
        break;
    case "suspenso" :
    console.log("La isla siniestra");
        break;
    case "terror" :
    console.log("Rec");
        break;
        default :
        console.log("Categoría desconocida"); 
        break;                         
}


/** Ejercicio 5
 * 
 * Crear una interfaz de un cajero ATM
 * 
 * Debe recibirse como parámetro alguna de las siguientes opciones
 * 
 * 1. Retirar dinero
 * 2. Transferencia
 * 3. Depósito
 * 4. Pago de servicios
 * 
 * Segun sea la opcion indicada, imprimir en pantalla la acción a realizar
 * Utilizar if/else
 */

 let accionCajero = prompt ("Ingrese el número del trámite que desea a realizar (1, 2, 3, 4)");

 if (accionCajero == 1) {
     alert("Retirar dinero");
} else if (accionCajero == 2) {
     alert("Transferencia");
} else if(accionCajero == 3) {
    alert("Depósito");
} else if(accionCajero == 4) {
    alert("Pago de servicios");
} else {
    alert("Acción inválida");
} 


/** Ejercicio 6
 * 
 * Escribir en código un programa conversor de divisas
 * 
 * Debe recibir como parámetro una cantidad en pesos mexicanos y
 * Según sea la opción que se indique, realizar la conversión correspondiente
 * 
 * 1. A dolares estadounidenses
 * 2. A euros 
 * 3. A yenes japoneses
 * 4. A libra esterlina
 * 5. A franco suizo
 * 
 * Consideración: estructura switch
 * 
 */

let moneda = prompt("Ingrese la cantidad en pesos mexicanos");
moneda = parseInt(moneda);
let cambio = prompt(`Elige el tipo de cambio indicando el número:
1. A dolares estadounidenses
2. A euros 
3. A yenes japoneses
4. A libra esterlina
5. A franco suizo`);
cambio = parseInt(cambio);
let conversion;

switch(cambio) {
    case 1 : 
    conversion = moneda*0.058;
    alert(`${moneda} pesos mexicanos equivalen a ${conversion} dólares estadounidenses`);
        break;
    case 2 : 
    conversion = moneda*0.054;
    alert(`${moneda} pesos mexicanos equivalen a ${conversion} euros`);
        break;
    case 3 : 
    conversion = moneda*8.41;
    alert(`${moneda} pesos mexicanos equivalen a ${conversion} yenes japoneses`);
        break;
    case 4 : 
    conversion = moneda*0.046;
    alert(`${moneda} pesos mexicanos equivalen a ${conversion} libras esterlinas`);
        break;
    case 5 : 
    conversion = moneda*0.051;
    alert(`${moneda} pesos mexicanos equivalen a ${conversion} francos suizos`);
        break;
        default :
        alert("Ingrese un número válido");
        break;              
}