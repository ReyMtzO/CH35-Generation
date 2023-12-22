/**
 * Paradigmas de programación
 * 
 * - Programación imperativa: Se basa en instrucciones detalladas ejecutando un flujo o una secuencia determinada
 * 
 * - Programación basada en eventos: Se basa en la gestión y respuesta de eventos
 * 
 * - Programación declarativa: Explica lo que queremos obtener
 * 
 * - Programación orientada a objetos: Toma cierta información o estructura del mundo real (objetos) para poder explicar ciertas cosas, como sus características (propiedades o atributos) y sus comportamientos o acciones (métodos).
 */

// Clases: Plantillas para crear objetos. Nos ayudan a definir un tipo de objeto y crear instancias de este tipo de objeto.
// Instanciar: MaPerializar

class Persona {
    nombre = "";
    apellido = "";
    edad = 0;
    email = "";
    telefono = "";

    /** Objetos 
     * El constructor es una función especial, cuya finalidad es la de construir o instanciar objetos.
     * 
     * - Para inicializar un objeto es necesario definir un constructor que tomará los atributos.
     * - Clases == molde
     * - Objeto == gomita
     * - Constuctor == cheff
     * - Atributos == ingredientes
     * - Métodos == comportamientos
    */

    constructor (nombre, apellido, edad, email, telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
    } 

comer () {
    console.log("Bon apetit");
} // Método comer

bailar () {
    console.log("Dale hasta el suelo");
} // Método bailar

mostrarInfo(){
    console.log(`Nombre: ${this.nombre}`);
    console.log(`Apellido: ${this.apellido}`);
    console.log(`Edad: ${this.edad}`);
    console.log(`Email: ${this.email}`);
    console.log(`Teléfono: ${this.telefono}`);

 }

leer () {
console.log("Leyendo un libro");
 }
}

// Declaramos variables para instanciar nuestros objetos
let usuario1 = new Persona("Fernanda", "Ramos", 31, "fer@gmail.com", "5543789923");
let usuario2 = new Persona("Carlos", "Dominguez", 33, "car@gmail.com", "5548907898");
let usuario3 = new Persona("Roberto", "Gomez", 50, "robe@gmail.com", "5544635354");
let usuario4 = new Persona("Juan", "Martinez", 28, "juan@gmail.com", "5548362543");
let usuario5 = new Persona("Lucero", "Duarte", 34, "luz@gmail.com", "5545298745");


console.log(usuario1); // Imprime objeto completo
console.log(usuario4.email); // Imprime un atributo en específico
console.log(usuario1.email, usuario2.email, usuario3.email, usuario4.email, usuario5.email);

usuario4.comer(); // Invocando el método
usuario1.leer();
usuario1.mostrarInfo();
console.log(usuario5.apellido, usuario3.telefono);


/** >>>>>>>>>>>>>>>> Los 4 pilares de la POO <<<<<<<<<<<<<<<<<< */

/**
 * - Herencia
 * - Polimorfismo
 * - Encapsulamiento
 * - Abstracción
 */


/* ==== Herencia ==== 
nos permite heredar a clases inferiores para poder optimizar el programa */

class Arrerndador extends Persona {
    
    capacidad = 0;
    costo = "";
    nombreLugar = "";


    constructor(nombre, apellido, edad, email, telefono, capacidad, costo, nombreLugar) {
        super(nombre, apellido, edad, email, telefono);
        this.capacidad = capacidad;
        this.costo = costo;
        this.nombreLugar = nombreLugar
    }


    mostrarInfo() {
        console.log("Capacidad", this.capacidad);
        console.log("Costo", this.costo);
        console.log("Nombre del lugar", this.nombreLugar);
    }
}

let arrerndador1 = new Arrerndador("Rocio", "Hernandez", 29, "rocio@gmail.com", 5538295342, 100, 50000, "Salón G");

console.log(arrerndador1);

arrerndador1.mostrarInfo();



/*
class Animal {
    sonido() {
      console.log('Hace un sonido genérico');
    }
  }
  
  class Perro extends Animal {
    sonido() {
      console.log('Guau guau');
    }
  }
  
  class Gato extends Animal {
    sonido() {
      console.log('Miau');
    }
  }
  
  const perro = new Perro();
  const gato = new Gato();
  
  perro.sonido();  
  gato.sonido();
  */


/* ==== Polimorfismo ====
Proviene de Poli = muchas, morfismo = formas. Se utiliza para crear métodos con el mismo nombre pero con diferente comportamiento. */

class Producto {

    marca = "";
    precio = 0;

