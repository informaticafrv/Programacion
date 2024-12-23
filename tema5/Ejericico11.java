
/*Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado.
*/
package tema5;

import java.util.Scanner;


public class Ejericico11 {


    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.println("escriba un numero: ");
        int num = s.nextInt();
        
        for (int cont = 0; cont < 6; cont++) {
            System.out.println(num+" "+num * num +" "+num * num * num);
            num++;
        }
    }

}
