/*Modifica el programa anterior de tal forma
que no se repita ningún número en el array.*/
package tem7b;


public class Ejercicio6 {


    public static void main(String[] args) {
        int[][] tabla = new int [6][10];
        int aleatorio;
        int max = -1;
        int min = 1002;
        boolean repetido = false;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                do{
                aleatorio = (int)(Math.random()*1001);
                
                tabla[i][j] = aleatorio;
                    for (int k = 0; k < 6; k++) {
                        for (int l = 0; l < 10; l++) {
                             if(tabla[k][l] == aleatorio){
                             repetido = true;
                             }  
                            }
                    }
                }while(!repetido);
                
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
                    System.out.print("|"+tabla[i][j]+" max|\t");
                }else if(tabla[i][j] == min){
                    System.out.print("|"+tabla[i][j]+" min|\t");
                }else{
                    System.out.print("|"+tabla[i][j]+"|\t");
                }
            }
            System.out.println();
        }
        System.out.println("Máximo: "+max);
        System.out.println("Mínimo: "+min);
    }

}
