
package tema5;

import java.util.Scanner;


public class Ejercicio24 {


    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.println("Introduzca la altura de la piramide: ");
        int altura = s.nextInt();
        int centro = altura;
        int anchura = altura * 2;
        int indiceAmplitud = 0;
        
        for (int fila = 1; fila <= altura; fila++, indiceAmplitud++) {
            int contador = 1;
            for (int columna = 1; columna < anchura; columna++){
                 if(columna >= centro - indiceAmplitud && columna < centro){                     
                     System.out.print(contador++);
                 } else if((columna <= centro + indiceAmplitud || columna == centro) && columna >= centro){
                      System.out.print(contador--);
                 }
                else{
                    System.out.print(" ");
                
                }
            }    
            
            System.out.println();
        }
        }
    }



