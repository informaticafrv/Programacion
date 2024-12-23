/*Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo.*/

package tema5;

import java.util.Scanner;


public class Ejercicio21 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int num = 0;
        int cont = 0;
        int par = 0;
        int inpar = 0;
        int cont2 = 0;
        
        while(num >= 0){
            System.out.println("Introduzca un numero: ");
            num = s.nextInt();
            
            cont++;
            
            if(num % 2 == 0){
                if(num > par){
                par = num;
                }
            }else if(num < 0){
            cont--;
            }else{
                cont2++;
               inpar = num + inpar;
            }
        }
        System.out.println("los numeros introducidos son: "+cont);
        System.out.println("el numero par  más alto es: "+par);
        System.out.println("la media de los impares es: "+inpar / cont2);
    }

}
