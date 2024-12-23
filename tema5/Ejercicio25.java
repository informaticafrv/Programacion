/*Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés.*/
package tema5;

import java.util.Scanner;
public class Ejercicio25 {


    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        int numrev = 0;
        
        System.out.println("Escriba un numero: ");
        int num = s.nextInt();
        
        
        while(num != 0){
        int digito = num % 10;
            System.out.println("esto es digito: "+digito);
        numrev = numrev * 10 + digito;
            System.out.println("esto es el numero al reves: "+numrev);
        num = num /10;
            System.out.println("y asi se va dividiendo el numero: "+num);
        }
        System.out.println("el número al reves es: "+numrev);
    }

}
