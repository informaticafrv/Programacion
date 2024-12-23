
/*Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados).*/
package tema6;

import java.util.Scanner;


public class Ejercicio1 {




    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int num = 0;
        for (int i = 0; i < 3; i++) {
            int dado = (int)(Math.random()*11);
            
            System.out.println("la tirada del dado es: "+dado);
            num += dado;
        }
        System.out.println("la suma de los dados es: "+num);
    }

}
