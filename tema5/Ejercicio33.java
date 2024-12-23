/*Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores.*/
package tema5;

import java.util.Scanner;


public class Ejercicio33 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("escriba la altura de la U: ");
        int altura = s.nextInt();
        
        for (int i = 1; i <= altura; i++) {
            for (int j = 0; j <= altura; j++) {
                if((j == 0 || j == altura) && i < altura){
                    System.out.print("*");
                }else if (i == altura && (j > 0 && j < altura)){
                    System.out.print("*");
                    
                }else {
                    System.out.print(" ");
                }
                }
            System.out.println();
                }
    }

}