    constructor(marca, precio) {
        this.marca = marca;
        this.precio = precio;
    }

    mostrarDescripcion() {
        console.log("Marca ");
        console.log("Precio");
    }
}

let producto1 = new Producto("cerave", 85);

/** ==== Encapsulamiento ==== 
 * Nos permite ocultar la implementación de un objeto y solo mostrar los datos necesarios
*/

class Usuario {
    #password;
    
    constructor(userName, email, password) {
        this.userName = userName;
        this.email = email;
        this.#password = password;
    }

    verificarPassword(password) {
        return this.#password === password;
    }
}

/** ==== Abstracción ==== 
 * No es nada más que traer objetos del mundo real y poder aplicarlos a la programación mediante clases, métodos, cosntructores y objetos
*/

/**
 * Los objetos de tipo Json son un formato de intercambio de datos ligero, accesible, estructurado, manipulable (DOM) y que nos brindan una mejor comunicación entre el cliente y el servidor. Esto gracias a que son más flexibles y generalmente se ejecutan con fetch
 */

let objetoJson = {
    "nombre": "Juanin",
    "apellido": "Juan Harry",
    "edad": 31,
    "email": "juanin@gnail.com",
    "telefono": "5574980693",

}


console.log(objetoJson);

let objetoLiteral = {
    nombre: "Juanin",
    apellido: "Juan Harry",
    edad: 31,
    email: "juanin@gnail.com",
    telefono: "5574980693",

}


console.log(objetoLiteral);


// >>>>>>>>>>>>>>> Principios solid <<<<<<<<<<<<<<<<<<<

/* 1. Principio de responsabilidad única (single Responsability Principle) 
- Una clase debe tener asignada una tarea o responsabilidad específica y esta no debería cambiar

2. Principio abierto/cerrado (open/closed principle OCP)
- Una clase puede estar abierta a extensiones y agregar nuevas funcionalidades, pero sin generar cambios en la misma

3. Principio de sustitución de Liskov (Liskov Sustitution Principle LSP)
- Una clase hijo puede sustituir objetos de una clase padre

4. Principio de segregación de interfaces (Interface Segregation Principle ISP)
- Delimitar los métodos que necesito y dejar fuera los innecesarios

5. Principio de inversión de dependencias (Dpendency Inversion Principle DIP)
- 
*/



/**
 * Programa que conste de una clase llamada Alumno, que tenga como atributos: nombre y calificación. Definir los métodos para inicializar sus atributos (constructor), imprimirlos y mostrar un mensaje con el resultado de si la calificación es aprobatoria o no.
 * 
 * 
 * Atributos:
 * - nombre
 * - calificacion
 * 
 * Metodos 
 * - imprimirCalificacion
 * - evaluacion
 * 
 * - la calificacion aprobatoria es de 6
 * - if para evaluar la calificacion
 */


class Alumno { // Definición de la clase Alumno
    nombre = ""; // Atributo para almacenar el nombre del alumno
    calificacion = 0; // Atributo para almacenar la calificación del alumno

    constructor(nombre, calificacion) { // Constructor de la clase, inicializa el objeto Alumno con nombre y calificación
        this.nombre = nombre; // Asigna el nombre proporcionado al atributo nombre
        this.calificacion = calificacion; // Asigna la calificación proporcionada al atributo calificacion
    }

    imprimirCalificacion() { // Método para imprimir la calificación del alumno
        console.log(`${this.nombre} tiene una calificación de ${this.calificacion}`);
    }

    evaluacion() { // Método para evaluar si el alumno aprobó o no
        if (this.calificacion >= 6) { // Condición: Si la calificación es mayor o igual a 6
            console.log(`${this.nombre} ha aprobado.`);
        } else {
            console.log(`${this.nombre} no ha aprobado.`);
        }
    }
}

// Crear instancias (objetos) de la clase Alumno
const alumno1 = new Alumno("Ximena", 5); // Instanciar un objeto con nombre "Ximena" y calificación 5
const alumno2 = new Alumno("Diego", 10); // Instanciar un objeto con nombre "Diego" y calificación 10

// Utilizar los métodos de la clase Alumno para imprimir la calificación y la evaluación de cada alumno
alumno1.imprimirCalificacion(); // Llama al método para imprimir la calificación del alumno1
alumno1.evaluacion(); // Llama al método para evaluar y mostrar si el alumno1 aprobó o no

alumno2.imprimirCalificacion(); // Llama al método para imprimir la calificación del alumno2
alumno2.evaluacion(); // Llama al método para evaluar y mostrar si el alumno2 aprobó o no