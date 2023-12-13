/*1. Convert Minutes into Seconds.*/

let minutes = prompt("Ingresa los minutos que deseas convertir a segundos");

function toSeconds() {
    return minutes*60;
}
let resultado = toSeconds(minutes);
alert(`${minutes} equivale a ${resultado} segundos`);



/*2. Return the Next Number from the Integer Passed.*/

let valor = prompt("Ingresa un número entero");
let numero = parseInt(valor);

function nextNumber(numero) {
    return (numero + 1);
}
let resultadoNextNumber = nextNumber(numero);
alert(resultadoNextNumber);