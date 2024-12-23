/*Realiza un programa que vaya generando números aleatorios pares entre 0
y 100 y que no termine de generar números hasta que no saque el 24. El
programa deberá decir al final cuántos números se han generado.*/
package tema6;


public class Ejercicio9 {


    public static void main(String[] args) {
        
        int num;
        int cont = 0;
        
        do{
         num = (int)(Math.random()*101);
            System.out.print(num);
            System.out.print(", ");
            cont++;
        }
        while(num != 24);
        System.out.println();
        System.out.println("La cantidad de números que han salido es: "+cont);
    }

}
