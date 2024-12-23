/*Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad*/
package tema5;

import java.util.Scanner;


public class Ejercicio16 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        boolean flag = true;
        
        System.out.println("Escriba un numero: ");
        int num = s.nextInt();
        
        if(num <= 1){
            flag = false;
        }else{
        for(int cont = 2; cont  <= Math.sqrt(num); cont++){
        if(num % cont == 0){
        flag = false;
        break;
        }
        }
        }
        if(flag){
            System.out.println(num+" es un numero primo");
        }else{
            System.out.println(num+" no es un numero primo");
        }
    }

}
