/*Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media*/
package tema5;

import java.util.Scanner;


public class Ejercicio23 {


    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        int num = 0;
        int suma = 0;
        int cont = 0;
        double media = 0;
        
        while(suma < 1001){
            
        System.out.println("Escriba numeros y se irán sumando hasta que superen 1000: ");
        num = s.nextInt();
        
        cont++;
        
        suma = num + suma;
        
        }
        
        media = (double)suma / (double)cont;
        
        System.out.println("la suma de los números es: "+suma);
        System.out.println("el total de numeros itroducidos es: "+cont);
        System.out.println("La media es: "+media);
    }

}
