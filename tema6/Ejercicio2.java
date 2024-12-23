/*Realiza un programa que muestre al azar el nombre de una carta de la
baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
sería el 1). Para convertir un número en una cadena de caracteres podemos
usar String.valueOf(n).*/

package tema6;


public class Ejercicio2 {


    public static void main(String[] args) {
        
        int valor = (int)(Math.random()*13)+2;
        /*System.out.println(valor);*/
        int palo = (int) (Math.random()*3);
        
        if(valor >= 2 && valor <= 10){
            System.out.print(valor);
        }else if(valor == 11){
            System.out.print("J");
        }else if(valor == 12){
            System.out.print("Q");
        }else if(valor == 13){
            System.out.print("K");
        }else if(valor == 14){
            System.out.print("A");
        }
        
        if(palo == 0){
            System.out.print(" de Diamantes");
        }else if(palo == 1){
            System.out.print(" de Tréboles");
        }else if(palo == 2){
            System.out.print(" de Corazones");
        }else if(palo == 3){
            System.out.print(" de Picas");
        }
        
    }

}
