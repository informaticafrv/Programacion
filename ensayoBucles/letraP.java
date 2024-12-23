
package ensayoBucles;

import java.util.Scanner;


public class letraP {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Escriba la altura de la letra P: ");
        int altura = s.nextInt();
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if(j == 0 || j == altura-1 && i < altura/2 || i == altura/2 || i == 0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
