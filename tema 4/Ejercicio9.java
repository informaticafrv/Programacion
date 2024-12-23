/*
 * Ejercicio9.java
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
public class Ejercicio9 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.println("Ingrese el valor a: ");
		double a =  s.nextDouble();
		
		System.out.println("Ingrese el valor b: ");
		double b = s.nextDouble();
		
		System.out.println("Ingrese el valor c: ");
		double c = s.nextDouble();
		
		double disc = b * b - 4 * a * c;
		
		if(disc > 0){
			double x1 = (-b + Math.sqrt(disc)) / (2 * a);
			double x2 = (-b - Math.sqrt(disc)) / (2 * a);
			System.out.printf("La ecuación tiene dos soluciones reales: x1 = %.2f y x2 = %.2f", x1, x2);
			}else if(disc == 0){
				double x =  -b  / (2 * a);
				System.out.printf("La ecucion tiene una solucion real: x =  %.2f", x);
				}else{
					double real =  -b / (2 * a);
					double imaginaria = Math.sqrt(-disc) / (2 * a);
					System.out.printf("la ecuacion tiene dos soluciones complejas:  x1 = %.2f + %.2f y x2 = %.2f - %.2f",real, imaginaria, real, imaginaria);
					}
	}
}

