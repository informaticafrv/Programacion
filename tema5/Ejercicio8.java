/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*Muestra la tabla de multiplicar de un número introducido por teclado.*/
package tema5;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.println("introduzca un número: ");
        int num = s.nextInt();
        
        for (int i = 0; i < 11; i++) {
            System.out.println(num+" x "+i+" = "+num*i);
        }
    }
    
}
