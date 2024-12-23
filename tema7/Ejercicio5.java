/*Escribe un programa que pida 10 números por teclado y que luego muestre
los números introducidos junto con las palabras “máximo” y “mínimo” al lado
del máximo y del mínimo respectivamente.*/
package tema7;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num;
        int max = 0;
        int min = 0;
        int[] lista = new int[10];

        System.out.println("Escriba diez numeros");

        for (int i = 0; i < 10; i++) {
            num = s.nextInt();
            lista[i] = num;
            
            if(i == 0){
            max = num;
            min = num;
            }else{
                if(num > max){
                max = num;
                }
                if(num < min){
                min = num;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(i+"º -> "+lista[i]);
                if(lista[i] == max){
                    System.out.print(" Máximo");
                }else if(lista[i] == min){
                    System.out.print(" Mínimo");
                }
            System.out.println();
            }
                
        }
    }


