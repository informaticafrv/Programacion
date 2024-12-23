
package tema7;

import java.util.Scanner;


public class pruebaej12 {


    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        
        int[] lista = new int[10];
        int indice1;
        int indice2;
        
        System.out.println("Escriba diez números: ");
        for (int i = 0; i < 10; i++) {
            lista[i] = s.nextInt();
        }
        
        System.out.println("Array inicial:");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " -> " + lista[i]);
        }
        
        // Solicitar y validar los índices
        do {
            System.out.println("Introduzca dos índices para rotar el array:");
            System.out.print("Índice inicial: ");
            indice1 = s.nextInt();
            System.out.print("Índice final: ");
            indice2 = s.nextInt();
            
            if (indice1 < 0 || indice1 > 9 || indice2 < 0 || indice2 > 9 || indice1 >= indice2) {
                System.out.println("Los índices deben estar entre 0 y 9, y el índice inicial debe ser menor que el índice final.");
            }
        } while (indice1 < 0 || indice1 > 9 || indice2 < 0 || indice2 > 9 || indice1 >= indice2);
        
        // Guardar elementos fuera del rango [indice1, indice2] en un array temporal
        int[] temp = new int[10 - (indice2 - indice1 + 1)];
        int pos = 0;
        
        for (int i = 0; i < indice1; i++) {
            temp[pos++] = lista[i];
        }
        for (int i = indice2 + 1; i < 10; i++) {
            temp[pos++] = lista[i];
        }
        
        // Rotar el array temporal a la derecha
        int ultimo = temp[temp.length - 1];
        for (int i = temp.length - 1; i > 0; i--) {
            temp[i] = temp[i - 1];
        }
        temp[0] = ultimo;
        
        // Insertar los elementos rotados nuevamente en sus posiciones originales fuera del rango [indice1, indice2]
        pos = 0;
        for (int i = 0; i < indice1; i++) {
            lista[i] = temp[pos++];
        }
        for (int i = indice2 + 1; i < 10; i++) {
            lista[i] = temp[pos++];
        }
        
        System.out.println("Array resultante:");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " -> " + lista[i]);
        }
    }

}
