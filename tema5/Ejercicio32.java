/*Escribe un programa que, dado un número entero, diga cuáles son y cuánto
suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
números largos.*/
package tema5;

import java.util.Scanner;

public class Ejercicio32 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long suma = 0;
        long numinv = 0;

        System.out.println("escriba un número: ");
        int num = s.nextInt();
        num = Math.abs(num);

        while (num > 0) {
            numinv = numinv * 10 + num % 10;
            num = num / 10;
        }
        System.out.print("los pares son: ");
        while (numinv > 0) {

            long dig = numinv % 10;

            if (dig % 2 == 0) {
                System.out.print(dig + " ,");
                suma = suma + dig;
            }
            numinv = numinv / 10;
        }
        System.out.println();
        System.out.println(" Y sumados dan: " + suma);
    }

}
