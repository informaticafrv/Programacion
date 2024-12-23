
package ensayoBucles;

import java.util.Scanner;


public class letraT {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Escriba la altura de la letra T: ");
        int altura = s.nextInt();
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if(i == 0 || j == altura/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }

}
