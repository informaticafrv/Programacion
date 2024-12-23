/*Realiza un simulador de máquina tragaperras simplificada que cumpla los
siguientes requisitos:
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
figuras posibles: corazón, diamante, herradura, campana y limón.
b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento,
ha perdido”.
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
ha recuperado su moneda”.
d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
10 monedas”.
 */
package tema6;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);

        int monedero = 10;
        int figura;
        boolean salir = false;
        int resultado1 = 0;
        int resultado2 = 0;
        int resultado3 = 0;

        while (salir == false && monedero > 0) {

            for (int i = 0; i < 3; i++) {

                figura = (int) (Math.random() * 5) + 1;

                System.out.print("La figura es");
                for (int j = 0; j < 3; j++) {
                    System.out.print(".");
                    Thread.sleep(550);
                }

                if (i == 0) {
                    resultado1 = figura;
                } else if (i == 1) {
                    resultado2 = figura;
                } else if (i == 2) {
                    resultado3 = figura;
                }

                if (figura == 1) {
                    System.out.println(" Corazón");
                } else if (figura == 2) {
                    System.out.println(" Diamante");
                } else if (figura == 3) {
                    System.out.println(" Herradura");
                } else if (figura == 4) {
                    System.out.println(" Campana");
                } else {
                    System.out.println(" Limón");
                }
            }
            if (resultado1 != resultado2 && resultado1 != resultado3) {
                System.out.println("Lo siento, ha perdido");
                monedero--;
            } else if (resultado1 == resultado2 && resultado1 == resultado3) {
                System.out.println("Enhorabuena, ha ganado 10 monedas");
                monedero = monedero + 10;
            } else {
                System.out.println("Bien, ha recuperado su moneda");
            }
            if (monedero > 0) {
                System.out.println("En su monedero quedan: " + monedero + "€");
                System.out.println("Quiere seguir jugando? 1.Si 2.No");
                int respuesta = s.nextInt();

                if (respuesta == 1) {
                    System.out.println("vale");
                    salir = false;
                }else{

                    System.out.println("Adiós");
                    salir = true;
                }
            }else{
                System.out.println("Lo siento, no le quedan monedas");
            }

        }
    }

}
