/*Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
es necesario*/
package tema7;


public class Ejercicio10 {


    public static void main(String[] args) {
        
        int aleatorio;
        int[] lista = new int [20];
        int contpares = 0;
        int continpares = 0;
        
        System.out.print("Números aleatorios: ");
        for (int i = 0; i < 20; i++) {
            aleatorio = (int)(Math.random()*101);
            if(aleatorio % 2 == 0){
            contpares++;
            }else{
            continpares++;
            }
            lista[i] = aleatorio;
            System.out.print(aleatorio+", ");
        }
        System.out.println();
        System.out.println("Número de pares: "+contpares);
        System.out.println("Número de inpares: "+continpares);
        
        int[] pares = new int [contpares];
        int[] inpares = new int [continpares];
        
        int indicePares = 0;
        int indiceInpares = 0;
        
        for (int i = 0; i < 20; i++) {
            
            if(lista[i] % 2 == 0){
            pares[indicePares++] = lista[i];
            }else{
            inpares[indiceInpares++] = lista[i];
            }
        }
        for (int i = 0; i < contpares; i++) {
            lista[i] = pares[i];
        }
        for (int i = 0; i < continpares; i++) {
            lista[contpares + i] = inpares[i];
        }
        System.out.print("Número ordenados: ");
        for (int i = 0; i < 20; i++) {
            
            System.out.print(lista[i]+", ");
        }
    }

}
