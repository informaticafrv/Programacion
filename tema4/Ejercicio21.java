/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*Calcula la nota de un trimestre de la asignatura Programación. El programa
pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
Si la media de los dos controles da un número mayor o igual a 5, el alumno
está aprobado y se mostrará la media. En caso de que la media sea un número
menor que 5, el alumno habrá tenido que hacer el examen de recuperación
que se califica como apto o no apto, por tanto se debe preguntar al usuario
¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el
resultado de la recuperación es apto, la nota será un 5; en caso contrario, se
mantiene la nota media anterior*/
package tema4;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.println("Introduzca la nota de su primer exámen: ");
        int nota1 = s.nextInt();
        
        System.out.println("Introduzca la nota de sus segundo exámen: ");
        int nota2 = s.nextInt();
        int media = (nota1 + nota2) / 2;
        
        if(media >= 5){
            System.out.println("tu nota media en programación es "+media+", estás aprobado");
            }else if(media < 5){
                s.nextLine();
                System.out.println("tu media es menor a 5, ¿en la recuperación has sacado apt o no apto?");
                String  recu = s.nextLine();
                if(recu.equals("apto")){
                    System.out.println("tu nota media en programación es un 5, estás aprobado");
                    }else if(recu.equals("no apto")){
                        System.out.println("tu nota media en programación es un "+media+", estás suspenso");
                    }
        }
    }
}

