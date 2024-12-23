
package ensayoBucles;

import java.util.Scanner;


public class prueba {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Escriba la altura");
        int altura = s.nextInt();
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
