
package simulacroArrays;

import java.util.Scanner;


public class Ejercicio1 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double acumulador = 0;
        double media = 0;
        int numPersonas;
        double min = 199.99;
        double max = 0.00;
        int contadorMin = 0;
        int contadorMax = 0;
        int contadorME = 0;
        int contadorMM = 0;
        int contadorMR = 0;
        
        System.out.println("Cuantas personas son?");
        do{
            numPersonas = s.nextInt();
            if(numPersonas < 1){
            
            }
        }while(numPersonas < 1);
        
        double[] alturas = new double [numPersonas];
        
        for (int i = 0; i < alturas.length; i++) {
            System.out.println("Que altura tiene la "+(i+1)+"º persona?");
            do{alturas[i] = s.nextDouble();
            if(alturas[i] < 100 || alturas [i] > 250){
                System.out.println("la altura tiene que ser entre 100 y 250");
            }
            }while(alturas[i] < 100 || alturas [i] > 250);
            acumulador += alturas[i];
            }
        media = acumulador / numPersonas;
        
        System.out.println("El número de personas es: "+numPersonas);
        
        for (int i = 0; i < alturas.length; i++) {
            System.out.println((i+1)+"º Persona: "+alturas[i]);
            
            if(alturas[i] < min){
            min = alturas[i];
            contadorMin++;
            }
            if(alturas[i] > max){
            max = alturas[i];
            contadorMax++;
            }
            if(alturas[i] > media){
            contadorME++;
            }
            if(alturas[i] < media){
            contadorMM++;
            }
            if(alturas[i] == media){
            contadorMR++;
            }
            
        }
        System.out.println("Personas por encima de la media: "+contadorME);
        System.out.println("Personas por debajo de la media: "+contadorMM);
        System.out.println("Personas iguales a la media: "+contadorMR);
        System.out.println("Persona más alta: "+max);
        System.out.println("Persona más baja: "+min);
        System.out.println("La media de altura es: "+media+" cms");
    }

}
