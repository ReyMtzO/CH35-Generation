/*
Tipos de datos:
-> String (cadenas de texto) 
-> Number (numéricos) 
-> Booleans (true or false) 
-> Null (nulos) 
-> Undefined (indefinidos) 
-> Objects (Objetos) 
-> Arrays (Objetos) 
*/

/* 
- console.log(); Nos permite visualizar en consola del navegador el código de JS.
- console.warn(); Muestra un mensaje de advertencia.
- console.error(); Muestra mensaje de error.
- console.table();
*/

/*ECMAScript 6 (ES6). Interpolación de cadenas
-> backticks `` (ALt + }) 
-> Para variables las invocamos ${variable}
-> Texto para string.
*/

/* 
- Array. Se traduce como matriz o arreglo. Es un tipo de dato que pertenece a JS, en el cual se almacena una colección de elementos de manera ordenada.
- Los arrays se pueden manipular mediante métodos específicos.
- Los elementos de una array se contabilizan como índices empezando por índice 0, por lo cual, el primer elemento del array posee el índice 0.
- Un array posee n cantidad de elementos.
- Se declaran como variables, seguido del signo igual y corchetes. Dentro de cada elemento vive un elemento con un tipo de dato.*/

let arreglo1 = []; // Array vacío
console.log(`Array vacío ${arreglo1}`);
let cars = ["Volkswagen", "BMW", "Mazda", "Kia"];  // Array de String
console.log(cars); 
// Longitud e índice son diferentes. La longitud (length) es el número de elementos y el índice corresponde a cada elemento a partir del 0

console.log(typeof(cars)); //Output: object

let salariesMxn = [15000, 12000, 18000, 25000, 28000, 10000, 18500, 10200, 20500, 15300, 17000, 17200];
console.log(salariesMxn.length); //Output: 12
console.log(salariesMxn);

/*
Objetos. 
- Los objetos son tipos de datos en JS, con una estructura definida que nos permite almacenar información mediante llaves (claves) y valores.
- Su sintaxis es la siguiente:
const object {
    clave1: valor1 (dato1),
    clave2: valor2 (dato2)
}

- Los objetos pueden almacenar diferentes tipos de valores.
*/

const  employe = {
    firstName: "Rey David",
    lastName: "Martínez",
    age: 29,
    country: "México"
}


console.log(employe);

// Mostrando mi "array" como tabla
console.log(cars);

// Mostrando mi "objeto" como tabla
console.table(employe);