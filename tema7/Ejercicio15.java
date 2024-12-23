/*Un restaurante nos ha encargado una aplicación para colocar a los clientes en
sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
(mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
el programa no está preparado para colocar a grupos mayores a 4, por tanto,
si un cliente dice por ejemplo que son un grupo de 6, el programa dará el
mensaje “Lo siento, no admitimos grupos de 6, haga grupos de 4
personas como máximo e intente de nuevo”. Para el grupo que llega,
se busca siempre la primera mesa libre (con 0 personas). Si no quedan mesas
libres, se busca donde haya un hueco para todo el grupo, por ejemplo si el
grupo es de dos personas, se podrá colocar donde haya una o dos personas.
Inicialmente, las mesas se cargan con valores aleatorios entre 0 y 4. Cada
vez que se sientan nuevos clientes se debe mostrar el estado de las mesas.
Los grupos no se pueden romper aunque haya huecos sueltos suficientes. El
funcionamiento del programa se ilustra a continuación:
*/
package tema7;

import java.util.Scanner;


public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        int[] mesas = new int[10];
        boolean salir = false;
        boolean encontrado = false;
        int comensales;
        
        for (int i = 0; i < 10; i++) {
            int aleatorio = (int)(Math.random()*5);
            mesas[i] = aleatorio;
        }
        do{
            System.out.println("Estas son las mesas y sillas disponibles");
            System.out.println("Nº mesa 1 2 3 4 5 6 7 8 9 10");
            System.out.print("Nº silla ");
            for (int i = 0; i < 10; i++){
                System.out.print(mesas[i]+" ");
            }
            System.out.println();
                do{
                    System.out.println("Cuantos comensales van a ser? (-1 para salir)");
                    comensales = s.nextInt();
                    if(comensales == -1){
                    salir = true;
                    }else if(comensales < 1 || comensales > 4){
                        System.out.println("Los comensales tienen que ser entre 1 y 4");
                    }
                }while(!salir && (comensales < 1 || comensales > 4));
                System.out.println("salir = "+salir);
                System.out.println("coemsales = "+comensales);
                if(!salir){
                encontrado = false;
                for (int i = 0; i < 10 && !encontrado; i++) {
                    if(mesas[i] == 0){
                    mesas[i] += comensales;
                    encontrado = true;
                    }
                }
                if(!encontrado){
                for (int i = 0; i < 10 && !encontrado; i++) {
                    if(mesas[i] + comensales <= 4){
                    mesas[i] += comensales;
                    encontrado = true;
                    }
                }
                }
                if(!encontrado){
                    System.out.println("Lo siento, no hay sitio para un grupo tan grande");
                }
            }
        }while(!salir);
    }

}
