/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8.funciones;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class funciones29_34 {
    public static int[][] generaArray (int filas,int columnas, int minimo,int maximo){
    Scanner s = new Scanner(System.in);
    
        int[][] generaArray = new int[filas][columnas];
        
        for (int i = 0; i < filas ; i++) {
            for (int j = 0; j < columnas ; j++) {
                 generaArray[i][j] = (int)((Math.random()*maximo)+minimo);
            }
        }
        
        return generaArray;
    }
    public static int []filaElejida(int [][]generaArray, int filas, int columnas,int minimo, int maximo){
    Scanner s = new Scanner (System.in);
    
    int[][] generado = funciones29_34.generaArray(filas, columnas, minimo, maximo);
    
    int[] filaElegida = new int [filas];
    
        for (int i = 0; i < generado.length; i++) {
            for (int j = 0; j < generado.length; j++) {
                System.out.print("| "+generado[i][j]+" |");
            }
            System.out.println();
        }
        System.out.println("Escriba la fila a devolver: ");
        int eleccion = s.nextInt();
        
        for (int i = 0; i < generado.length; i++) {
            for (int j = 0; j < generado.length; j++) {
                if(i == eleccion){
                filaElegida[j] = generado[i][j];
                }
            }
        }
        return filaElegida;
    }
    public static int []columnaElegida(int [][]generaArray, int filas, int columnas,int minimo, int maximo){
    Scanner s = new Scanner (System.in);
    int[][] generado = funciones29_34.generaArray(filas, columnas, minimo, maximo);
    
    int[] columnaElegida = new int [filas];
    
        for (int i = 0; i < generado.length; i++) {
            for (int j = 0; j < generado.length; j++) {
                System.out.print("| "+generado[i][j]+" |");
            }
            System.out.println();
        }
        System.out.println("Escriba la fila a devolver: ");
        int eleccion = s.nextInt();
        
        for (int i = 0; i < generado.length; i++) {
            for (int j = 0; j < generado.length; j++) {
                if(j == eleccion){
                columnaElegida[i] = generado[i][j];
                }
            }
        }
        return columnaElegida;
    }
    public static int[][]coordenadas(int [][]generaArray, int filas,int columnas, int minimo, int maximo){
    Scanner s = new Scanner(System.in);
        for (int i = 0; i < generaArray.length; i++) {
            for (int j = 0; j < generaArray.length; j++) {
                System.out.print("| "+generaArray[i][j]+" |");
            }
            System.out.println();
        }
        System.out.println("Escriba el número que quiere encontrar: ");
        int num = s.nextInt();
        boolean romper = false;
        int[][] coordenadas = new int [2][2];
        
        for (int i = 0; i < generaArray.length && !romper; i++) {
            for (int j = 0; j < generaArray.length && !romper; j++) {
                if(generaArray[i][j] == num){
                romper = true;
                coordenadas[1][0] = i;
                coordenadas[1][1] = j;
                }
            }
        }
        return coordenadas;
    }
    public static boolean puntoDeSilla(int [][]generaArray, int filas, int columnas, int minimo, int maximo){
    Scanner s = new Scanner(System.in);
    
    int []punto = new int[2];
    boolean puntoDeSilla = false;
    
        for (int i = 0; i < generaArray.length && !puntoDeSilla; i++) {
            for (int j = 0; j < generaArray.length && !puntoDeSilla; j++) {
                for (int k = 0; k < generaArray.length && !puntoDeSilla; k++) {
                    if(generaArray[i][j] < generaArray[k][j] && generaArray[i][j] > generaArray[i][k]){
                        puntoDeSilla = true;
                        punto[0] = i;
                        punto[1] = j;
                    }
                }
            }
        }
        System.out.println("las cordenadas son: {"+punto[0]+" , "+punto[1]+"}");
        return puntoDeSilla;
    }
}
