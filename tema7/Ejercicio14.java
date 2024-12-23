
package tema7;

import java.util.Scanner;


public class Ejercicio14 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int contador = 0;
        int contador2 = 0;

        String[] colores = new String[8];
        colores[0] = "blanco";
        colores[1] = "negro";
        colores[2] = "rojo";
        colores[3] = "azul";
        colores[4] = "amarillo";
        colores[5] = "morado";
        colores[6] = "naranja";
        colores[7] = "verde";
        
        String[] lista1 = new String[8];
        String[] lista2 = new String[8];

        System.out.println("Escriba ocho palabras:");
        System.out.println("Si alguna es un color de la lista, se ordenarán en primer lugar:");

        for (int i = 0; i < lista1.length; i++) {
            String palabra = s.nextLine().toLowerCase();
            boolean color = false;

            for (int j = 0; j < colores.length; j++) {
                if (palabra.equals(colores[j])) {
                    lista1[contador++] = palabra;
                    color = true;
                    break;
                }
            }
            if (!color) {
                lista2[contador2++] = palabra;
            }
        }
        for (int i = 0; i < contador2; i++) {
            lista1[contador + i] = lista2[i];
        }
        System.out.println("Resultado ordenado:");
        for (int i = 0; i < lista1.length; i++) {
            System.out.println(i + " -> " + lista1[i]);
        }
    }
}
