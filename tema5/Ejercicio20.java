
package tema5;

import java.util.Scanner;


public class Ejercicio20 {


    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.println("Introduzca la altura de la piramide: ");
        int altura = s.nextInt();
        int centro = altura;
        int anchura = altura * 2;
        int indiceAmplitud = 0;
        System.out.println("Introduzcca el caracter con el que quiere pintar la pirámide: ");
        char caracter = s.next().charAt(0);
        
        for (int fila = 1; fila <= altura; fila++, indiceAmplitud++) {
            for (int columna = 1; columna < anchura; columna++){
                if ((columna == centro - indiceAmplitud || columna == centro + indiceAmplitud) || fila == altura){
                    System.out.print(caracter);
                }else{
                    System.out.print(" ");
                
                }
            }    
            
            System.out.println();
        }
        }
    }



