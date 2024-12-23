
package ensayoBucles;

import java.util.Scanner;


public class piramide {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int contador = 0;
        
        System.out.println("Escriba la altura de la pirámide: ");
        int altura = s.nextInt();
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura - contador; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < contador*2; j++) {
                System.out.print("*");
            }
            contador++;
            System.out.println();
        }
    }

}
