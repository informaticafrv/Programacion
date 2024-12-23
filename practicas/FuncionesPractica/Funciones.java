/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas.FuncionesPractica;

import java.util.Scanner;

/**
 *
 * @author Lobo
 */
public class Funciones {
    public static int potencia (int num){
    Scanner s = new Scanner(System.in);
    int potencia = 0;
        System.out.println("Escriba el exponente: ");
        int exponente = s.nextInt();
        
        for (int i = 0; i < exponente; i++){
            potencia = num * num;
            System.out.println(num+"^"+(i+1)+" = "+potencia);
        }
        System.out.println("El resultado es: ");
        return potencia;
    }
}
