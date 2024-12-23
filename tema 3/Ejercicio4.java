/*
 * Ejercicio4.java
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
/*Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado.*/
import java.util.Scanner;
public class Ejercicio4 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println ("Introduzca el primer digito");
		int primero = s.nextInt();
		System.out.println("Introduzca el segundo digito");
		int segundo = s.nextInt();
		
		int suma = primero + segundo;
		double resta  = primero - segundo;
		int mult = primero * segundo;
		double div = primero / segundo;
		System.out.println("Estos son todos los resultados de los dos digitos:");
		System.out.println("Suma: "+suma);
		System.out.println("resta: "+resta);
		System.out.println("multiplicacion: "+mult);
		System.out.println("division: "+div);
	}
}

