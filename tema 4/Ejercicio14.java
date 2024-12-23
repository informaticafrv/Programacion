/*
 * Ejercicio14.java
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
public class Ejercicio14 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.println("Escriba un numero");
		int num = s.nextInt();
		
		if(num % 2 == 0 && num % 5 == 0){
			System.out.println("El numero "+num+" es par y divisible entre 5");
			}else if(num % 2 == 0){
				System.out.println("El numero "+num+" es par");
				}else if(num % 5 == 0){
					System.out.println("El numero "+num+" es divisible entre 5");
					}else{
						System.out.println("El numero "+num+" no es par ni divisible entre 5");
						}
	}
}

