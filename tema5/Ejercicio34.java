/*Escribe un programa que pida dos números por teclado y que luego mezcle en
dos números diferentes los dígitos pares y los impares. Se van comprobando
los dígitos de la siguiente manera: primer dígito del primer número, primer
dígito del segundo número, segundo dígito del primer número, segundo
dígito del segundo número, tercer dígito del primer número… Para facilitar
el ejercicio, podemos suponer que el usuario introducirá dos números de la
misma longitud y que siempre habrá al menos un dígito par y uno impar. Usa
long en lugar de int donde sea necesario para admitir números largos.*/
package tema5;

import java.util.Scanner;


public class Ejercicio34 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long pares = 0;
        long impares = 0;
        long multpares = 1;
        long multimpares = 1;
        
        
        System.out.println("Escriba el primer numero: ");
        long num1 = s.nextLong();
        
        System.out.println("escriba el segundo numero: ");
        long num2 = s.nextLong();
        
        while (num1 > 0 || num2 > 0){
        long dig1 = num1 %10;
        num1 /= 10;
        
        long dig2 = num2 %10;
        num2 /= 10;
        
        if(dig1 % 2 == 0){
        pares += dig1 * multpares;
        multpares *= 10;
        }else{
        impares += dig1 * multimpares;
        multimpares *= 10;
        }
        if(dig2 % 2 == 0){
        pares += dig2 * multpares;
        multpares *= 10;
        }else{
        impares += dig2 * multimpares;
        multimpares *= 10;
        }
        }
        System.out.println("el número de los pares: "+pares);
        System.out.println("el número de los impares: "+impares);
    }

}
