/*Realiza un generador de melodía con las siguientes condiciones:
a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa,
sol, la y si.
b) Una melodía está formada por un número aleatorio de notas mayor o igual
a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
c) Cada grupo de 4 notas será un compás y estará separado del siguiente
compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
con dos barras.
d) La última nota de la melodía debe coincidir con la primera*/
package tema6;


public class Ejercicio15 {


    public static void main(String[] args) {
        
        int numNotas = (int)(Math.random()*7 + 1) * 4 ;
        System.out.println(numNotas);
        
        for (int i = 0; i < numNotas; i++) {
            
            if(i % 4 == 0){
                System.out.print("|");
            }
            
            int nota = (int)(Math.random()*7)+1;
            
            switch (nota) {
                case 1:
                    System.out.print(" Do ");
                    break;
                case 2: 
                    System.out.print(" Re ");
                    break;
                case 3:
                    System.out.print(" Mi ");
                    break;
                case 4:
                    System.out.print(" Fa ");
                    break;
                case 5:
                    System.out.print(" Sol ");
                    break;
                case 6:
                    System.out.print(" La ");
                    break;
                case 7:
                    System.out.print(" Si ");
                    break;
            }
        }
        System.out.print("||");
        System.out.println();
    }

}
