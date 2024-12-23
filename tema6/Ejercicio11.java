/*Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc.*/
package tema6;


public class Ejercicio11 {


    public static void main(String[] args) {
        
        int suspensos = 0;
        int suficientes = 0;
        int bienes = 0;
        int notables = 0;
        int sobresalientes = 0;
        
        for (int i = 1; i < 21; i++) {
            
            int num = (int)(Math.random()*11);
            System.out.print(i+"º Nota: ");
            
            if(num <= 4){
                
                System.out.print("Suspenso");
                suspensos++;
                
            }else if( num == 5){
                
                System.out.print("Suficiente");
                suficientes++;
                
            }else if(num >= 6 && num <=7 ){
                
                System.out.print("Bien");
                bienes++;
                
            }else if(num >= 8 && num <= 9){
                
                System.out.print("Notable");
                notables++;
                
            }else if(num == 10){
                System.out.print("Sobresaliente");
                sobresalientes++;
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Nº de suspensos: "+suspensos);
        System.out.println("Nº de suficientes: "+suficientes);
        System.out.println("Nº de notables: "+notables);
        System.out.println("Nº de bienes: "+bienes);
        System.out.println("Nº de sobresalientes: "+sobresalientes);
        
    }

}
