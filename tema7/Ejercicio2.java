

package tema7;


public class Ejercicio2 {


    public static void main(String[] args) {
        
        char[] caracter = new char[10];
        caracter[0] = 'a';
        caracter[1] = 'x';
        caracter[4] = '@';
        caracter[6] = ' ';
        caracter[7] = '+';
        caracter[8] = 'Q';
        
        for (int i = 0; i < 10; i++) {
            System.out.println();
            System.out.print(i+"-> ");
            for (int j = 0; j < 1; j++) {
                System.out.print(" "+caracter[i]);
            }
        }
        System.out.println();
        
    }

}
