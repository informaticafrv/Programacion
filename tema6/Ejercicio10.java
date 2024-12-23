/*Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
El carácter con el que se pinta cada línea se elige de forma aleatoria
entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
aleatoria entre 1 y 40 caracteres.*/
package tema6;


public class Ejercicio10 {


    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            
            int longitud = (int)((Math.random()*39)+1);
            /*System.out.println(longitud);*/
            int caracter = (int)(Math.random()*5);
            for (int j = 1; j <= longitud ; j++) {
                
                
                if(caracter == 0){
                    System.out.print("*, ");
                }else if(caracter == 1){
                    System.out.print("-, ");
                }else if(caracter == 2){
                    System.out.print("=, ");
                }else if(caracter == 3){
                    System.out.print("., ");
                }else if(caracter == 4){
                    System.out.print("|, ");
                }else if(caracter == 5){
                    System.out.print("@, ");
                }
            }
            System.out.println();
            
        }
        
    }

}
