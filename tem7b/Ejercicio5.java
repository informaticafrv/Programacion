/*Realiza un programa que rellene un array de 6 filas por 10 columnas con
números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
A continuación, el programa deberá dar la posición tanto del máximo como
del mínimo.*/
package tem7b;


public class Ejercicio5 {


    public static void main(String[] args) {
        
        int[][] tabla = new int [6][10];
        int aleatorio;
        int max = 0;
        int min = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                aleatorio = (int)(Math.random()*1001);
                if(i == 0 && j == 0){
                max = aleatorio;
                min = aleatorio;
                }
                tabla[i][j] = aleatorio;
                
                if(tabla[i][j] > max){
                max = tabla[i][j];
                }else if(tabla[i][j] < min){
                min = tabla[i][j];
                }
                
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                if(tabla[i][j] == max){
                    System.out.print(tabla[i][j]+" max|");
                }else if(tabla[i][j] == min){
                    System.out.print(tabla[i][j]+" min|");
                }else{
                    System.out.print(tabla[i][j]+"|");
                }
            }
            System.out.println();
        }
        
    }

}
