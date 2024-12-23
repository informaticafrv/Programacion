
/*Escribe un programa que piense un número al azar entre 0 y 100. El usuario
debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
fallido, el programa dirá cuántas oportunidades quedan y si el número
introducido es menor o mayor que el número secreto.*/
package tema6;

import java.util.Scanner;


public class Ejercicio6 {


    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        int num2 = 0;
        int cont = 5;
        
        int num = (int)(Math.random()*101);
       
        while(cont > 0  && num2 != num){
            System.out.println("Escriba el número que cree que es");
            num2 = s.nextInt();
            cont--;
            
            System.out.println("te quedan: "+cont+" intentos");
            if(num2 > num){
                System.out.println("el número introducido es mayor que el aleatorio");
            }else if(num2 < num){
                System.out.println("el número introducido es menor al aleatorio");
            }else if(num == num2){
                System.out.println("Felicicdades has acertado!");
            }
        }
    }

}
