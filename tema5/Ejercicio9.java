
/*Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado.
*/
package tema5;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        int num = s.nextInt();
        
        int digitos = 0;
        
        while(num > 0){            
            num = num / 10;
            digitos ++;
        }
        System.out.println("el numero de digitos del numero es: "+digitos);
    }

}
