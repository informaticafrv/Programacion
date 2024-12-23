/*
 * Ejercicio3.java
 * 
 * Copyright 2024 franc <franc@DESKTOP-NQO1TN8>
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

import java.util.Scanner;
public class Ejercicio3 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.println("Introduzca un digito del 1 al 7");
		int dia = s.nextInt();
		
		switch (dia){
			case 1:
			System.out.println("Lunes");
			break;
			case 2:
			System.out.println("Martes");
			break;
			case 3:
			System.out.println("Miercoles");
			break;
			case 4:
			System.out.println("Jueves");
			break;
			case 5:
			System.out.println("Viernes");
			break;
			case 6:
			System.out.println("Sabado");
			break;
			case 7:
			System.out.println("Domingo");
			break;
	}
}
}
