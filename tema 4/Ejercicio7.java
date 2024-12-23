/*
 * Ejercicio7.java
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
public class Ejercicio7 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.println("Escriba su nota del primer examen: ");
		double  primera = s.nextDouble();
		
		System.out.println("Escriba su segunda nota: ");
		double segunda = s.nextDouble();
		
		System.out.println("Escriba su tercera nota: ");
		double tercera = s.nextDouble(); 
		
		double media = (primera + segunda + tercera) / 3;
		
		if (primera < 0){
			System.out.println("La primera nota es incorrecta");
			}else if(segunda < 0){
				System.out.println("La segunda nota es incorrecta");
				}else if(tercera < 0){
					System.out.print("La tercera nota es incorrecta");
					}
		if (media >= 0 && media <= 4){
			System.out.println("su nota media es: "+media+" ,insuficiente");
			}else if (media >=5 && media <= 6){
				System.out.println("su nota media es: "+media+" ,suficiente");
				}else if (media >= 7 && media <= 8){
					System.out.print("su nota media es: "+media+" ,bien");
					}else if (media >= 9 && media <= 10){
						System.out.print("su nota media es: "+media+", sobresaliente");
						}
	}
}

