package org.generation.test;

import org.generation.persona.Persona;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonaTest {
	/*Requerimientos:
	 * 	1. Instanciar 4 objetos con los parámetros establecidos en el constructor
	 * 	2. Crear métodos (4) para probar cada objeto instanciado con los valores de los atributos (getters)
	 * 	3. Crear un método de validación de email, donde el email debe cumplir con la condición de dominio @gmail.com ... si cumple con la condición, el test se evalúa correcto, si no, se evalúa como falla (método de test booleano, regex)
	 * */
	//Instanciar los objetos
	Persona persona1 = new Persona("Daniel", "Maldonado", "daniel@gmail.com", 36);
	Persona persona2 = new Persona("Mariana", "Valladolid", "mariana.val@hotmail.com", 26);
	Persona persona3 = new Persona("Enrique", "Cano", "enrique.cano@gmail.com", 41);
	Persona persona4 = new Persona("Maara", "Lomeli", "maara.lomeli@generation.org", 31);
	
	//Agregamos la anotación @Test e importamos.
	//Podemos agregar la anotación @DisplayName para personalizar el nombre de mi método test
    @Test
    @DisplayName("Persona1")
    public void testPersona1(){        
        Assert.assertEquals("Daniel", persona1.getNombre());
        Assert.assertEquals("Maldonado", persona1.getApellido());
        Assert.assertEquals("daniel@gmail.com", persona1.getEmail());
        Assert.assertEquals(36, persona1.getEdad());
    }
    
    @Test
    @DisplayName("Persona2")
    public void testPersona2(){
    	Assert.assertEquals("Mariana", persona2.getNombre());
    	Assert.assertEquals("Valladolid", persona2.getApellido());
    	Assert.assertEquals("mariana.val@hotmail.com", persona2.getEmail());
    	Assert.assertEquals(26, persona2.getEdad());
    }

    @Test
    @DisplayName("Persona3")
    public void testPersona3() {
    	Assert.assertEquals("Enrique", persona3.getNombre());
    	Assert.assertEquals("Cano", persona3.getApellido());
    	Assert.assertEquals("enrique.cano@gmail.com", persona3.getEmail());
    	Assert.assertEquals(41, persona3.getEdad());
    }
    
    @Test
    @DisplayName("Persona4")
    public void testPersona4() {
    	Assert.assertEquals("Maara", persona4.getNombre());
    	Assert.assertEquals("Lomeli", persona4.getApellido());
    	Assert.assertEquals("maara.lomeli@generation.org", persona4.getEmail());
    	Assert.assertEquals(31, persona4.getEdad());
    }
    
    @Test
    @DisplayName("Validación regex de email @gmail.com")
    public void testEmailFormat() {
    	//Assert.assertTrue. Afirma que una condición es verdadera. Si no es así, arroja un AssertionError con el mensaje dado.
    	//.matches. Indica si el String coincide o no con la expresión regular dada. Una invocación de este método de la forma str.matches(regex) produce exactamente el mismo resultado que la expresión
    	
    	Assert.assertTrue(persona1.getEmail().matches("^[A-Za-z0-9._%+-]+@gmail\\.com$"));
    	Assert.assertTrue(persona2.getEmail().matches("^[A-Za-z0-9._%+-]+@gmail\\.com$"));
    	Assert.assertTrue(persona3.getEmail().matches("^[A-Za-z0-9._%+-]+@gmail\\.com$"));
    	Assert.assertTrue(persona4.getEmail().matches("^[A-Za-z0-9._%+-]+@gmail\\.com$"));
    	
    	/*	^ representa el inicio del texto.
    	 * 	[A-Za-z0-9._%+-]+ indica que debe haber uno o más caracteres alfanuméricos, puntos, guiones bajos, porcentajes, signos más y signos menos.
    	 * 	@ representa el símbolo de arroba.
    	 * 	gmail\\.com se utiliza para verificar que la cadena "gmail.com" esté presente después del símbolo de arroba. 
    	 * 	El \\ se utiliza para escapar el carácter . y asegurarse de que se interprete literalmente como un punto y no como un carácter especial que coincida con cualquier carácter.
    	 * 	$ representa el final del texto.
    	 */
    }
}