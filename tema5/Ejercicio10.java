
/*Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo.*/
package tema5;

import java.util.Scanner;


public class Ejercicio10 {


    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        int acumulador = 0;
        int contador = 0;
        
        System.out.println("Intruzca su nota media: ");
            int num = 0;
            
        while(num >= 0){
            
            
            acumulador = acumulador + num;
            
            contador += 1; 
            
            num = s.nextInt();
        }
        System.out.println("su nota meida es: "+acumulador / (contador -1));
    }

}
