
/*Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.
*/

import java.util.Scanner;


public class Ejercicio7 {


    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        boolean flag = true;
        
        System.out.println("escriba la combinación");
        int contra = s.nextInt();
        
        while (contra != 1234) {
            System.out.println("Lo siento no es la combinación");
            contra = s.nextInt();
        }
        System.out.println("La caja se ha abierto satisfactoriamente");
    }
}
