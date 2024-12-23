
package ensayoBucles;

import java.util.Scanner;


public class figuraEx {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int altura;
        int contador = 0;
        
        do{
            System.out.println("Escriba la altura de la figura: ");
            altura = s.nextInt();
            
            if(altura < 3 || altura % 2 == 0){
                System.out.println("La altura tiene que ser mayor de 2 e inpar");
            }
            
        }while(altura < 3 || altura % 2 == 0);
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if((i == 0) || (j == altura - 1) || (j == i && i < altura) || ( i == altura-1 && (j == altura-2))){
                    System.out.print("*");
                    contador++;
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("El número de asteríscos es "+contador+" y pitados en filas de 10 es: ");
        for (int i = 0; i < contador; i++) {
            for (int j = 0; j < 10; j++) {
                if(contador != 0){
                System.out.print("*");
                contador--;
                }
            }
            System.out.println();
        }
    }

}
