//Rey David Martínez Olivares
/*
 * Retroalimentación:
 * - Analisar todo el algoritmo antes de intentar plasmar la solución en código
 * - Estudiar más conceptos de POO
 * - Buena comunicación al explicar proceso de codeo
 * */

package liveCoding3;

public class MangosNaranjas {

	private int mangos;
	private int naranjas;
	
	public MangosNaranjas(int mangos, int naranjas) {
		this.mangos = mangos;
		this.naranjas = naranjas;
	}
	
	public void imprimir() {
		int numeroCajas = Math.min(naranjas, mangos);
	}
	
	//int mangosCaja = mangos / numeroCajas;
	//int naranjasCaja =	naranjas / numeroCajas;	
	
	public class Main {
		
	}
}


/*
package liveCoding3;
import java.util.Scanner;

public class MangosNaranjas {

    private int mangos;
    private int naranjas;

    public MangosNaranjas(int mangos, int naranjas) {
        this.mangos = mangos;
        this.naranjas = naranjas;
    }

    public void imprimirCajas() {
        int menorCantidad = Math.min(mangos, naranjas);
        for (int i = menorCantidad; i >= 1; i--) {
            if (mangos % i == 0 && naranjas % i == 0) {
                int cajas = i;
                int mangosPorCaja = mangos / i;
                int naranjasPorCaja = naranjas / i;

                System.out.println("Número de cajas: " + cajas);
                System.out.println("Mangos por caja: " + mangosPorCaja);
                System.out.println("Naranjas por caja: " + naranjasPorCaja);
                break;
            }
        }
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de mangos: ");
        int numMangos = scanner.nextInt();
        
        System.out.print("Ingrese el número de naranjas: ");
        int numNaranjas = scanner.nextInt();
        
        MangosNaranjas cajas = new MangosNaranjas(numMangos, numNaranjas);
        cajas.imprimirCajas();
        
        scanner.close();
    	}
    }
    */

