
package ensayoBucles;

import java.util.Scanner;


public class letraX {


    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        int contador = 0;
        
        System.out.println("Escriba la altura de la X");
        int altura = s.nextInt();
        
        for (int i = 0; i < altura; i++) {
            contador++;
            for (int j = 0; j < altura; j++) {
                if(j == i || j == altura - contador){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
