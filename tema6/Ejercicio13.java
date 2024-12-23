/*Escribe un programa que simule la tirada de dos dados. El programa deberá
continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
dados tengan el mismo valor.*/


package tema6;


public class Ejercicio13 {


    public static void main(String[] args) {
        int dado1;
        int dado2;

        do{
             dado1 = (int)(Math.random()*6)+1;
            System.out.println("El primer dado ha sado: "+dado1);
             dado2 = (int)((Math.random()*6)+1);
            System.out.println("El segundo dado ha sacado: "+dado2);
        }while(dado1 != dado2);
        
        System.out.println("Los dados han dado el mismo resultado.");
        
    }

}
