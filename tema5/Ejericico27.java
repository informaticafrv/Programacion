
/*Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
entre 1 y un número leído por teclado.*/
package tema5;
import java.util.Scanner;

public class Ejericico27 {


    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        int multi;
        int suma = 0;
        
        System.out.println("Escriba un numero: ");
        int num = s.nextInt();
        
        for (int cont = 1; cont <= num; cont++) {
            
            multi = cont  * 3;
            suma += multi; 
            
            System.out.println(cont+" X 3 = "+multi);
        }
        System.out.println("se han mostrado un total de: "+num+" múltiplos de 3");
        System.out.println("la suma total de todos los múltiplos es: "+suma);
    }

}
