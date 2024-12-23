
package ensayoBucles;

import java.util.Scanner;


public class letraR {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Escriba la altura de la R");
        int altura = s.nextInt();
        int contador = 0;
        
        for (int i = 0; i < altura; i++) {
                contador++;
            for (int j = 0; j < altura; j++) {
                if(j == 0 || i == 0 || i == altura/2 || (i <= altura/2 && j == altura -1) || (i > altura/2 && (j == contador -1))){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            /*for (int j = 0; j <= altura; j++) {
                if(i >= altura/2 +1 && (j == 1 || j == contador)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                }*/
            System.out.println();
            }
        }
    }

