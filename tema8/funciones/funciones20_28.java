/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8.funciones;

import java.util.Scanner;

/**
 *
 * @author Lobo
 */
public class funciones20_28 {
    Scanner s = new Scanner(System.in);
    public static void Array(){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Escriba el mínimo: ");
        int min = s.nextInt();
        System.out.println("Escriba el máximo: ");
        int max = s.nextInt();
        System.out.println("Escriba el tamaño del array: ");
        int t = s.nextInt();
        
        int lista[] = new int[t];
        
        for (int i = 0; i < t-1; i++) {
            lista[i] = (int)(Math.random()*max)+min;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(i+" -> "+lista[i]);
        }
}
    public static int minimo (int listaPrincipal[], int max){
        
        int minimo = max;
    
        for (int i = 0; i < listaPrincipal.length; i++) {
            if(listaPrincipal[i] < minimo){
            minimo = listaPrincipal[i];
            }
        }
        System.out.print("El mínimo es: ");
        return minimo;
    }
    public static int maximo(int listaPrincipal[], int min){
    
        int maximo = min;
    
        for (int i = 0; i < listaPrincipal.length; i++) {
            if(listaPrincipal[i] > maximo){
            maximo = listaPrincipal[i];
            }
        }
        System.out.print("El mínimo es: ");
        return maximo;
    }
    public static int media(int listaPrincipal[]){
    int media;
    int acumulador = 0;
    int contador = 0;
    
        for (int i = 0; i < listaPrincipal.length; i++) {
            acumulador += listaPrincipal[i];
            contador++;
        }
        media = acumulador / contador;
        System.out.print("La media de todo el array es: ");
        return media;
    }
    public static boolean estaEnArray(int listaPrincipal[]){
    Scanner s = new Scanner(System.in);
        boolean estaEnArray = false;
    
        System.out.println("Escribe el valor que quieres comprobar en el array");
        int comprobacion = s.nextInt();
    
        for (int i = 0; i < listaPrincipal.length; i++) {
            if(listaPrincipal[i] == comprobacion){
                System.out.println("El valor si está en el Array");
            estaEnArray = true;
            }else{
                System.out.println("El valor no está en el Array");
            estaEnArray = false;
            }
        }
        return estaEnArray;
        
    }
    public static int posicion(int listaPrincipal[]){
    Scanner s = new Scanner(System.in);
    
        System.out.println("Escribe el valor del cual quieres saber la posición: ");
        int valor = s.nextInt();
        int posicion = 0;
    
        for (int i = 0; i < listaPrincipal.length; i++) {
            if(listaPrincipal[i] == valor){
                 posicion = i;
                System.out.println("El valor si está en el Array, en la posición: ");
                return posicion;
            }else{
                System.out.println("El valor no está en el Array");
                return -1;
            }
           }
        return posicion;
        }
    public static void listaReves (int listaPrincipal[], int t){
    int listaReves[] = new int [t];
    int contador = t -1;
        for (int i = 0; i < listaPrincipal.length; i++) {
            
            listaReves[contador] = listaPrincipal[i];
            contador--;
        }
        System.out.println("la lista del revés es: ");
        
        for (int i = 0; i < listaReves.length; i++) {
            System.out.println(i+" -> "+listaReves[i]);
        }
}
    public static void listarotaderecha (int listaPrincipal[], int t){
        Scanner s = new Scanner(System.in);
        
    int listarotaderecha[] = new int [t];
    
        System.out.println("Cuantas posiciones quieres rotar?");
        int rotar = s.nextInt();
        
        for (int i = 0; i < listarotaderecha.length; i++) {
            listarotaderecha[i] = listaPrincipal[i];
        }
        
        for (int i = 0; i < listarotaderecha.length; i++) {
            int aux = listarotaderecha[0];
            
           if(i < listarotaderecha.length){
            listarotaderecha[i] = listarotaderecha[i+rotar];
           }else{
           listarotaderecha[i] = aux;
           }
           
        }
    }
}
