

package tema8.Ejercicios;
import tema8.funciones.CuentaNumeros;
import java.util.Scanner;


public class Ejercicio5 {


    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.println("Escriba un número: ");
        int num = s.nextInt();
        
        System.out.println("los dígitos de "+num+" son: "+CuentaNumeros.digitos(num));
    }

}
