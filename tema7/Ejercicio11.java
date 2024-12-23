/*Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
primos a las primeras posiciones, desplazando el resto de números (los que
no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
el array resultante.*/
package tema7;

import java.util.Scanner;


public class Ejercicio11 {


    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int contadorCompuestos = 0;
    int contadorPrimos = 0;
    int[] lista = new int[10];
    int[] primos = new int [10];
    int [] compuestos = new int [10];
    
        System.out.println("Escriba 10 números: ");
        for (int i = 0; i < 10; i++) {
            int num = s.nextInt();
            num = Math.abs(num);
            lista[i] = num;
        }
        for (int i = 0; i < 10; i++) {
            boolean primo = true;
            
            if (lista[i] <= 1) {
                primo = false;
            } else {
                for (int j = 2; j <= Math.sqrt(lista[i]); j++) {
                    if (lista[i] % j == 0) {
                        primo = false;
                    }
                }
            }
            
            if (primo) {
                primos[contadorPrimos++] = lista[i];
            } else {
                compuestos[contadorCompuestos++] = lista[i];
            }
        }
        for (int i = 0; i < contadorPrimos; i++) {
            lista[i] = primos[i];
        }
        for (int i = 0; i < contadorCompuestos; i++) {
            lista[contadorPrimos + i] = compuestos[i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i+" -> "+lista[i]);
        }
        
    }

}
