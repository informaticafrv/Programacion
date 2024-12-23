
/*Escribe un programa que muestre por pantalla todos los números enteros
positivos menores a uno leído por teclado que no sean divisibles entre otro
también leído de igual forma.*/
package tema5;
import java.util.Scanner;
public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("escribe el número limite: ");
        int limit = s.nextInt();
        limit = Math.abs(limit);
        
        System.out.println("escriba el nuemero por que el que no pueden ser divisbles: ");
        int div = s.nextInt();
        
        
        for (int cont = 0; cont < limit; cont++) {
            if(cont % div != 0){
                System.out.print(cont+", ");
            }
        }
    }

}
