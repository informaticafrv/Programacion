/*Escribe un programa que pida una base y un exponente (entero positivo) y
que calcule la potencia.*/
package tema5;

import java.util.Scanner;


public class Ejercicio14 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("escriba una base: ");
        int base = s.nextInt();
        
        System.out.println("escriba un exponente: ");
        int exp = s.nextInt();
        base = Math.abs(base);
        base = Math.abs(exp);
        
        int resul = 1;
        
        for (int cont = 1; cont <= exp; cont++) {
            resul *= base;
        }
        
        System.out.println("el resultado de "+base+" elevado a "+exp+" es : "+ resul);
    }

}
