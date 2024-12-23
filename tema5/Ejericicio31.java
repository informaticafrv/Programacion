

package tema5;
import java.util.Scanner;

public class Ejericicio31 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("escriba la altura de la L: ");
        int altura = s.nextInt();
        
        for (int i = 1; i <= altura; i++) {
            for (int j = 0; j <= altura; j++) {
                if(j == 0){
                    System.out.print("*");
                }else if (i == altura){
                    System.out.print("*");
                }
                }
            System.out.println();
                }
            
        }
    }
