

package tema7;


public class Ejercicio1 {


    public static void main(String[] args) {
        
    int[] num = new int[12];
            num[0] = 39;
            num[1] = -1;
            num[4] = 0;
            num[6] = 14;
            num[8] = 5;
            num[9] = 120;
            
            for (int i = 0; i < 12; i++) {
                System.out.println();
                System.out.print(i+" ->");
                
                for (int j = 0; j < 1; j++) {
                    
                    System.out.print(" "+num[i]+" ");
                }
        }
            System.out.println();
    }

}
