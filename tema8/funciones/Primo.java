/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8.funciones;

/**
 *
 * @author franc
 */
public class Primo {

    public static String EsPrimo(int num) {

        boolean EsPrimo = true;
        
        if (num <= 1) {
            EsPrimo = false;
        } else {
            for (int cont = 2; cont <= Math.sqrt(num); cont++) {
                if (num % cont == 0){
                    EsPrimo = false;
                    break;
                }
            }
        }
        if (EsPrimo) {
            return "Es primo";
        } else {
            return "No es primo";
        }
    }
}
