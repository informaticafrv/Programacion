
package proyecto;
import proyecto.MetodosProyecto;
import java.util.Scanner;


public class Proyecto {


    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner (System.in);
        
        //bandera para salir
        boolean salir = false;
        
        //variable para ingresar opción al menú
        int opc = 0;
        
        //Arrays donde se definen las estadisticas de los Pokemons
        int[] Pikachu = new int[3];
        Pikachu[0] = 60; //Ataque
        Pikachu[1] = 40; //Defensa
        Pikachu[2] = 70; //Vida
        
        int[] Charmander = new int[3];
                
        Charmander[0] = 70;
        Charmander[1] = 30;
        Charmander[2] = 50;
        
        int[] Squirtle = new int[3];
        Squirtle[0] = 30;
        Squirtle[1] = 70;
        Squirtle[2] = 80;
        
        int[] Bulvasaur = new int [3];
        Bulvasaur[0] = 50;
        Bulvasaur[1] = 50;
        Bulvasaur[2] = 60;
        //Menú principal
        do{
            System.out.println(" --------------------------------------------------------- ");
            System.out.println(" ------ Bienvenido al simulador de combates Pokémon ------ ");
            System.out.println(" --------------------------------------------------------- ");
            System.out.println(" |                       Menú                             |");
            System.out.println(" |               1º Opción: Descripción de Pokémons       |");
            System.out.println(" |               2º Opción: Probar el combate             |");
            System.out.println(" |               3º Opción: Salir                         |");
            System.out.println(" --------------------------------------------------------- ");
            System.out.println("Elija una Opción: ");
            // do while por si se introduce un número incorrecto
            do{
                
            opc = s.nextInt();
            
            if(opc < 1 || opc > 3){
                System.out.println("Las opciones son del 1 al 4, por favor vuelva a elegir: ");
            }
            
            }while(opc < 1 || opc > 3);
            //switch que lleva a los métodos
            switch (opc) {
                    case 1:
                        MetodosProyecto.MenuEstadisticas(Pikachu, Charmander, Squirtle, Bulvasaur);
                        break;
                    case 2:
                        MetodosProyecto.menuCombate(Pikachu, Charmander, Squirtle, Bulvasaur);
                        break;
                    case 3:
                        salir = true;
                        MetodosProyecto.LimpiarPantalla();
                        System.out.println("Gracias por jugar!");
                        break;
                }
           
        }while(!salir);
    }

}
