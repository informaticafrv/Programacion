/*
 * Ejercicio12.java
 * 
 * Copyright 2024 Lobo <Lobo@DESKTOP-0H8VP5I>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
/*Realiza un minicuestionario con 10 preguntas tipo test sobre las 
asignaturas que se imparten en el curso. Cada pregunta acertada sumará
un punto. El programa mostrará al final la calificación obtenida.
Pásale el  minicuestionario a tus compañeros y pídeles que lo hagan para
ver qué tal andan de conocimientos en las diferentes asignaturas del
curso.*/
import java.util.Scanner;
public class Ejercicio12 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		int aciertos = 0;
		int errores = 0;
		int total = 0;
		
		System.out.println("¿Cual es la direccion IP por defecto en un router?");
		System.out.println("1. 192.168.0.1\n2. 192.169.1.1\n3. 193.168.0.1\n4. 192.168.1.255");
		
		int respuesta1 = s.nextInt();
		
		if(respuesta1 < 1 || respuesta1 > 4){
			System.out.println("solo puede responder: 1, 2, 3 o 4");
			}else if(respuesta1 == 1 || respuesta1 == 3){
				System.out.println("respuesta correcta");
				aciertos ++;
				total ++;
				}else{
					System.out.println("respuesta incorrecta");
					errores ++;
					}
		System.out.println("¿Que significa CPU?");
		System.out.println("1. Computer Personal Unit\n2. Central Processing Unit\n3. Central Programing Unit\n4. Control Processing Unit");
		
		int respuesta2 = s.nextInt();
		
		if(respuesta2 < 1 || respuesta2 > 4){
			System.out.println("solo puede responder: 1, 2, 3 o 4");
			}else if(respuesta2 == 2){
				System.out.println("respuesta correcta");
				aciertos ++;
				total ++;
				}else{
					System.out.println("respuesta incorrecta");
					errores ++;
					}
					
		System.out.println("¿Cual es un sistema operativo?");
		System.out.println("1. Python\n2. Google Chrome\n3. Windows\n4. MySQL");
		
				int respuesta3 = s.nextInt();
		
		if(respuesta3 < 1 || respuesta3 > 4){
			System.out.println("solo puede responder: 1, 2, 3 o 4");
			}else if(respuesta3 == 3){
				System.out.println("respuesta correcta");
				aciertos ++;
				total ++;
				}else{
					System.out.println("respuesta incorrecta");
					errores ++;
					}
					
		System.out.println("¿Que es un compilador?");
		System.out.println("1. Un programa que traduce codigo fuente a codigo maquina\n2. Un software de diseño grafico\n3. Un tipo de sistema operativo\n4. Un servidor de bases de datos");
		
				int respuesta4 = s.nextInt();
		
		if(respuesta4 < 1 || respuesta4 > 4){
			System.out.println("solo puede responder: 1, 2, 3 o 4");
			}else if(respuesta4 == 1){
				System.out.println("respuesta correcta");
				aciertos ++;
				total ++;
				}else{
					System.out.println("respuesta incorrecta");
					errores ++;
					}
					
		System.out.println("¿Cual es el lenguaje mas usado para desarrollo  web?");
		System.out.println("1. Python\n2. JavaScript\n3. C++\n4. Ruby");
		
				int respuesta5 = s.nextInt();
		
		if(respuesta5 < 1 || respuesta5 > 4){
			System.out.println("solo puede responder: 1, 2, 3 o 4");
			}else if(respuesta5 == 2){
				System.out.println("respuesta correcta");
				aciertos ++;
				total ++;
				}else{
					System.out.println("respuesta incorrecta");
					errores ++;
					}
		
		System.out.println("¿Que significa HTML?");
		System.out.println("1. HyperText Module Language\n2. HyperText Markup Language\n3. HighText Markup Language\n4. HyperTool Machine Language");
		
				int respuesta6 = s.nextInt();
		
		if(respuesta6 < 1 || respuesta2 > 4){
			System.out.println("solo puede responder: 1, 2, 3 o 4");
			}else if(respuesta6 == 2){
				System.out.println("respuesta correcta");
				aciertos ++;
				total ++;
				}else{
					System.out.println("respuesta incorrecta");
					errores ++;
					}
		
		System.out.println("¿Que es la RAM en un ordenador?");
		System.out.println("1. Un tipo de disco duro\n2. Memoria de acceso aleatorio\n3. Memoria de respaldo\n4. Un programa de arranque del sistema");
		
				int respuesta7 = s.nextInt();
		
		if(respuesta7 < 1 || respuesta7 > 4){
			System.out.println("solo puede responder: 1, 2, 3 o 4");
			}else if(respuesta2 == 2){
				System.out.println("respuesta correcta");
				aciertos ++;
				total ++;
				}else{
					System.out.println("respuesta incorrecta");
					errores ++;
					}
					
		System.out.println("¿Que es una red LAN?");
		System.out.println("1.Una red de area amplia\n2. Una red de area local\n3. Una  red de area metropolitana\n4. Una red inalambrica mundial");
		
				int respuesta8 = s.nextInt();
		
		if(respuesta8 < 1 || respuesta8 > 4){
			System.out.println("solo puede responder: 1, 2, 3 o 4");
			}else if(respuesta8 == 2){
				System.out.println("respuesta correcta");
				aciertos ++;
				total ++;
				}else{
					System.out.println("respuesta incorrecta");
					errores ++;
					}
					
		System.out.println("¿Que protocolo se utiliza principalente para transferir archivos en  internet?");
		System.out.println("1. HTTP\n2. FTP\n3. SMTP\n4. IMAP");
		
				int respuesta9 = s.nextInt();
		
		if(respuesta9 < 1 || respuesta9 > 4){
			System.out.println("solo puede responder: 1, 2, 3 o 4");
			}else if(respuesta9 == 2){
				System.out.println("respuesta correcta");
				aciertos ++;
				total ++;
				}else{
					System.out.println("respuesta incorrecta");
					errores ++;
					}
					
		System.out.println("¿Que es un  sistema operativo ?");
		System.out.println("1.Un tipo de software que  gestiona los recursos  del hardware\n2. Un lenguaje de programacion\n3. Un conjunto de aplicaciones\n4. Un sistema de  proteccion de antivirus");
		
				int respuesta10 = s.nextInt();
		
		if(respuesta10 < 1 || respuesta10 > 4){
			System.out.println("solo puede responder: 1, 2, 3 o 4");
			}else if(respuesta10 == 1){
				System.out.println("respuesta correcta");
				aciertos ++;
				total ++;
				}else{
					System.out.println("respuesta incorrecta");
					errores ++;
					}
		
		System.out.println("Has tenido "+aciertos+" aciertos y "+errores+" errores\ntu calificacion final es de: "+total+" puntos");
		
	}
}

