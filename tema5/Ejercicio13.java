/*Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos.*/
package tema5;

import java.util.Scanner;


public class Ejercicio13 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int pos = 0;
        int neg = 0;
        
        System.out.println("Escriba una lista de 10 numeros: ");
        for (int num1 = 0; num1 < 10; num1++) {
            
            int num2 = s.nextInt();
            
            if(num2 < 0){
            neg++;
            }else{
            pos++;
            }
            
        }
        
        System.out.println("hay "+pos+" numeros positivos y "+neg+" numeros negativos");
    }

}
