
/*Escribe un programa que calcule el factorial de un número entero leído por
teclado.*/
package tema5;
import java.util.Scanner;

public class Ejercicio28 {


    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.println("escriba un numero: ");
        int num = s.nextInt();
        
        long num2 = 1;
        
        for (int cont = 1; cont <= num; cont++) {
            
            num2 *= cont;
            System.out.print(" "+cont+"*");
        }
        System.out.println(" = "+num2);
        System.out.println(num+"! = "+num2);
    }

}
