/*Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos*/

package tema5;

import java.util.Scanner;

public class Ejercicio22 {
 
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        for (int cont = 2; cont <= 100; cont++) {
            int div  = 0;
            
            for(int cont2 = 1;cont2 <= cont; cont2++ ){
            
                if(cont % cont2 == 0 ){
                    div++;
                }
                }
            if(div == 2){
                    System.out.print(cont+", ");
            }
            }
         } 
        }
