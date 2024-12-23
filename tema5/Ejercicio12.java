/*Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se
debe introducir por teclado.*/
package tema5;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        int num1 = 0;
        int num2 = 1;
        
        System.out.println("Introduzca un numero");
        int limit = s.nextInt();
        
        for ( int cont = 0; cont <= limit; cont++) {
            System.out.print(num1 + ", ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }

}
