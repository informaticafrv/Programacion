
/*Modifica el programa anterior para que la probabilidad de que salga un 1 sea
de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.*/
package tema6;


public class Ejercicio8 {


    public static void main(String[] args) {
        
        System.out.println("Quiniela: ");
        
        for (int i = 1; i < 15; i++) {
            System.out.print("Partido "+i+": ");
            for (int j = 0; j < 3; j++) {
                int num = (int)(Math.random()*6);
                System.out.print(num);
                if(num < 2){
                    System.out.print(" 1 ");
                }else if(num < 5){
                    System.out.print(" X ");
                }else{
                    System.out.print(" 2 ");
                }
                
            }
           System.out.println();
           
        }
        int num2 = (int)(Math.random()*3);
        if(num2 == 0){
            System.out.println("pleno : X");
        }else if(num2 == 1){
            System.out.println("pleno: 1");
        }else if(num2 == 2){
            System.out.println("pleno: 2");
        }
        
    }

}
