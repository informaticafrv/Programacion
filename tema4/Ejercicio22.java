/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
a las 15:00h.*/
package tema4;

import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("introduce el día de la semana en que estamos (de lunes a viernes)");
        String dia = s.nextLine();
        
        System.out.println("introduce la hora");
        int hora = s.nextInt();
        
        System.out.println("introduce los minutos");
        int min = s.nextInt();
        
        if(hora < 0 || hora > 23 || min < 0 || min > 59){
            System.out.println("La hora tiene que estar comprendida entre las 00:00 y las 23:59");
        }else{
            switch (dia) {
                case "Lunes":
                    hora = (((24 * 4) + 15) - hora) * 60;
                    min = hora - min;
                    System.out.println("quedan "+min+" para el fin de semana");
                    break;
                case "Martes":
                    hora = (((24 * 3) + 15) - hora) * 60;
                    min = hora - min;
                    System.out.println("quedan "+min+" para el fin de semana");
                    break;
                case "Miercoles":
                    hora = (((24 *2) + 15) - hora) * 60;
                    min = hora - min;
                    System.out.println("quedan "+min+" para el fin de semana");
                    break;
                case "Jueves":
                    hora = ((24 + 15) - hora) * 60;
                    min = hora - min;
                    System.out.println("quedan "+min+" para el fin de semana");
                    break;
                case "Viernes":
                    if( hora <= 15){
                    hora = (15 - hora) * 60;
                    min = hora - min;
                    System.out.println("quedan "+min+" para el fin de semana");
                    }else{
                        System.out.println("El finde semana ya ha empezado");
                    }
                    break;
            }
        }
    }
    
}
