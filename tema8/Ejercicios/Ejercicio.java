

package tema8.Ejercicios;
import java.util.Scanner;
import tema8.funciones.funciones1_19;

public class Ejercicio {


    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        boolean salir = false;
        
        do{
        System.out.println("Escriba un número: ");
        int num = s.nextInt();
        
        System.out.println("Que quiere hacer?");
        System.out.println(" 0 -> Salir");
        System.out.println(" 1 -> comprobar capicua");
        System.out.println(" 2 -> comprobar primo");
        System.out.println(" 3 -> comrpobar el siguiente primo");
        System.out.println(" 4 -> comprobar la pontecia");
        System.out.println(" 5 -> comprobar digitos");
        System.out.println(" 6 -> darle la vuelta");
        System.out.println(" 7 -> saber la posicion de un digito");
        System.out.println(" 8 -> Deducir la posición de un dígito");    
        System.out.println(" 9 -> Quitar un número por detrás");
        System.out.println("10 -> Quitar un número por delante");
        System.out.println("11 -> Pegar un dígito por detrás");
        System.out.println("12 -> Pegar un dígito por delante");
        System.out.println("13 ->");
        System.out.println("14 -> Juntar dos números");
        System.out.println("Elija una opción: ");
        int opc = s.nextInt();
        
        switch (opc) {
            case 0: 
                salir = true;
                break;
            case 1:
                System.out.println(funciones1_19.EsCapicua(num));
                break;
            case 2:
                System.out.println(funciones1_19.EsPrimo(num));
                break;
            case 3:
                System.out.println(funciones1_19.SigPrimo(num));
                break;
            case 4:
                System.out.println(funciones1_19.potencia(num));
                break;
            case 5:
                System.out.println(funciones1_19.digitos(num));
                break;
            case 6:
                System.out.println(funciones1_19.reves(num));
                break;
            case 7:
                System.out.println(funciones1_19.DigitoN(num));
                break;
            case 8:
                System.out.println(funciones1_19.Posiciondigito(num));
                break;
            case 9:
                System.out.println(funciones1_19.quitadoDetras(num));
                break;
            case 10:
                System.out.println(funciones1_19.quitadoDelante(num));
                break;
            case 11:
                System.out.println(funciones1_19.PegadoDetras(num));
                break;
            case 12:
                System.out.println(funciones1_19.PegadoDelante(num));
                break;
            case 14: 
                System.out.println(funciones1_19.JuntaNumeros(num));
                break;
        }
        }while(!salir);
        
    }

}
