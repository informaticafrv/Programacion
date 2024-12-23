package tema8.Ejercicios;

import java.util.Scanner;
import tema8.funciones.funciones29_34;

public class Ejercicios29_34 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean salir = false;
        int filas = 0;
        int columnas = 0;
        int minimo = 0;
        int maximo = 0;
        
        System.out.println("Escriba el número de filas: ");
        filas = s.nextInt();

        System.out.println("Escriba el número de columnas: ");
        columnas = s.nextInt();

        System.out.println("Escriba el número minimo que debe salir en la tabla: ");
        minimo = s.nextInt();

        System.out.println("Escriba el número maximo que debe salir en la tabla: ");
        maximo = s.nextInt();
        
        int[][] ArrayPrincipal = funciones29_34.generaArray(filas, columnas, minimo, maximo);
        
        do {
            System.out.println("0 -> Salir");
            System.out.println("1 -> generar un tabla");
            System.out.println("2 -> elije una fila");
            System.out.println("3 -> elije una columna");
            System.out.println("Elije una opción: ");
            int op = s.nextInt();

            switch (op) {
                case 0:
                    salir = true;
                    break;
                case 1:

                    System.out.println("Contenido del array generado:");
                    System.out.println("--------------------------------------------------");
                    for (int i = 0; i < ArrayPrincipal.length; i++) {
                        for (int j = 0; j < ArrayPrincipal[i].length; j++) {
                            System.out.print("| " + ArrayPrincipal[i][j] + " |");
                        }
                        System.out.println();
                        System.out.println("--------------------------------------------------");
                    }
                    break;
                case 2:
                    funciones29_34.generaArray(filas, columnas, minimo, maximo);
                    int[] filaElegida = funciones29_34.filaElejida(ArrayPrincipal, filas, columnas, minimo, maximo);
                    System.out.println("La fila elegida contiene: ");
                    for (int i = 0; i < filaElegida.length; i++) {
                        System.out.print("| " + filaElegida[i] + " |");
                    }
                    System.out.println();

                    break;
                case 3:
                   funciones29_34.generaArray(filas, columnas, minimo, maximo);
                    int[] columnaElegida = funciones29_34.columnaElegida(ArrayPrincipal, filas, columnas, minimo, maximo);
                    System.out.println("La fila elegida contiene: ");
                    for (int i = 0; i < columnaElegida.length; i++) {
                        System.out.println("| " + columnaElegida[i] + " |");
                    }

                    break;
                case 4:
                    int[][] coordenadas = funciones29_34.coordenadas(ArrayPrincipal, filas, columnas, minimo, maximo);
                    System.out.println("El numero se encuentra en las siguientes coordenadas: {"+coordenadas[1][0]+" , "+coordenadas[1][1]+"}");
                    break;
                case 5:
                    System.out.println(funciones29_34.puntoDeSilla(ArrayPrincipal, filas, columnas, minimo, maximo));
                    break;
                case 6:
                    System.out.println();
                    break;
            }
        } while (salir == false);
    }

}
