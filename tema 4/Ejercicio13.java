/*
 * Ejercicio13.java
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
public class Ejercicio13 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.println("Escriba el primero numero");
		int num1 = s.nextInt();
		
		System.out.println("Escriba el segundo numero"); 
		int num2 = s.nextInt();
		
		System.out.println("Escriba el tercer  numero");
		int num3 = s.nextInt();
		
		if(num1 > num2 && num1 > num3 && num2 > num3){
			System.out.println("Los numeros ordenados de mayor a menor son: "+num1+" "+num2+" "+num3);
			}else if(num2 > num1 && num2 > num3 && num1 > num3){
				System.out.println("Los numeros ordenados de mayor a menor son: "+num2+" "+num1+" "+num3);
				}else if(num3 > num1 && num3 > num2 && num2 > num1){
					System.out.println("Los numeros ordenados de mayor a menor son: "+num3+" "+num2+" "+num1);
					}else if(num2 > num1 && num2 > num3 && num3 > num1){
						System.out.println("Los numeros ordenados de mayor a menor son: "+num2+" "+num3+" "+num1);
						}else if(num1 > num2 && num1 > num3 && num3 > num2){
							System.out.println("Los numeros ordenados de mayor a menor son: "+num1+" "+num3+" "+num2);
							}else if(num3 > num1 && num3 > num2 && num1 > num2){
								System.out.println("Los numeros ordenados de mayor a menor son: "+num3+" "+num1+" "+num2);
								}else if(num1 == num2 && num1 == num3){
									System.out.println("Los numeros "+num1+", "+num2+" y "+num3+" son iguales");
									}else if(num1 == num2 && num1 > num3){
										System.out.print("Los numeros "+num1+" y "+num2+" son iguales pero mayores que "+num3);
										}else if(num2 == num3 && num3 >num1){
											System.out.println("Los numeros "+num2+" y "+num3+" soniguales pero mayores que "+num1);
											}else if(num1 == num3 &&  num1 > num2){
												System.out.println("Los numeros"+num1+" y "+num3+"son iguales pero mayores que "+num2);
												}else if(num1 == num2 && num1 < num3){
													System.out.print("El numero "+num3+" es mayor que "+num2+" y "+num1);
													}else if(num2 == num3 && num3 < num1){
														System.out.println("el numero "+num1+" es mayor que "+num3+" y "+num2);
														}else if(num1 == num3 &&  num1 < num2){
															System.out.println("El numero "+num2+" es mayor que "+num3+" y "+num2);
															}
	}
}

