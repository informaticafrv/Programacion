
package ensayoBucles;

import java.util.Scanner;


public class bluetooth {


    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        int contador = 0;
        
        System.out.println("Escriba la altura de la figura de bluetooth");
        int altura = s.nextInt();
        
        for (int i = 0; i < altura; i++) {
            contador++;
            for (int j = 0; j < altura; j++) {
                if((j == i || j == altura - contador) || (j == altura/2) || (i == altura -1 && (j > altura/2)) || (i == 0 && ( j > altura/2))){
                    System.out.print("*");
                }/*else if((i == altura && (j == 0 && j == altura)) || (i == 0 && (j == 0 || j == altura))){
                    System.out.print(" ");
                }*/else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
