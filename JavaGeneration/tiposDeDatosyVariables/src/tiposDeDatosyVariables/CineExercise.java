package tiposDeDatosyVariables;

public class CineExercise {
	public static void main(String[] args) {
		
		//Programa para un cine
		
				double precioEntrada = 75.5;
				double precioPalomitas = 89.7;
				double precioBebidas = 35.5;
				int capacidadTotal = 500;
				
				int personasDentro = 342;
				
				if(personasDentro > capacidadTotal) {
					System.out.println("Lo lamento, ya no hay cupo");
				}
				
				double totalEntrada = personasDentro * precioEntrada;
				double totalPalomitas = personasDentro * precioPalomitas;
				double totalBebidas = personasDentro * precioBebidas;
				
				System.out.println("Total de personas "+ personasDentro);
				System.out.println("Total de entradas "+ totalEntrada);
				System.out.println("Total palomitas "+ totalPalomitas);
				System.out.println("Total de bebidas "+ totalBebidas);
	}

}
