/*Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo).
*/
package tema5;

import java.util.Scanner;


public class Ejercicio17 {


    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        int resul = 0;
        
        System.out.println("Introduzca un numero: ");
        int num = s.nextInt();
        
        if(num < 0){
            System.out.println("el número tiene que ser positivo");
        }else{
            for (int cont = 1; cont <= 100; cont++) {
                resul += (num + cont);
                System.out.println("va por: "+resul);
            }
        }
        System.out.println("El numero "+num+" sumado a los siguientes 100 numeros es: "+resul);
    }

}
