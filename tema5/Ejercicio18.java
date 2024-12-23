
/*Escribe un programa que obtenga los números enteros comprendidos entre
dos números introducidos por teclado y validados como distintos, el programa
debe empezar por el menor de los enteros introducidos e ir incrementando de
7 en 7.*/
package tema5;

import java.util.Scanner;


public class Ejercicio18 {


    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.println("Escriba un numero: ");
        int num1 = s.nextInt();
        
        System.out.println("Escriba otro numero: ");
        int num2 = s.nextInt();
        
        if(num1 == num2){
            System.out.println("los numeros deben ser distintos");
            
        }else if(num1 < num2){
            for (int cont = num1; cont < num2; cont +=  7) {
                System.out.print(cont+", ");
            }
            
        }else if(num1 > num2){
            for(int cont = num2; cont < num1; cont += 7){
                System.out.print(cont+", ");
            }
        }
    }

}
