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
// Instanciar: Materializar

class persona {
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

    constructor (nombre, apellido, edad, telefono) {

    } 

comer () {
    console.log("Bon apetit");
}
bailar () {
    console.log("Dale hasta el suelo");
}

mostrarInfo () {
    console.log("Nombre");
    console.log("Apellido");
    console.log("Edad");
    console.log("Email");
    console.log("Teléfono: ");
    }
}
