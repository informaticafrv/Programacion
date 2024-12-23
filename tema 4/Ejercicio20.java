/*
 * Ejercicio20.java
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
public class Ejercicio20 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		int u = 0;
		int d = 0;
		int c = 0;
		int m = 0;
		int dm = 0;
		
		System.out.println("Introduzca un numero como maximo de 5 digitos: ");
		int nument = s.nextInt();
		int num = Math.abs(nument);
		
		if(num > 99999){
			System.out.println("El numero tiene que tener 5 digitos");
			}else if(num < 10){
				System.out.println("los numero de un digito siempre son capicua");
				}else if(num < 100){
					u = num % 10;
					d = num / 10;
					if (u == d){
						System.out.println("el numero "+nument+" es capicua");
						}else{
							System.out.println("el numero "+nument+" no es capicua");
							}
					}else if(num < 1000){
					u = num % 10;
					d = num / 100;
					if(u == d){
						System.out.println("el numero "+nument+" es capicua");
						}else{
							System.out.print("el numero "+nument+" no es capicua");
							}
					}else if(num < 10000){
						u = num % 10;
						d = (num / 10) % 10;
						c = (num / 100) % 10;
						m = num / 1000;
						if(u == m && d == c){
							System.out.println("El numero "+nument+" es capicua");
							}else{
								System.out.println("el numero "+nument+" no es capicua");
								}
						}else if(num < 100000){
							u = num % 10;
							d = (num / 10) % 10;
							m = (num / 1000) % 10;
							dm = num / 10000; 
							if(u == dm && d == m){
								System.out.println("el numero "+nument+"  es capicua");
								}else{
									System.out.println("el numero "+nument+" no es capicua");
									} 
							}
							
		}
	}


