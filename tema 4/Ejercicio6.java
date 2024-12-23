/*
 * Ejercicio6.java
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
/*primero se multiplica la altura por 2 y el resultado se divide entre la gravedad (9,81) y luego se coge  la raiz*/
import java.util.Scanner;
public class Ejercicio6 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		double g = 9.81;
		
		System.out.println("Introduzca la aaltura desde la que cae el objeto: ");
		double h = s.nextDouble();
		
		double t = Math.sqrt((2 *h) / g);
		
		System.out.printf("El tiempo que tarda en caer el objeto desde %.2f   metros es de %.2f segundos ", h, t);
	}
}

