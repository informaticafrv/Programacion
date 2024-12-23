/*
 * Ejercicio2.java
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

import java.util.Scanner;
public class Ejercicio2 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Introduzca la hora (de 0 a 23)");
		int hora = s.nextInt();
		
		if (hora >= 6 && hora <= 12){
			System.out.println("Buenos dias");
		}else if (hora >= 13 && hora <= 20){
			System.out.println("Buenas tardes");
		}else if ((hora >= 21 && hora <= 23) || (hora >= 0 && hora <= 5)){
		System.out.println("Buenas noches");
		}else{
			System.out.println("Hora no valida");
			}
	}
	}

