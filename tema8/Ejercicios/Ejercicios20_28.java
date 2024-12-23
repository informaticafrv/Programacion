
package tema8.Ejercicios;

import java.util.Scanner;
import tema8.funciones.funciones20_28;


public class Ejercicios20_28 {


    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        boolean salir = false;
        
        do{
            System.out.println("Escriba el tamaño de array: ");
            int t = s.nextInt();
            int[] listaPrincipal = new int[t];
            System.out.println("Escriba el mínimo del array: ");
            int min = s.nextInt();
            System.out.println("Escriba el máximo del array: ");
            int max = s.nextInt();
            for (int i = 0; i < listaPrincipal.length; i++) {
                listaPrincipal[i] = (int)((Math.random()*max)+min);
            }
            for (int i = 0; i < listaPrincipal.length; i++) {
                System.out.println(i+" -> "+listaPrincipal[i]);
            }
            
            System.out.println("0 -> Salir");
            System.out.println("1 -> Generar un array entre un min y un max");
            System.out.println("2 -> mínimo");
            System.out.println("3 -> máximo");
            System.out.println("4 -> media");
            System.out.println("5 -> comprobacion");
            System.out.println("6 -> posición");
            System.out.println("7 -> revés");
            System.out.println("8 -> rotar a la derecha");
            
            System.out.println("Elija una opción: ");
            int op = s.nextInt();
            
            switch (op){
                case 0:
                    salir = true;
                    break;
                case 1:
                    funciones20_28.Array();
                    break;
                case 2:
                    System.out.println(funciones20_28.minimo(listaPrincipal, max));
                    break;
                case 3:
                    System.out.println(funciones20_28.maximo(listaPrincipal, min));
                    break;
                case 4:
                    System.out.println(funciones20_28.media(listaPrincipal));
                    break;
                case 5:
                    System.out.println(funciones20_28.estaEnArray(listaPrincipal));
                    break;
                case 6:
                    System.out.println(funciones20_28.posicion(listaPrincipal));
                    break;
                case 7:
                    funciones20_28.listaReves(listaPrincipal, t);
                    break;
                case 8:
                    funciones20_28.listarotaderecha(listaPrincipal, t);
                    break;
                case 9:
                    System.out.println();
                    break;
            }
        }while(salir = true);
    }

}
