/*
 * Aprende-Java-con-Ejercicios.pdf
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
 /*Realiza un programa que pida dos números y que luego muestre el resultado
 de su multiplicación.*/
	import java.util.Scanner;

	public class Ejercicio1 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println ("Escriba el primer digito ");
		 int primero = s.nextInt();
		 System.out.println ("escriba el segundo digito ");
		 int segundo = s.nextInt();
		 int resultado = primero * segundo;
		 System.out.println ("El resultado de la multiplicacion es: " + resultado);
	}
}

