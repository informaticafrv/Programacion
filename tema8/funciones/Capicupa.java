/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8.funciones;

/**
 *
 * @author franc
 */
public class Capicupa {
    public static boolean EsCapicua (int num){
        int original = num;
        int invertido = 0;
        
        while(num > 0){
        int digito = num % 10;
        invertido = invertido * 10 +digito;
        num /= 10;
        }
        if(original == invertido){
            System.out.println("el número "+original+" es capicúa");
            return true;
        }else{
            System.out.println("el número "+original+" no es capicúa");
            return false;
        }
    }
}
