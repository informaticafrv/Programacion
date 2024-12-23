/*Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números.*/

package tema6;


public class Ejercicio5 {


    public static void main(String[] args) {
        
        int media = 0;
        int sum = 0;
        int max = 0;
        int min = 199;
        int cont = 0;
        
        
        for (int i = 0; i < 50; i++) {
            int num = (int)((Math.random()*100)+100);
            System.out.print(num+" ");
            cont++;
            sum += num;
                if(num > max){
                max = num;
                    }else if(num <= min){
                    min = num; 
                    }
        }
        media = sum / cont;
        System.out.println();
        System.out.println("la media es: "+media);
        System.out.println("este es el número máximo: "+max);
        System.out.println("este es el número minimo: "+min);
        
    }

}
