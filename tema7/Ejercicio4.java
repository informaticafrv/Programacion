

package tema7;


public class Ejercicio4 {


    public static void main(String[] args) {
        
        int[] num = new int[21];
        int[] cuadrado = new int[21];
        int[] cubo = new int[21];
        
        for (int i = 0; i < 20; i++) {
            int aleatorio = (int)(Math.random()*100);
            num[i] = aleatorio;
            cuadrado[i] = num[i] * num[i];
            cubo[i] = num[i] * num[i] * num[i]; 
        }
        for (int i = 0; i < 20; i++) {
            System.out.println();
            System.out.print(i+"º -> ");
            for (int j = 0; j < 1; j++) {
                System.out.print(num[i]+" -> "+cuadrado[i]+" -> "+cubo[i]);
            }
        }
        System.out.println();
        
    }

}
