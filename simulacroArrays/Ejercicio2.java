
package simulacroArrays;

import java.util.Scanner;


public class Ejercicio2 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[][] Matriz = new int [3][3];
        int[] prueba = new int[8];
        boolean magico = false;
        int contador = 0;
        int contador2 = 0;
        
        System.out.println("Escriba los nueve valores de la Matriz: ");
        
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[0].length; j++) {
                Matriz[i][j] = s.nextInt();
            }
        }
        System.out.println("- - - - - - - -");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[0].length; j++) {
                System.out.print("| "+Matriz[i][j]+" |");
            }
            System.out.println();
            System.out.println("- - - - - - - -");
        }
        for (int i = 0; i < Matriz.length; i++) {
            prueba[i] = Matriz[i][0] + Matriz[i][1] + Matriz[i][2];
            contador++;
        }
        for (int i = 0; i < Matriz[0].length; i++) {
            prueba[contador] = Matriz[0][i] + Matriz[1][i] + Matriz[2][i];
            contador++;
        }
        prueba[contador] = Matriz[0][2] + Matriz[1][1] + Matriz[2][0];
        prueba[contador+1] = Matriz[0][0] + Matriz[1][1] + Matriz[2][2];
        
        for (int i = 0; i < prueba.length; i++) {
            for (int j = 0; j < prueba.length; j++) {
                if(prueba[i] == prueba[j]){
                contador2++;
                }
            }
        }
        if(contador2 == 64){
        magico = true;
            System.out.println("La matriz es mágica");
        }else{
            System.out.println("La matriz no es magica");
            System.out.println(contador2);
        }
    }

}
