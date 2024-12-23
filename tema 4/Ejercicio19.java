/*
 * Ejercicio19.java
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
public class Ejercicio19 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.println("Escriba un numero que como maximo tenga 5 digitos");
		int num = s.nextInt();
		
		if(num > 99999 && num < -99999){
			System.out.println("El numero que has introducido tiene mas de cinco letras");
			}else if(num <= 99999 && num >= 10000 || num >= -99999 && num <= -10000){
				System.out.print("El numero "+num+" tiene cinco digitos");
				}else if(num <= 9999 && num >= 1000 || num >= -9999 && num <= -1000){
					System.out.println("El numero "+num+" tiene cuatro digitos");
					}else if(num <= 999 && num >= 100 || num >= -999 && num <= -100){
						System.out.println("El numero "+num+" tiene tres digitos");
						}else if(num <= 99 && num >= 10 || num >= -99 && num <= -10){
							System.out.print("El numero "+num+" tiene dos digitos");
							}else if(num <= 9 && num >= 1 || num >= -9 && num <= -1){
								System.out.println("El numero "+num+" tiene un digito");
								}
	}
	}

