/*Escribe un programa que rellene un array de 100 elementos con números enteros
aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
el programa mostrará el array y preguntará si el usuario quiere destacar el
máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
el número destacado entre dobles asteriscos.*/
package tema7;

import java.util.Scanner;


public class Ejercicio13 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[] num = new int[100];
        int max = 0;
        int min = 500;
        
        for (int i = 0; i < 100; i++) {
            int aleatorio = (int)(Math.random()*501);
            if(aleatorio > max){
            max = aleatorio;
            }
            if(aleatorio < min){
            min = aleatorio;
            }
             num[i] = aleatorio; 
        }
        
        for (int i = 0; i < 100; i++) {
            if(i < 99){
            System.out.print(num[i]+", ");
            }else{
                System.out.print(num[i]+".");
            }
            if(i % 10 == 0 && i != 0){
                System.out.println();
            }
        }
        System.out.println();
        
        System.out.println("Quiere destacar el máximo o el mínimo?");
        System.out.println("1.máximo 2.mínimo");
        int opc = s.nextInt();
        
        switch(opc){
            case 1:
                for (int i = 0; i < 100; i++) {
                    if(num[i] == max){
                        System.out.print("**"+num[i]+"**, ");
                    }else if(i < 99){
                    System.out.print(num[i]+", ");
                    }else{
                        System.out.print(num[i]+".");
                    }
                    if(i % 10 == 0 && i != 0){
                        System.out.println();
                    }
        }
                System.out.println();
                break;
                
            case 2:
                for (int i = 0; i < 100; i++) {
                    if(num[i] == min){
                        System.out.print("**"+num[i]+"**, ");
                    }else if(i < 99){
                    System.out.print(num[i]+", ");
                    }else{
                        System.out.print(num[i]+".");
                    }
                    if(i % 10 == 0 && i != 0){
                        System.out.println();
                    }
        }
                System.out.println();
                break;
        }
    }

}
