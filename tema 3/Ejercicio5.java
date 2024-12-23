/*
 * Ejercicio5.java
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
/*Escribe un programa que calcule el área de un rectángulo.*/
import java.util.Scanner;
public class Ejercicio5 {

	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Introduzca la base del rectangulo");
		int base = s.nextInt ();
		System.out.println("Introduzca la altura del rectangulo");
		int altura = s.nextInt ();
		int area = base * altura;
		System.out.println("El Area del rectangulo es: "+area);
	}
}

