
package ensayoBucles;

import java.util.Scanner;


public class piramideHueca {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int contador = 0;
        
        System.out.println("Escriba la altura de la pirámide: ");
        int altura = s.nextInt();
        
        for (int i = 1; i <= altura; i++) {
            // Imprimimos los espacios iniciales para alinear la pirámide
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            
            // En cada línea, construimos los caracteres de la pirámide
            for (int j = 1; j <= 2 * i - 1; j++) {
                // Para hacerla hueca, imprimimos el carácter solo en los bordes
                if (j == 1 || j == 2 * i - 1 || i == altura) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            // Pasamos a la siguiente línea después de cada nivel de la pirámide
            System.out.println();
        }
        }
    }

