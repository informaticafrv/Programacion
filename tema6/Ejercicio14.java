/*Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
El programa intentará adivinar el número que estás pensando - un número
entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
programa debe preguntar si el número que estás pensando es mayor o menor
que el que te acaba de decir.*/

package tema6;

import java.util.Scanner;


public class Ejercicio14 {


    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner (System.in);
        
        int cont = 5;
        int adivinado;
        int max = 100;
        int min = 0;
        
        System.out.println("Escriba un número de 0 al 100 y el programa intentará adivinarlo");
        int num = s.nextInt();
        
        do{
            cont--;
            adivinado = (int)(Math.random()*(max- min))+min;
            System.out.print("estoy pensando en");
            for (int i = 0; i < 3; i++) {
                System.out.print(".");
                Thread.sleep(550);
                }
            System.out.println(" "+adivinado);
                
                if(num != adivinado){
                    System.out.println("el número adivinado no coincide, le quedan "+cont+" intentos");
                    System.out.println("¿El numero es menor o mayor?");
                    String valor = s.next().toLowerCase();
                    switch (valor){
                        case "mayor":
                                     min = adivinado + 1;
                                     break;
                        case "menor": 
                                     max = adivinado - 1;
                                     break;
                    }      
                }else if(num == adivinado){
                    System.out.println("el programa lo ha adivinado!");
            }
        
        }while(num != adivinado && cont > 0);
    }

}
