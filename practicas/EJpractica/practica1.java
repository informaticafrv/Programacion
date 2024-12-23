
package practicas.EJpractica;
import java.util.Scanner;
import practicas.FuncionesPractica.Funciones;
public class practica1 {


    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
       /* boolean salir = false;
        
        System.out.println("Escriba un dígito");
        int num = s.nextInt();
        do{
        System.out.println("Elija una opción: ");
        System.out.println("0 -> Salir");
            System.out.println("1 -> Capicua");
            System.out.println("6 -> voltea");
            
            int op = s.nextInt();
            switch (op) {
                case 0:
                    salir = true;
                    break;
                case 1:
                    break;
                case 6:
                    break;
                case 4:
                    System.out.println(Funciones.potencia(num));
                    break;
            }
        }while(salir == true);*/
        /*String[] dani = new String [10];
        System.out.println("Escriba una palabra: ");
        
        for (int i = 0; i < dani.length; i++) {
            dani[i] = s.nextLine();
        }
        for (int i = 0; i < dani.length; i++) {
            if(i < dani.length-1){
                System.out.print(dani[i]+", ");
            }else{
                System.out.println(dani[i]+".");
            }
            }*/
        int num[] = new int [12];
        
        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;
        
        for (int i = 0; i < num.length; i++) {
            System.out.println(i+" -> "+num[i]);
        }
                
        }
        
        
    }


