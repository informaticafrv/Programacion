
package ensayoBucles;

import java.util.Scanner;


public class letraL {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escriba que tamaño quiere que tenga la Letra l :");
        int altura = s.nextInt();
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if(i == altura -1){
                    System.out.print("*");
                }
                if(j == 0){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}
