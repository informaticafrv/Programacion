/*
 * Ejercicio4.java
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
public class Ejercicio4 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.println("Escriba las horas que ha trabajado: ");
		
		int horas = s.nextInt();
		int extras = (horas - 40) * 16;
		int laborables = 40 * 12;
		
		if( horas >= 53 ){
		System.out.println("numero de horas extras incorrecto");
		}
		else if (horas > 40){
			System.out.println("el salario de su semana es: "+ (extras + laborables) +" euros");
			
		}else if (horas >=0 && horas <=40) {
			System.out.println("el salario de su semana es: "+ horas * 12 +" euros");
		}
		else if( horas < 0 ){
			System.out.println("numero de horas incorrecto");
		}
	}
}
