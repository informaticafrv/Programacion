
package tema8.Ejercicios;

import java.util.Scanner;
import tema8.funciones.SiguientePrimo;

public class Ejercicio3 {


    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.println("Escriba un número: ");
        int num = s.nextInt();
        
        System.out.println(SiguientePrimo.SigPrimo(num));
    }

}
