/*Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
convertir un entero en un carácter.*/

package tema6;


public class Ejercicio12 {


    public static void main(String[] args) throws InterruptedException {
        
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                
                int caracter = (int)(Math.random()*95)+32;
                
                System.out.print((char)caracter);
                Thread.sleep(250);
            }
            System.out.println();
        }
        
    }

}
