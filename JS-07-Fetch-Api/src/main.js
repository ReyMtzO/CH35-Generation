// Programación sincrónica
function two () {
    console.log("dos");
}

function one () {
    console.log("uno");
    two();
    console.log("tres");
}

one();

console.log("*************");

/**  Programación asíncrona.
 * setTimeout que recibe una función anónima y establece un tiempo (en milisegundos 1000ms = 1s) de ejecución para cumplir con la condición de asincronismo
 * */

const twoAsync = () => {
    setTimeout( () => {
        console.log("dos Async");
    }, 5000);
}

const oneAsync = () => {
    setTimeout(function() {
        console.log("uno Async");
    }, 2000);
    twoAsync();
    console.log("tres Async");
}

oneAsync();

/**
 * Trabajando con promesas mediante Fetch API
 */
const url = "https://jsonplaceholder.typicode.com/users";

// Si se cumple la promesa, vamos a traer los datos de la API y se convertirá en tipo json para poder mostrarlos en consola
fetch(url)
    .then(data => data.json())
    .then(data => {
        console.log(data); // Mostrando en consola todos los usuarios de la API
        console.log(data[0].name); // Mostrando en consola el usuario con el índice 0 y trayendo solamente su nombre
    })
    .catch(error => console.error("¡Ups!, algo salió mal", error)); // Mensaje de error