
package tema5;

import java.util.Scanner;
public class LeraE {


    public static void main(String[] args) {
        Scanner s=new  Scanner(System.in);
        
        int altura;
        do{
            System.out.println("introduzca la altura");
            altura = s.nextInt();
        }while(altura % 2 == 0);
        for(int i = 0; i < altura;  i++){
            for(int j = 0; j < altura; j++){
            if (i == 0 || i == altura - 1){
                System.out.print("*");
            }else{
                System.out.print("");
            }
            if(j==0){
                System.out.print("*");
            }
            if(i==altura / 2 && j < altura / 2){
                System.out.print("*");
            }
            }
            System.out.println("");
        }
    }
    }


