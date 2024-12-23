/*Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado.*/
package tema5;

import java.util.Scanner;


public class Ejercicio19 {


    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        
        System.out.println("Introduzca la altura de la piramide: ");
        int altura = s.nextInt();
        
        System.out.println("Introduzcca el caracter con el que quiere pintar la pirámide: ");
        char caracter = s.next().charAt(0);
        
        for (int cont = 1; cont <= altura; cont++) {
            
            for (int cont2 = 1; cont2 <= altura -cont; cont2++) {
                System.out.print(" ");
                
            }for (int cont2 = 1; cont2 <= (2 * cont -1); cont2++) {
                System.out.print(caracter);
            }
            
            System.out.println();
            
        }
    }

}
