/*Escribe un programa que muestre tres apuestas de la quiniela
en tres columnas para los 14 partidos y el pleno al quince (15 filas).*/

package tema6;

import java.util.Scanner;


public class Ejercicio7 {


    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.println("Quiniela: ");
        
        for (int i = 1; i < 15; i++) {
            System.out.print("Partido "+i+": ");
            for (int j = 0; j < 3; j++) {
                int num = (int)(Math.random()*3);
                if(num == 1){
                    System.out.print(" 1 ");
                }else if(num == 2){
                    System.out.print(" 2 ");
                }else if(num == 0){
                    System.out.print(" X ");
                }
                
            }
           System.out.println();
           
        }
        int num2 = (int)(Math.random()*3);
        if(num2 == 0){
            System.out.println("pleno : X");
        }else if(num2 == 1){
            System.out.println("pleno: 1");
        }else if(num2 == 2){
            System.out.println("pleno: 2");
        }
    }

}
