/*Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a
derecha que ocupa ese dígito en el número introducido.*/
package tema5;

import  java.util.Scanner;
public class Ejercicio26 {


    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.println("Introduzca un numero: ");
        int num = s.nextInt();
        
        System.out.println("Introduzca un digito: ");
        int dig = s.nextInt();
        
        int num2 = num;
        int longitud = 0;

        while (num2 != 0) {
            num2 /= 10;
            longitud++;
        }

        System.out.println("Posiciones del dígito " + dig + " en el número " + num + ":");
        boolean flag = false;

        for (int cont = longitud; cont > 0; cont--) {
            int dig2 = (num / (int) Math.pow(10, cont - 1)) % 10;
            if (dig2 == dig) {
                System.out.println("Posición: " + (longitud - cont + 1));
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("El dígito '" + dig + "' no se encuentra en el número " + num);
        }

    }
}
