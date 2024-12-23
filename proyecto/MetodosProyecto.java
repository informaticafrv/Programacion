/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.Scanner;

/**
 *
 * @author Lobo
 */
public class MetodosProyecto {

    //Método para Limpiar la pantalla metiendo 50 saltos de línea
    public static void LimpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    //Método que tira una moneda con un 80% de posibilidades de que salte crítico en un ataque (solo ataques de contacto)
    public static boolean critico() {

        boolean critico;

        int moneda = (int) (Math.random() * 101) + 1;
        if (moneda > 80) {
            critico = true;
        } else {
            critico = false;
        }
        return critico;
    }

    public static void MenuEstadisticas(int[] Pikachu, int[] Charmander, int[] Squirtle, int[] Bulvasaur) throws InterruptedException {
        Scanner s = new Scanner (System.in);
        MetodosProyecto.LimpiarPantalla();
        //bandera para salir del menú
        boolean salirP = false;
        //submenú para elegir de que Pokémon ver las estadisticas
        do {
            System.out.println("Qué Pokémon quiere revisar: ");
            System.out.println("-------------------------------");
            System.out.println("|       º1: Pikachu           |");
            System.out.println("|       º2: Charmander        |");
            System.out.println("|       º3: Squirtle          |");
            System.out.println("|       º4: Bulbasaur         |");
            System.out.println("|       º5: Menú Principal    |");
            System.out.println("-------------------------------");
            
            int opcP = s.nextInt();
            LimpiarPantalla();
            switch (opcP) {
                case 1:
                    LimpiarPantalla();
                    explicacionP(Pikachu);
                    break;
                case 2:
                    LimpiarPantalla();
                    explicacionCh(Charmander);
                    break;
                case 3:
                    LimpiarPantalla();
                    explicacionS(Squirtle);
                    break;
                case 4:
                    LimpiarPantalla();
                    explicacionB(Bulvasaur);
                    break;
                case 5:
                    salirP = true;
                    break;
                default: 
                    System.out.println("Por favor una opción del 1 al 5, prueba otra vez: ");
            }
        } while (!salirP);
    }
    //Metodo que explica las estadísticas y algunos datos sobre Pikachu
    public static void explicacionP(int[] Pikachu) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("| Nombre: Pikachu                                                      |");
        System.out.println("| Pikachu es un Pokémon de tipo Eléctrico                              |");
        System.out.println("| por lo tanto es súper eficaz contra Pokémons tipo Agua como Squirtle |");
        System.out.println("------------------------------------------------------------------------");
        System.out.print("Sus estadísticas son");
        //bucle para mostrar puntos suspensivos
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            Thread.sleep(550);
        }
        System.out.println();
        System.out.println("------------------");
        System.out.println("|   Ataque -> " + Pikachu[0] + " |");
        System.out.println("|  Defensa -> " + Pikachu[1] + " |");
        System.out.println("|     Vida -> " + Pikachu[2] + " |");
        System.out.println("------------------");
        System.out.println();
        System.out.println("--------------------------------------------------------");
        System.out.println("| Es un elección medianamente superior por qué ninguno |");
        System.out.println("| de los otros tipos es súper eficaz al suyo           |");
        System.out.println("--------------------------------------------------------");
        System.out.println("Pulse enter para volver al menú...");
        s.nextLine();
        LimpiarPantalla();
    }
    public static void explicacionCh(int[] Charmarder) throws InterruptedException{
        Scanner s = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("| Nombre: Charmarder                                                      |");
        System.out.println("| Charmander es un Pokémon de tipo Fuego                                  |");
        System.out.println("| por lo tanto es súper eficaz contra Pokémons tipo Planta como Bulbasaur |");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println();
        System.out.print("Sus estadísticas son");
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            Thread.sleep(550);
        }
        System.out.println();
        System.out.println("------------------");
        System.out.println("|   Ataque -> " + Charmarder[0] + " |");
        System.out.println("|  Defensa -> " + Charmarder[1] + " |");
        System.out.println("|     Vida -> " + Charmarder[2] + " |");
        System.out.println("------------------");
        System.out.println();
        System.out.println("--------------------------------------------------------");
        System.out.println("| Es una elección enfocada al ataque con poca defensa  |");
        System.out.println("| es débil contra ataques de tipo Agua                 |");
        System.out.println("--------------------------------------------------------");
        System.out.println("Pulse enter para volver al menú...");
        s.nextLine();
        LimpiarPantalla();
    }
    public static void explicacionS(int[] Squirtle) throws InterruptedException{
        Scanner s = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("| Nombre: Squirtle                                                        |");
        System.out.println("| Squirtle es un Pokémon de tipo Agua                                     |");
        System.out.println("| por lo tanto es súper eficaz contra Pokémons tipo Fuego como Charmander |");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println();
        System.out.print("Sus estadísticas son");
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            Thread.sleep(550);
        }
        System.out.println();
        System.out.println("------------------");
        System.out.println("|   Ataque -> " + Squirtle[0] + " |");
        System.out.println("|  Defensa -> " + Squirtle[1] + " |");
        System.out.println("|     Vida -> " + Squirtle[2] + " |");
        System.out.println("------------------");
        System.out.println();
        System.out.println("----------------------------------------------------------");
        System.out.println("| Es una elección enfocada a la defensa con poco ataque  |");
        System.out.println("| es débil contra ataques de tipo Planta                 |");
        System.out.println("----------------------------------------------------------");
        System.out.println("Pulse enter para volver al menú...");
        s.nextLine();
        LimpiarPantalla();
    }
    public static void explicacionB(int[] Bulvasaur) throws InterruptedException{
        Scanner s = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("| Nombre: Bulbasaur                                                         |");
        System.out.println("| Bulvasaur es un Pokémon de tipo Planta                                    |");
        System.out.println("| por lo tanto es súper eficaz contra Pokémons tipo Agua como Squirtle      |");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println();
        System.out.print("Sus estadísticas son");
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            Thread.sleep(550);
        }
        System.out.println();
        System.out.println("------------------");
        System.out.println("|   Ataque -> " + Bulvasaur[0] + " |");
        System.out.println("|  Defensa -> " + Bulvasaur[1] + " |");
        System.out.println("|     Vida -> " + Bulvasaur[2] + " |");
        System.out.println("------------------");
        System.out.println();
        System.out.println("--------------------------------------------------------");
        System.out.println("| Es una elección totalmente equilibrada               |");
        System.out.println("| es débil contra ataques de tipo Fuego                |");
        System.out.println("--------------------------------------------------------");
        System.out.println("Pulse enter para volver al menú...");
        s.nextLine();
        LimpiarPantalla();
    }
    public static void menuCombate(int[] Pikachu, int[] Charmander, int[] Squirtle, int[] Bulvasaur) throws InterruptedException{
        Scanner s = new Scanner (System.in);
        
        LimpiarPantalla();
        
        boolean salirC = false;
        
        do{
            //se vuelven a asignar los valores cuando se vuelve al menú de elección
            //para que cuando termines un combate y elijas el mismo combate los valores se reseteen
        Pikachu[0] = 60; 
        Pikachu[1] = 40; 
        Pikachu[2] = 70; 
        
        Charmander[0] = 70;
        Charmander[1] = 30;
        Charmander[2] = 50;
        
        Squirtle[0] = 30;
        Squirtle[1] = 70;
        Squirtle[2] = 80;
        
        Bulvasaur[0] = 50;
        Bulvasaur[1] = 50;
        Bulvasaur[2] = 60;
        
        System.out.println("Que Pokémon quiere elegir?");
        System.out.println("        1º Pikachu        ");
        System.out.println("        2º Charmander     ");
        System.out.println("        3º Squirtle       ");
        System.out.println("        4º Bulbasaur      ");
        System.out.println("        5º Volver         ");
        
        int opcC = s.nextInt();
            switch (opcC) {
                case 1:
                    LimpiarPantalla();
                    combateP(Pikachu, Bulvasaur);
                    break;
                case 2:
                    combateCh(Charmander, Squirtle);
                    break;
                case 3:
                    combateSqi(Squirtle, Bulvasaur);
                    break;
                case 4:
                    combateBul(Bulvasaur, Charmander);
                    break;
                case 5:
                    salirC = true;
                    LimpiarPantalla();
                    break;
                default:
                    System.out.println("Por favor una opción del 1 al 5, prueba otra vez: ");
            }
        }while(!salirC);
        
    }
    public static void combateP (int[] Pikachu, int[] Bulvasaur) throws InterruptedException{
        Scanner s = new Scanner(System.in);
        
        int placaje = 20;
        int gruñido = 10;
        int impactrueno = 25;
        int latigoCepa = 25;
        double ataquePik = Pikachu[0];
        double defensaBul = Bulvasaur[1];
        double vidaBul = Bulvasaur[2];
        double ataqueBul = Bulvasaur[0];
        double defensaPik = Pikachu[1];
        double vidaPik = Pikachu[2];
        double ataqueP;
        double dañoA;
        double defensaR;
        boolean acabado = false;
        int contador = 0;
        int eleccionRival = 0;
        
        System.out.print("Buscando un juegador");
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            Thread.sleep(550);
            }
            
            String[][] rivales = new String [2][2];
            rivales[0][0] = "Fran Serrano";
            rivales[0][1] = "Rubén González";
            rivales[1][0] = "Rosa Garzón";
            rivales[1][1] = "Daniel Leyva";
            
            int rival1 = (int)(Math.random()*2);
            int rival2 = (int)(Math.random()*2);
            
            System.out.println("Tu rival es "+rivales[rival1][rival2]);
            System.out.println("Y el pokémon que ha elegido es: Bulbasaur");
            System.out.println("Pulse enter para continuar");
            s.nextLine();
            LimpiarPantalla();
            System.out.println("Empieza el combate!");
            System.out.println();
            System.out.println();
            do{
                System.out.println("Pikachu HP:"+Pikachu[2]+"                      "+"Bulbasaur HP:"+Bulvasaur[2]);
                System.out.println("--------------                     ----------------");
                System.out.println();
                System.out.println("------------------------------");
                System.out.println("| Elija un Ataque:           |");
                System.out.println("| 1: Placaje                 |");
                System.out.println("| 2: Gruñido                 |");
                System.out.println("| 3: Impactrueno             |");
                System.out.println("------------------------------");
                int opcAtq = s.nextInt();
                s.nextLine();
                switch (opcAtq) {
                    case 1:
                        boolean critico = critico();
                        ataqueP = (ataquePik / 100)+1;
                        dañoA = placaje * ataqueP;
                        defensaR = (defensaBul / 100) +1;
                        dañoA /= defensaR;
                        System.out.println(ataqueP);
                        if(critico == true){
                        dañoA *= 2;
                        }
                        
                        vidaBul =  vidaBul - dañoA;
                        Bulvasaur[2] = (int)vidaBul;
                        System.out.println();
                        System.out.print("Pikachu ha usado Placaje");
                        if(critico == true){
                            System.out.print(" Y ha sido crítico");
                        }
                        for (int i = 0; i < 3; i++) {
                            System.out.print(".");
                            Thread.sleep(550);
                           }
                        System.out.println("Pulse enter para continuar");
                                s.nextLine();
                        LimpiarPantalla();
                        break;
                    case 2:
                        if(contador < 4){
                        dañoA = gruñido / 100.00;
                        defensaR = Bulvasaur[1] * dañoA;
                        Bulvasaur[1] = Bulvasaur[1] - (int)defensaR;
                        contador++;
                            System.out.print("Pikachu ha usado Gruñido");
                            for (int i = 0; i < 3; i++) {
                            System.out.print(".");
                            Thread.sleep(550);
                           }
                        }else{
                            System.out.println("No puedes elegir gruñido más de tres veces");
                        }
                        System.out.println();
                        System.out.println("Pulse enter para continuar");
                                s.nextLine();
                         LimpiarPantalla();
                        break;
                    case 3:
                        critico = critico();
                        ataqueP = (ataquePik / 100)+1;
                        dañoA = (impactrueno /2) * ataqueP;
                        defensaR = (defensaBul / 100) +1;
                        dañoA /= defensaR;
                        if(critico == true){
                        dañoA *= 2;
                        }
                        vidaBul =  vidaBul - dañoA;
                        Bulvasaur[2] = (int)vidaBul; 
                        System.out.print("Pikachu ha usado Impactrueno");
                        for (int i = 0; i < 3; i++) {
                            System.out.print(".");
                            Thread.sleep(550);
                           }
                        System.out.println();
                        System.out.println("Pulse enter para continuar");
                                s.nextLine();
                        LimpiarPantalla();
                        break;
                    default:
                        System.out.println("Elección incorrecta");
                }
                
                //eleccion del rival
                //se tira una moneda para las tiradas 
                //tiene más probabilidad el ataque que tiene ventaja
                //para aumentar la dificultad
                
                int aleatorio = (int)(Math.random()*101);
                
                
                if(aleatorio <= 40){
                eleccionRival = 3;
                }else if(aleatorio < 70 && aleatorio > 40){
                eleccionRival = 1;
                }else{
                eleccionRival = 2;
                }
                
                
                switch (eleccionRival) {
                    case 1:
                        //se guarda la moneda de critico cada vez que se usa el ataque
                        boolean critico = critico();
                        //Calculos entre las estadisticas de los pokemons y los de los ataques para calcular el daño
                        ataqueP = (ataqueBul / 100)+1;
                        dañoA = placaje * ataqueP;
                        defensaR = (defensaPik / 100) +1;
                        dañoA /= defensaR;
                        //si salta critico el daño calculado se multiplica por dos
                        if(critico == true){
                        dañoA *= 2;
                        }
                        
                        vidaPik =  vidaPik - dañoA;
                        Pikachu[2] = (int)vidaBul;
                        System.out.println();
                        System.out.print("Bulbasaur ha usado Placaje");
                        if(critico == true){
                            System.out.print(" Y ha sido crítico");
                        }
                        for (int i = 0; i < 3; i++) {
                            System.out.print(".");
                            Thread.sleep(550);
                           }
                        System.out.println();
                        System.out.println("Pulse enter para continuar");
                                s.nextLine();
                        LimpiarPantalla();
                        break;
                    case 2:
                        if(contador < 4){
                        dañoA = gruñido / 100.00;
                        defensaR = Pikachu[1] * dañoA;
                        Pikachu[1] = Pikachu[1] - (int)defensaR;
                        contador++;
                            System.out.print("Bulbasaur ha usado Gruñido");
                            for (int i = 0; i < 3; i++) {
                            System.out.print(".");
                            Thread.sleep(550);
                           }
                        }else{
                            System.out.println("No puedes elegir gruñido más de tres veces");
                        }
                        System.out.println();
                        System.out.println("Pulse enter para continuar");
                                s.nextLine();
                         LimpiarPantalla();
                        break;
                    case 3:
                        critico = critico();
                        ataqueP = (ataqueBul / 100)+1;
                        dañoA = latigoCepa * ataqueP;
                        defensaR = (defensaPik / 100) +1;
                        dañoA /= defensaR;
                        
                        if(critico == true){
                        dañoA *= 2;
                        }
                        
                        vidaPik =  vidaPik - dañoA;
                        Pikachu[2] = (int)vidaPik;
                        System.out.println();
                        System.out.print("Bulbasaur ha usado Latigo Cepa");
                        if(critico == true){
                            System.out.print(" Y ha sido crítico");
                        }
                        for (int i = 0; i < 3; i++) {
                            System.out.print(".");
                            Thread.sleep(550);
                           }
                        System.out.println();
                        System.out.println("Pulse enter para continuar");
                                s.nextLine();
                        LimpiarPantalla();
                        break;
                    default:
                }
            if(Bulvasaur[2] <= 0 && Pikachu[2] <= 0){
                System.out.println("Han sido tablas");
                System.out.println("Pulse enter para volver");
                s.nextLine();
                acabado = true;
            }else if(Pikachu[2] <= 0){
            System.out.println("Pikachu ha sido debilitado, has perdido contra "+rivales[rival1][rival2]);
                System.out.println("Pulse enter para volver");
                s.nextLine();
                acabado = true;
            }else if(Bulvasaur[2] <= 0){
            System.out.println("Bulbasaur ha sido debilitado, has ganado a "+rivales[rival1][rival2]);
                System.out.println("Pulse enter para volver");
                s.nextLine();
                acabado = true;
            }
            }while(!acabado);
        LimpiarPantalla();
    }
    public static void combateCh (int[] Charmander, int[] Squirtle) throws InterruptedException{
        Scanner s = new Scanner(System.in);
        
        int placaje = 20;
        int gruñido = 10;
        int ascuas = 25;
        int pistolaAgua = 25;
        double ataqueChar = Charmander[0];
        double defensaSqi = Squirtle[1];
        double vidaSqi = Squirtle[2];
        double ataqueSqi = Squirtle[0];
        double defensaChar = Charmander[1];
        double vidaChar = Charmander[2];
        double ataqueP;
        double dañoA;
        double defensaR;
        boolean acabado = false;
        int contador = 0;
        int eleccionRival = 0;
        
        System.out.print("Buscando un juegador");
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            Thread.sleep(550);
            }
            
            String[][] rivales = new String [2][2];
            rivales[0][0] = "Fran Serrano";
            rivales[0][1] = "Rubén González";
            rivales[1][0] = "Rosa Garzón";
            rivales[1][1] = "Daniel Leyva";
            
            int rival1 = (int)(Math.random()*2);
            int rival2 = (int)(Math.random()*2);
            
            System.out.println("Tu rival es "+rivales[rival1][rival2]);
            System.out.println("Y el pokémon que ha elegido es: Squirtle");
            System.out.println("Pulse enter para continuar");
            s.nextLine();
            LimpiarPantalla();
            System.out.println("Empieza el combate!");
            System.out.println();
            System.out.println();
            do{
                System.out.println("Charmander HP:"+Charmander[2]+"                      "+"Squirtle HP:"+Squirtle[2]);
                System.out.println("--------------                     ----------------");
                System.out.println();
                System.out.println("------------------------------");
                System.out.println("| Elija un Ataque:           |");
                System.out.println("| 1: Placaje                 |");
                System.out.println("| 2: Gruñido                 |");
                System.out.println("| 3: Ascuas                  |");
                System.out.println("------------------------------");
                int opcAtq = s.nextInt();
                s.nextLine();
                LimpiarPantalla();
                switch (opcAtq) {
                    case 1:
                        boolean critico = critico();
                        ataqueP = (ataqueChar / 100)+1;
                        dañoA = placaje * ataqueP;
                        defensaR = (defensaSqi / 100) +1;
                        dañoA /= defensaR;
                        
                        if(critico == true){
                        dañoA *= 2;
                        }
                        
                        vidaSqi =  vidaSqi - dañoA;
                        Squirtle[2] = (int)vidaSqi;
                        System.out.println();
                        System.out.print("Charmander ha usado Placaje");
                        if(critico == true){
                            System.out.print(" Y ha sido crítico");
                        }
                        for (int i = 0; i < 3; i++) {
                            System.out.print(".");
                            Thread.sleep(550);
                           }
                        System.out.println();
                        System.out.println("Pulse enter para continuar");
                                s.nextLine();
                        LimpiarPantalla();
                        break;
                    case 2:
                        if(contador < 4){
                        dañoA = gruñido / 100.00;
                        defensaR = Squirtle[1] * dañoA;
                        Squirtle[1] = Squirtle[1] - (int)defensaR;
                        contador++;
                            System.out.print("Charmander ha usado Gruñido");
                            for (int i = 0; i < 3; i++) {
                            System.out.print(".");
                            Thread.sleep(550);
                           }
                        }else{
                            System.out.println("No puedes elegir gruñido más de tres veces");
                        }
                        System.out.println();
                        System.out.println("Pulse enter para continuar");
                                s.nextLine();
                         LimpiarPantalla();
                        break;
                    case 3:
                        critico = critico();
                        ataqueP = (ataqueChar / 100)+1;
                        dañoA = (ascuas /2) * ataqueP;
                        defensaR = (defensaSqi / 100) +1;
                        dañoA /= defensaR;
                        if(critico == true){
                        dañoA *= 2;
                        }
                        vidaSqi =  vidaSqi - dañoA;
                        Squirtle[2] = (int)vidaSqi; 
                        System.out.print("Charmander ha usado Ascuas");
                        for (int i = 0; i < 3; i++) {
                            System.out.print(".");
                            Thread.sleep(550);
                           }
                        System.out.println();
                        System.out.println("Pulse enter para continuar");
                                s.nextLine();
                        LimpiarPantalla();
                        break;
                    default:
                        System.out.println("Elección incorrecta");
                }
                
                //eleccion del rival
                
                int aleatorio = (int)(Math.random()*101);
                
                
                if(aleatorio <= 40){
                eleccionRival = 3;
                }else if(aleatorio < 70 && aleatorio > 40){
                eleccionRival = 1;
                }else{
                eleccionRival = 2;
                }
                
                
                switch (eleccionRival) {
                    case 1:
                        boolean critico = critico();
                        ataqueP = (ataqueSqi / 100)+1;
                        dañoA = placaje * ataqueP;
                        defensaR = (defensaSqi / 100) +1;
                        dañoA /= defensaR;
                        
                        if(critico == true){
                        dañoA *= 2;
                        }
                        
                        vidaChar =  vidaChar - dañoA;
                        Charmander[2] = (int)vidaChar;
                        System.out.println();
                        System.out.print("Squirtle ha usado Placaje");
                        if(critico == true){
                            System.out.print(" Y ha sido crítico");
                        }
                        for (int i = 0; i < 3; i++) {
                            System.out.print(".");
                            Thread.sleep(550);
                           }
                        System.out.println();
                        System.out.println("Pulse enter para continuar");
                                s.nextLine();
                        LimpiarPantalla();
                        break;
                    case 2:
                        if(contador < 4){
                        dañoA = gruñido / 100.00;
                        defensaR = Charmander[1] * dañoA;
                        Charmander[1] = Charmander[1] - (int)defensaR;
                        contador++;
                            System.out.print("Squirtle ha usado Gruñido");
                            for (int i = 0; i < 3; i++) {
                            System.out.print(".");
                            Thread.sleep(550);
                           }
                        }else{
                            System.out.println("No puedes elegir gruñido más de tres veces");
                        }
                        System.out.println();
                        System.out.println("Pulse enter para continuar");
                                s.nextLine();
                         LimpiarPantalla();
                        break;
                    case 3:
                        critico = critico();
                        ataqueP = (ataqueSqi / 100)+1;
                        dañoA = (pistolaAgua * 2) * ataqueP;
                        defensaR = (defensaSqi / 100) +1;
                        dañoA /= defensaR;
                        
                        if(critico == true){
                        dañoA *= 2;
                        }
                        
                        vidaChar =  vidaChar - dañoA;
                        Charmander[2] = (int)vidaChar;
                        System.out.println();
                        System.out.print("Squirtle ha usado Pistola agua");
                        if(critico == true){
                            System.out.print(" Y ha sido crítico");
                        }
                        for (int i = 0; i < 3; i++) {
                            System.out.print(".");
                            Thread.sleep(550);
                           }
                        System.out.println();
                        System.out.println("Pulse enter para continuar");
                                s.nextLine();
                        LimpiarPantalla();
                        break;
                    default:
                }
            if(Squirtle[2] <= 0 && Charmander[2] <= 0){
                System.out.println("Han sido tablas");
                System.out.println("Pulse enter para volver");
                s.nextLine();
                acabado = true;
            }else if(Squirtle[2] <= 0){
            System.out.println("Squirtle ha sido debilitado, has ganado a "+rivales[rival1][rival2]);
                System.out.println("Pulse enter para volver");
                s.nextLine();
                acabado = true;
            }else if(Charmander[2] <= 0){
            System.out.println("Charmander ha sido debilitado, has perdido contra "+rivales[rival1][rival2]);
                System.out.println("Pulse enter para volver");
                s.nextLine();
                acabado = true;
            }
            }while(!acabado);
        LimpiarPantalla();
    }
     public static void combateSqi (int[] Squirtle, int[] Bulvasaur) throws InterruptedException{
        Scanner s = new Scanner(System.in);
        
        int placaje = 20;
        int gruñido = 10;
        int pistolaAgua = 25;
        int latigoCepa = 25;
        double ataqueSqi = Squirtle[0];
        double defensaBul = Bulvasaur[1];
        double vidaBul = Bulvasaur[2];
        double ataqueBul = Bulvasaur[0];
        double defensaSqi = Squirtle[1];
        double vidaSqi = Squirtle[2];
        double ataqueP;
        double dañoA;
        double defensaR;
        boolean acabado = false;
        int contador = 0;
        int eleccionRival = 0;
        
        System.out.print("Buscando un juegador");
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            Thread.sleep(550);
            }
            
            String[][] rivales = new String [2][2];
            rivales[0][0] = "Fran Serrano";
            rivales[0][1] = "Rubén González";
            rivales[1][0] = "Rosa Garzón";
            rivales[1][1] = "Daniel Leyva";
            
            int rival1 = (int)(Math.random()*2);
            int rival2 = (int)(Math.random()*2);
            
            System.out.println("Tu rival es "+rivales[rival1][rival2]);
            System.out.println("Y el pokémon que ha elegido es: Bulbasaur");
            System.out.println("Pulse enter para continuar");
            s.nextLine();
            LimpiarPantalla();
            System.out.println("Empieza el combate!");
            System.out.println();
            System.out.println();
            do{
                System.out.println("Squirtle HP:"+Squirtle[2]+"                      "+"Bulbasaur HP:"+Bulvasaur[2]);
                System.out.println("--------------                     ----------------");
                System.out.println();
                System.out.println("------------------------------");
                System.out.println("| Eliga un Ataque:           |");
                System.out.println("| 1: Placaje                 |");
                System.out.println("| 2: Gruñido                 |");
                System.out.println("| 3: Pistola Agua            |");
                System.out.println("------------------------------");
                int opcAtq = s.nextInt();
                s.nextLine();
                LimpiarPantalla();
                switch (opcAtq) {
                    case 1:
                        boolean critico = critico();
                        ataqueP = (ataqueSqi/ 100)+1;
                        dañoA = placaje * ataqueP;
                        defensaR = (defensaBul / 100) +1;
                        dañoA /= defensaR;
                        
                        if(critico == true){
                        dañoA *= 2;
                        }
                        
                        vidaBul =  vidaSqi - dañoA;
                        Bulvasaur[2] = (int)vidaBul;
                        System.out.println();
                        System.out.print("Squirtle ha usado Placaje");
                        if(critico == true){
                            System.out.print(" Y ha sido crítico");
                        }
                        for (int i = 0; i < 3; i++) {
                            System.out.print(".");
                            Thread.sleep(550);
                           }
                        System.out.println();
                        
                        break;
                    case 2:
                        if(contador < 4){
                        dañoA = gruñido / 100.00;
                        defensaR = Bulvasaur[1] * dañoA;
                        Bulvasaur[1] = Bulvasaur[1] - (int)defensaR;
                        contador++;
                            System.out.print("Squirtle ha usado Gruñido");
                            for (int i = 0; i < 3; i++) {
                            System.out.print(".");
                            Thread.sleep(550);
                           }
                        }else{
                            System.out.println("No puedes elegir gruñido más de tres veces");
                        }
                        System.out.println();
                        break;
                    case 3:
                        critico = critico();
                        ataqueP = (ataqueSqi / 100)+1;
                        dañoA = (pistolaAgua /2) * ataqueP;
                        defensaR = (defensaBul / 100) +1;
                        dañoA /= defensaR;
                        if(critico == true){
                        dañoA *= 2;
                        }
                        vidaBul =  vidaBul - dañoA;
                        Bulvasaur[2] = (int)vidaBul; 
                        System.out.print("Squirtle ha usado Pistola Agua");
                        for (int i = 0; i < 3; i++) {
                            System.out.print(".");
                            Thread.sleep(550);
                           }
                        System.out.println();
                        break;
                    default:
                        System.out.println("Elección incorrecta");
                }
                
                //eleccion del rival
                
                int aleatorio = (int)(Math.random()*101);
                
                
                if(aleatorio <= 40){
                eleccionRival = 3;
                }else if(aleatorio < 70 && aleatorio > 40){
                eleccionRival = 1;
                }else{
                eleccionRival = 2;
                }
                
                
                switch (eleccionRival) {
                    case 1:
                        boolean critico = critico();
                        ataqueP = (ataqueSqi / 100)+1;
                        dañoA = placaje * ataqueP;
                        defensaR = (defensaSqi / 100) +1;
                        dañoA /= defensaR;
                        
                        if(critico == true){
                        dañoA *= 2;
                        }
                        
                        vidaSqi =  vidaSqi - dañoA;
                        Squirtle[2] = (int)vidaSqi;
                        System.out.println();
                        System.out.print("Bulbasaur ha usado Placaje");
                        if(critico == true){
                            System.out.print(" Y ha sido crítico");
                        }
                        for (int i = 0; i < 3; i++) {
                            System.out.print(".");
                            Thread.sleep(550);
                           }
                        System.out.println();
                        System.out.println("Pulse enter para continuar");
                                s.nextLine();
                        LimpiarPantalla();
                        break;
                    case 2:
                        if(contador < 4){
                        dañoA = gruñido / 100.00;
                        defensaR = Squirtle[1] * dañoA;
                        Squirtle[1] = Squirtle[1] - (int)defensaR;
                        contador++;
                            System.out.print("Bulbasaur ha usado Gruñido");
                            for (int i = 0; i < 3; i++) {
                            System.out.print(".");
                            Thread.sleep(550);
                           }
                        }else{
                            System.out.println("No puedes elegir gruñido más de tres veces");
                        }
                        System.out.println();
                        System.out.println("Pulse enter para continuar");
                                s.nextLine();
                         LimpiarPantalla();
                        break;
                    case 3:
                        critico = critico();
                        ataqueP = (ataqueBul / 100)+1;
                        dañoA = (latigoCepa * 2) * ataqueP;
                        defensaR = (defensaSqi / 100) +1;
                        dañoA /= defensaR;
                        
                        if(critico == true){
                        dañoA *= 2;
                        }
                        
                        vidaSqi =  vidaSqi - dañoA;
                        Squirtle[2] = (int)vidaSqi;
                        System.out.println();
                        System.out.print("Bulbasaur ha usado Latigo Cepa");
                        if(critico == true){
                            System.out.print(" Y ha sido crítico");
                        }
                        for (int i = 0; i < 3; i++) {
                            System.out.print(".");
                            Thread.sleep(550);
                           }
                        System.out.println();
                        System.out.println("Pulse enter para continuar");
                                s.nextLine();
                        LimpiarPantalla();
                        break;
                    default:
                }
            if(Bulvasaur[2] <= 0 && Squirtle[2] <= 0){
                System.out.println("Han sido tablas");
                System.out.println("Pulse enter para volver");
                s.nextLine();
                acabado = true;
            }else if(Bulvasaur[2] <= 0){
            System.out.println("Bulbasaur ha sido debilitado, has ganado a "+rivales[rival1][rival2]);
                System.out.println("Pulse enter para volver");
                s.nextLine();
                acabado = true;
            }else if(Squirtle[2] <= 0){
            System.out.println("Squirtle ha sido debilitado, has perdido contra "+rivales[rival1][rival2]);
                System.out.println("Pulse enter para volver");
                s.nextLine();
                acabado = true;
            }
            }while(!acabado);
        LimpiarPantalla();
    }
     public static void combateBul (int[] Bulvasaur, int[] Charmander) throws InterruptedException{
        Scanner s = new Scanner(System.in);
        
        int placaje = 20;
        int gruñido = 10;
        int latigoCepa = 25;
        int Ascuas = 25;
        double ataqueBul = Bulvasaur[0];
        double defensaChar = Charmander[1];
        double vidaChar = Charmander[2];
        double ataqueChar = Charmander[0];
        double defensaBul = Bulvasaur[1];
        double vidaBul = Bulvasaur[2];
        double ataqueP;
        double dañoA;
        double defensaR;
        boolean acabado = false;
        int contador = 0;
        int eleccionRival = 0;
        
        System.out.print("Buscando un juegador");
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            Thread.sleep(550);
            }
            
            String[][] rivales = new String [2][2];
            rivales[0][0] = "Fran Serrano";
            rivales[0][1] = "Rubén González";
            rivales[1][0] = "Rosa Garzón";
            rivales[1][1] = "Daniel Leyva";
            
            int rival1 = (int)(Math.random()*2);
            int rival2 = (int)(Math.random()*2);
            
            System.out.println("Tu rival es "+rivales[rival1][rival2]);
            System.out.println("Y el pokémon que ha elegido es: Charmander");
            System.out.println("Pulse enter para continuar");
            s.nextLine();
            LimpiarPantalla();
            System.out.println("Empieza el combate!");
            System.out.println();
            System.out.println();
            do{
                System.out.println("Bulbasaur HP:"+Bulvasaur[2]+"                      "+"Charmander HP:"+Charmander[2]);
                System.out.println("--------------                     ----------------");
                System.out.println();
                System.out.println("------------------------------");
                System.out.println("| Elija un Ataque:           |");
                System.out.println("| 1: Placaje                 |");
                System.out.println("| 2: Gruñido                 |");
                System.out.println("| 3: Latigo Cepa             |");
                System.out.println("------------------------------");
                int opcAtq = s.nextInt();
                s.nextLine();
                LimpiarPantalla();
                switch (opcAtq) {
                    case 1:
                        boolean critico = critico();
                        ataqueP = (ataqueBul/ 100)+1;
                        dañoA = placaje * ataqueP;
                        defensaR = (defensaChar / 100) +1;
                        dañoA /= defensaR;
                        
                        if(critico == true){
                        dañoA *= 2;
                        }
                        
                        vidaChar =  vidaChar - dañoA;
                        Charmander[2] = (int)vidaChar;
                        System.out.println();
                        System.out.print("Bulbasaur ha usado Placaje");
                        if(critico == true){
                            System.out.print(" Y ha sido crítico");
                        }
                        for (int i = 0; i < 3; i++) {
                            System.out.print(".");
                            Thread.sleep(550);
                           }
                        System.out.println();
                        
                        break;
                    case 2:
                        if(contador < 4){
                        dañoA = gruñido / 100.00;
                        defensaR = Charmander[1] * dañoA;
                        Charmander[1] = Charmander[1] - (int)defensaR;
                        contador++;
                            System.out.print("Bulbasaur ha usado Gruñido");
                            for (int i = 0; i < 3; i++) {
                            System.out.print(".");
                            Thread.sleep(550);
                           }
                        }else{
                            System.out.println("No puedes elegir gruñido más de tres veces");
                        }
                        System.out.println();
                        break;
                    case 3:
                        critico = critico();
                        ataqueP = (ataqueBul / 100)+1;
                        dañoA = (latigoCepa /2) * ataqueP;
                        defensaR = (defensaChar / 100) +1;
                        dañoA /= defensaR;
                        if(critico == true){
                        dañoA *= 2;
                        }
                        vidaBul =  vidaBul - dañoA;
                        Bulvasaur[2] = (int)vidaBul; 
                        System.out.print("Bulbasaur ha usado Latigo Cepa");
                        for (int i = 0; i < 3; i++) {
                            System.out.print(".");
                            Thread.sleep(550);
                           }
                        System.out.println();
                        break;
                    default:
                        System.out.println("Elección incorrecta");
                }
                
                //eleccion del rival
                
                int aleatorio = (int)(Math.random()*101);
                
                
                if(aleatorio <= 40){
                eleccionRival = 3;
                }else if(aleatorio < 70 && aleatorio > 40){
                eleccionRival = 1;
                }else{
                eleccionRival = 2;
                }
                
                
                switch (eleccionRival) {
                    case 1:
                        boolean critico = critico();
                        ataqueP = (ataqueChar / 100)+1;
                        dañoA = placaje * ataqueP;
                        defensaR = (defensaBul / 100) +1;
                        dañoA /= defensaR;
                        
                        if(critico == true){
                        dañoA *= 2;
                        }
                        
                        vidaBul =  vidaBul - dañoA;
                        Bulvasaur[2] = (int)vidaBul;
                        System.out.println();
                        System.out.print("Charmander ha usado Placaje");
                        if(critico == true){
                            System.out.print(" Y ha sido crítico");
                        }
                        for (int i = 0; i < 3; i++) {
                            System.out.print(".");
                            Thread.sleep(550);
                           }
                        System.out.println();
                        System.out.println("Pulse enter para continuar");
                                s.nextLine();
                        LimpiarPantalla();
                        break;
                    case 2:
                        if(contador < 4){
                        dañoA = gruñido / 100.00;
                        defensaR = Bulvasaur[1] * dañoA;
                        Bulvasaur[1] = Bulvasaur[1] - (int)defensaR;
                        contador++;
                            System.out.print("Charmander ha usado Gruñido");
                            for (int i = 0; i < 3; i++) {
                            System.out.print(".");
                            Thread.sleep(550);
                           }
                        }else{
                            System.out.println("No puedes elegir gruñido más de tres veces");
                        }
                        System.out.println();
                        System.out.println("Pulse enter para continuar");
                                s.nextLine();
                         LimpiarPantalla();
                        break;
                    case 3:
                        critico = critico();
                        ataqueP = (ataqueChar / 100)+1;
                        dañoA = (Ascuas * 2) * ataqueP;
                        defensaR = (defensaBul / 100) +1;
                        dañoA /= defensaR;
                        
                        if(critico == true){
                        dañoA *= 2;
                        }
                        
                        vidaBul =  vidaBul - dañoA;
                        Bulvasaur[2] = (int)vidaBul;
                        System.out.println();
                        System.out.print("Charmander ha usado Ascuas");
                        if(critico == true){
                            System.out.print(" Y ha sido crítico");
                        }
                        for (int i = 0; i < 3; i++) {
                            System.out.print(".");
                            Thread.sleep(550);
                           }
                        System.out.println();
                        System.out.println("Pulse enter para continuar");
                                s.nextLine();
                        LimpiarPantalla();
                        break;
                    default:
                }
            if(Charmander[2] <= 0 && Bulvasaur[2] <= 0){
                System.out.println("Han sido tablas");
                System.out.println("Pulse enter para volver");
                s.nextLine();
                acabado = true;
            }else if(Charmander[2] <= 0){
            System.out.println("Charmander ha sido debilitado, has ganado a "+rivales[rival1][rival2]);
                System.out.println("Pulse enter para volver");
                s.nextLine();
                acabado = true;
            }else if(Bulvasaur[2] <= 0){
            System.out.println("Bulvasaur ha sido debilitado, has perdido contra "+rivales[rival1][rival2]);
                System.out.println("Pulse enter para volver");
                s.nextLine();
                acabado = true;
            }
            }while(!acabado);
        LimpiarPantalla();
    }
}
