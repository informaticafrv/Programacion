/*Escribe un programa que rellene un array de 20 elementos con números enteros
aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación
el programa mostrará el array y preguntará si el usuario quiere resaltar los
múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el
array escribiendo los números que se quieren resaltar entre corchetes.*/
package tema7;

import java.util.Scanner;


public class Ejercicio16 {


    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        int[] lista = new int[20];
        
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int)(Math.random()*401);
        }
        
        for (int i = 0; i < lista.length; i++) {
            System.out.print("|"+lista[i]+"|\t");
            if(i != 0 && i % 4 == 0){
                System.out.println();
            }
        }
        System.out.println();
        
        System.out.println("Quiere resaltar los múltiplos de 5 o de 7?");
        System.out.println("1.Múltiplos 5 | 2. Múltiplos 7");
        int opc = s.nextInt();
        
        switch (opc) {
            case 1:
                for (int i = 0; i < lista.length; i++) {
                    System.out.print("|"+lista[i]+"|\t");
                    
                    if(lista[i] % 5 == 0){
                        System.out.print("|["+lista[i]+"]|\t");
                    }
                    if(i != 0 && i % 4 == 0){
                        System.out.println();
                    }
                }
                System.out.println();
                break;
            case 2:
                for (int i = 0; i < lista.length; i++) {
                    System.out.print("|"+lista[i]+"|\t");
                    
                    if(lista[i] % 7 == 0){
                        System.out.print("|["+lista[i]+"]|\t");
                    }
                    if(i != 0 && i % 4 == 0){
                        System.out.println();
                    }
                }
                System.out.println();
                break;
        }
    }

}
