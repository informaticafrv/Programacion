
package ensayoBucles;

import java.util.Scanner;


public class letraU {


    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.println("Escriba la altura de la U");
        int altura = s.nextInt();
        
        for (int i = 1; i <= altura; i++) {
            for (int j = 0; j <= altura; j++) {
                if(i < altura && (j == 0 || j == altura)){
                    System.out.print("*");
                    }else if(i == altura && (j > 0 && j < altura)){
                    System.out.print("*");
                    }else{
                    System.out.print(" ");
                }
                }
            System.out.println();
            }
        }
    }

