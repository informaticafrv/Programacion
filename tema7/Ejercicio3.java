

package tema7;

import java.util.Scanner;


public class Ejercicio3 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Escriba diez números: ");
        int num;
        int[] lista = new int[10];
        int cont1 = 10;
        
        for (int i = 0; i < 10; i++) {
            num = s.nextInt();
            cont1--;
            lista[cont1] = num;        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
            System.out.print(i+" -> ");
            for (int j = 0; j < 1; j++) {
                System.out.print(lista[i]);
            }
        }
        System.out.println();
        
        
       
    }

}
