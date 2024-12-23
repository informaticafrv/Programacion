
package simulacroArrays;

import java.util.Scanner;


public class Ejercicio3 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int filaN = 0;
        
        int[][] tablero = new int [8][8];
        
        System.out.println("Escriba la fila del tablero (a-h) : ");
        String filaL = s.nextLine();
        switch (filaL) {
            case "a":
                filaN = 0;
                break;
            case "b":
                filaN = 1;
                break;
            case "c":
                filaN = 2;
                break;
            case "d":
                filaN = 3;
                break;
            case "e":
                filaN = 4;
                break;
            case "f":
                filaN = 5;
                break;
            case "g":
                filaN = 6;
                break;
            case "h":
                filaN = 7;
                break;
            
            default:
                System.out.println("La fila tiene que ser de la a a la h");
        }
        
        System.out.println("Escriba la columna del tablero: ");
        int columna = s.nextInt();
        
        
    }

}
