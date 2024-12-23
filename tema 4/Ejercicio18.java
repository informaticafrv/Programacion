/*
 * Ejercicio18.java
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
public class Ejercicio18 {
	
	public static void main (String[] args) {
	Scanner s = new Scanner (System.in);
		
	System.out.println("Escriba un numero: ");
	int num = s.nextInt();
	
	if(num > 99999){
		System.out.println("El numero tiene mas de cinco cifras");
		}else{
			num = Math.abs(num);
			}
	if (num >= 10000){
		num = num / 10000;
		}else if(num >= 1000){
			num = num / 1000;
			}else if(num >= 100){
				num = num / 100;
				}else if(num >= 10){
					num = num / 10;
					}
			
	System.out.println("La primera cifra de este numero es "+num);
	}
}

