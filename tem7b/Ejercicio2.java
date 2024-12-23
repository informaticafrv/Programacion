/*Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las
sumas parciales de filas y columnas igual que si de una hoja de cálculo se
tratara. La suma total debe aparecer en la esquina inferior derecha.*/
package tem7b;

import java.util.Scanner;


public class Ejercicio2 {


    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        int num = 0;
        int[][] tabla = new int[4][5];
        int[] suma1 = new int [4];
        int[] suma2 = new int [5];
        int cont = 0;
        int total = 0;
        
        
        System.out.println("Escriba 20 números enteros: ");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
            num = s.nextInt();
            tabla[i][j] = num;
            suma1[i] += num;
                switch (j) {
                    case 0:
                        suma2[0] += num;
                        break;
                    case 1:
                        suma2[1] += num;
                        break;
                    case 2:
                        suma2[2] += num;
                        break;
                    case 3:
                        suma2[3] += num;
                        break;
                    case 4:
                        suma2[4] += num;
                        break;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(tabla[i][j]+"|");
            }
            System.out.print(suma1[i]+"|");
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
                System.out.print(suma2[i]+"|");
        }
        for (int i = 0; i < 4; i++) {
            total += suma1[i];
        }
        for (int i = 0; i < 5; i++) {
            total += suma2[i];
        }
        System.out.print(total+"|");
    }

}
