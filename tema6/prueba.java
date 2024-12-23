

package tema6;
import java.util.Scanner;

public class prueba {


    public static void main(String[] args) {
        
        boolean flag = false;
        
        for (int cont = 0; cont < 10; cont++) {
            int num = (int) (Math.random()*95) + 32;
            System.out.println((char)num +" ");
            
        }
    }

}
/*Thread.sleep(500)*/