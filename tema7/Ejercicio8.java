/*Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter.*/

package tema7;

import java.util.Scanner;


public class Ejercicio8 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String[] meses = new String[12];
        int[] lista = new int[12];
        int max = 0;
        
        meses[0] = "Enero";
        meses[1] = "Febrero";
        meses[2] = "Marzo";
        meses[3] = "Abril";
        meses[4] = "Mayo";
        meses[5] = "Junio";
        meses[6] = "Julio";
        meses[7] = "Agosto";
        meses[8] = "Septiembre";
        meses[9] = "Octubre";
        meses[10] = "Noviembre";
        meses[11] = "Diciembre";
        
        System.out.println("Escriba la temperatura media de cada mes ");
        
        for (int i = 0; i < 12; i++) {
            System.out.print(meses[i]+": ");
            lista[i] = s.nextInt();
                if(lista[i] > max){
                    max = lista[i];
                }
        }
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < max; j++) {
                if(j < lista[i]){
                System.out.print("*");
            }else{
                    System.out.print(" ");
            }
        }
            System.out.print(meses[i]);
         System.out.println();
    }

}
}
