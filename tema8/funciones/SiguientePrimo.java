/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8.funciones;

/**
 *
 * @author Lobo
 */
public class SiguientePrimo {
    public static int SigPrimo (int num){
        
        boolean encontrado = false;
        int SigPrimo = num +1;
        
        while(!encontrado){
            boolean EsPrimo = true;
            SigPrimo++;
            for (int i = 2; i < Math.sqrt(SigPrimo)&& !EsPrimo; i++) {
                if(SigPrimo % i == 0){
                EsPrimo = false;
                }
            }
            encontrado = true;
            System.out.print("El siguiente número primo es: ");
        }
      return SigPrimo;
    }
}
