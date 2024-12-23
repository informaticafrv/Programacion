
package ensayoBucles;

import java.util.Scanner;


public class letraN {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escriba el tamaño de la letra N: ");
        int altura = s.nextInt();
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if(j == 0 || j == altura -1 || j == i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
