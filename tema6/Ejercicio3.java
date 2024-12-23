/*Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.*/

package tema6;


public class Ejercicio3 {


    public static void main(String[] args) {

        int valor = (int)(Math.random()*10)+1;
        /*System.out.println(valor);*/
        int palo = (int) (Math.random()*3);
        
        if(valor >= 2 && valor <= 7){
            System.out.print(valor);
        }else if(valor == 8){
            System.out.print("Sota");
        }else if(valor == 9){
            System.out.print("Caballo");
        }else if(valor == 10){
            System.out.print("Rey");
        }else if(valor == 1){
            System.out.print("As");
        }
        
        if(palo == 0){
            System.out.println(" de Copas");
        }else if(palo == 1){
            System.out.println(" de Oros");
        }else if(palo == 2){
            System.out.println(" de Palos");
        }else if(palo == 3){
            System.out.println(" de Espadas");
        }
        
    }

}
