
package ensayoBucles;

import java.util.Scanner;


public class calculadoraEx {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int num1;
        int num2;
        int cociente = 0;
        int resultado = 0;
        boolean salir = false;
        
        System.out.println("Escriba su nombre: ");
       String usuario =  s.nextLine();
       
        System.out.println("Bienvenido "+usuario+"!");
        
        do{
        System.out.println("Que operación quiere hacer? ");
        System.out.println("1.División / 2.Multiplicación / 3.Salir");
        int operacion = s.nextInt();
        switch(operacion){
            
            case 1:
                do{
                System.out.println("Escriba el número que quiere dividir");
                num1 = s.nextInt();
                System.out.println("Escriba el número por el que quiere dividirlo");
                num2 = s.nextInt();
                if(num1 <= -15 || num2 <= -15){
                    System.out.println("los números no pueden ser menores a -14, vuelva a escribirlo");
                }
                if(num2 == 0){
                    System.out.println("El divisor no puede ser dividido entre 0");
                }
                }
                while( num1 <= -15 || num2 <= -15 || num2 == 0);
               while(num1 >= num2){
                   num1-=num2;
                   cociente++;
               }
                System.out.println("El resto es: "+num1);
                System.out.println("El resutlado es: "+cociente);
                break;
                
            case 2: 
                do{
                    System.out.println("Escriba el primer factor: ");
                    num1 = s.nextInt();
                    System.out.println("Escriba el segundo factor: ");
                    num2 = s.nextInt();
                    if(num1 <= -15 || num2 <= -15){
                        System.out.println("Los factores no pueden ser menores a -14, escriba de nuevo los factores");
                    }
                }
                while(num1 <= -15 || num2 <= -15);
                for (int i = 0; i < num2; i++) {
                    resultado += num1;
                }
                System.out.println("El resultado es: "+resultado);
                break;
            case 3:
                salir = true;
                break;
        }
        }
        while(salir == false);
    }
}

