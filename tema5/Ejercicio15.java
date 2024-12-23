/*Escribe un programa que dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla todas las potencias con base el
numero dado y exponentes entre uno y el exponente introducido. No se deben
utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
se deberán mostrar 21
, 22
, 23
, 24 y 25
.*/
package tema5;

import java.util.Scanner;


public class Ejercicio15 {


    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.println("Introduce la base: ");
        double base = s.nextDouble();
        
        System.out.println("Introduce el exponente máximo");
        int expm = s.nextInt();
        
        if(expm < 0){
            
            System.out.println("el exponente debe ser un numero entero positivo.");
            
        }else{
            
        for(int exp = 1; exp <= expm; exp++){
        double resul = 1;
        
            for(int cont = 1; cont <= exp; cont++){
            resul = resul * base;
            }
        System.out.println(base+" elevado a "+exp+" es: "+resul);
        }
        }
    }

}

