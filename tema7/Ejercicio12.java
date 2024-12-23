
package tema7;

import java.util.Scanner;


public class Ejercicio12 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[] lista = new int[10];
        int indice1;
        int indice2;
        int auxiliar = 0;
        
        System.out.println("Ecriba diez números: ");
        for (int i = 0; i < 10; i++) {
            int num = s.nextInt();
            lista[i] = num;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i+" -> "+lista[i]);
        }
        
        do{
        System.out.println("introduzca dos indices para cambiarlos entre si");
        System.out.println("Primer indice: ");
        indice1 = s.nextInt();
        System.out.println("Segundo indice: ");
        indice2 = s.nextInt();
        if(indice1 < 0 || indice1 > 9 || indice2 < 0 || indice2 > 9){
            System.out.println("los índices no pueden ser menores a 0");
            System.out.println("y tienen que estar comprendidos entre 0 y 9");
        }
        }
        while(indice1 < 0 || indice1 > 9 || indice2 < 0 || indice2 > 9);
        
        auxiliar = lista[indice2];
        
        lista[indice2] = lista[indice1];
        lista[indice1] = auxiliar;
        
        System.out.println("Auxiliar -> "+auxiliar);
        
        for (int i = 0; i < 10; i++) {
            System.out.println(i+" -> "+lista[i]);
        }
        
    }

}
