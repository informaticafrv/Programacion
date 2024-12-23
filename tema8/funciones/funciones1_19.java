/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8.funciones;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class funciones1_19 {
    Scanner s = new Scanner(System.in);
    public static boolean EsCapicua (int num){
        int original = num;
        int invertido = 0;
        
        while(num > 0){
        int digito = num % 10;
        invertido = invertido * 10 +digito;
        num /= 10;
        }
        if(original == invertido){
            System.out.println("el número "+original+" es capicúa");
            return true;
        }else{
            System.out.println("el número "+original+" no es capicúa");
            return false;
        }
    }
    public static int digitos(int num) {
        boolean encontrado = false;
        int digitos = 0;

        while (!encontrado) {
            num = num / 10;
            digitos++;
            if (num == 0) {
                encontrado = true;
            }
        }
        System.out.println("El número de dígitos es: ");
        return digitos;
    }
    public static String EsPrimo(int num) {

        boolean EsPrimo = true;
        
        if (num <= 1) {
            EsPrimo = false;
        } else {
            for (int cont = 2; cont <= Math.sqrt(num); cont++) {
                if (num % cont == 0){
                    EsPrimo = false;
                    break;
                }
            }
        }
        if (EsPrimo) {
            return "Es primo";
        } else {
            return "No es primo";
        }
    }
    public static int SigPrimo (int num){
       
        boolean bandera = true;
        int SigPrimo = num;

        while (num <= SigPrimo && bandera) {
           
            SigPrimo=SigPrimo+1;
            int div=0;
            for (int i = 1; i <= SigPrimo; i++) {
                if (SigPrimo % i == 0) {
                    div += 1;
                }
            }

            if (div == 2) {
                bandera=false;

            }
        }
        System.out.print("El siguiente primo es: ");
        return SigPrimo;  
    }
    public static int potencia (int num){
        Scanner s = new Scanner (System.in);
        int potencia = num;
        
        System.out.println("Escriba el exponenete: ");
        int exponente = s.nextInt();
        
        for (int i = 0; i < exponente; i++) {
            potencia = num;
            for (int j = 0; j < i; j++) {
             potencia *= num;
            }
             System.out.println(num+"^"+(i+1)+" = "+potencia);
        }
        System.out.print("La potencia es: ");
        return potencia;
    }
    public static int reves (int num){
        int reves = 0;
    while(num > 0){
        int digito = num % 10;
        reves = reves * 10 +digito;
        num /= 10;
        }
        System.out.print("El número invertido es: ");
                return reves;
    }
    public static int DigitoN (int num){
    Scanner s = new Scanner (System.in);
    
        System.out.println("escribe la posición del número: ");
        int posicion = s.nextInt();
        
        int contador = 0;
        while(num > 0){
        
            int ultimoDigito = num % 10;
            
            if(contador == posicion){
                System.out.print("El número es: ");
                return ultimoDigito;
            }
            num /= 10;
            contador++;
        }
        System.out.println("El digito no está en el número");
        return -1;
    }
    public static int Posiciondigito (int num){
        Scanner s = new Scanner (System.in);
        
        System.out.println("de que dígito quieres saber la posición?");
        int digito = s.nextInt();
        
    num = Math.abs(num);
    int Posiciondigito;
    int contador = 1;
    while(num > 0){
        
        int ultimoDigito = num % 10;
        
        if(ultimoDigito == digito){
            System.out.print("Está en la posición: ");
        return contador;
        
        }
        num /= 10;
        contador++;
    }
    return -1;
    
    }
    public static int quitadoDetras (int num){
    Scanner s = new Scanner(System.in);
        System.out.println("cuántos números quieres quitarle?");
        int quitar = s.nextInt();
        int quitadoDetras;
        for (int i = 0; i < quitar; i++) {
            quitadoDetras = num / 10;
            if(i == quitar){
            return quitadoDetras;
            }
        }
        System.out.println("no se han podido quitar tantos números");
                return -1;
    }
    public static int quitadoDelante (int num){
    Scanner s = new Scanner(System.in);
        System.out.println("cuántos números quieres quitarle?");
        int quitar = s.nextInt();
        int quitadoDelante;
        int TotalDigitos = digitos(num);
        System.out.println(TotalDigitos);
        for (int i = 0; i < quitar; i++) {
            quitadoDelante = num % (int) Math.pow(10, TotalDigitos - quitar);
            return quitadoDelante;
            
        }
        System.out.println("no se han podido quitar tantos números");
                return -1;
    }
    public static int PegadoDetras (int num){
        Scanner s = new Scanner (System.in);
        System.out.println("Introduce el número que quieres pegar: ");
        int Pegado = s.nextInt();
        if(Pegado > 9 || Pegado < 0){
            System.out.println("El número tiene que ser de un dígito y positivo");
            return -1;
        }else{
        int num1 = 0;
        
        for (int i = 0; i < digitos(num); i++){
              num1 = num * 10;
        }

        int total = num1 + Pegado;
            System.out.println("El resultado final es: ");
        return total;
        }
    }
    public static int PegadoDelante(int num){
    Scanner s = new Scanner (System.in);
        System.out.println("Introduce el número que quieres pegar: ");
        int Pegado = s.nextInt();
        if(Pegado > 9 || Pegado < 0){
            System.out.println("El número tiene que ser de un dígito y positivo");
            return -1;
        }else{
            for (int i = 0; i < digitos(num); i++) {
                Pegado *= 10;
            }
            int resultado = Pegado + num;
            System.out.println("El resultado es: ");
            return resultado;
        }
    }
    public static int JuntaNumeros(int num){
    Scanner s = new Scanner (System.in);
    
        System.out.println("Introduce el número que quieres pegar: ");
        int Pegado = s.nextInt();
        
        for (int i = 0; i < digitos(Pegado); i++) {
            num *= 10;
        }
        int resultado = num + Pegado;
        System.out.println("El resultado es: ");
        return resultado;
    }
}
