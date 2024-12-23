/*
 * Ejercicio6.java
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


public class Ejercicio5 {
	
	public static void main (String[] args) {
		String rojo =  "\033[31m";
		String verde = "\033[32m";
		String naranja = "\033[33m";
		String azul = "\033[34m";
		String morado = "\033[35m";
		String blanco = "\033[37m";
		String reset = "\033[0m";
		
		System.out.println("\t\t Lunes \t Martes \t Miercoles \t Jueves \t Viernes");
		System.out.println("8:00/9:00 " + rojo + "\t prog" + verde + " \t leng mrc" + morado + " \t FOL" + rojo + " \t\t prog" + rojo + " \t\t prog" + reset);
		System.out.println("9:00/10:00 " + rojo + "\t prog" + verde + " \t leng mrc" + azul + " \t BD" + rojo + " \t\t prog" + rojo + " \t\t prog" + reset);
		System.out.println("10:00/11:00 " + azul + "\t BD" + verde + " \t leng mrc" + azul + " \t BD" + verde + " \t\t prog" + rojo + " \t\t prog" + reset);
		System.out.println("11:00/11:30 \t libre \t libre \t\t libre \t\t libre \t\t libre");
		System.out.println("11:30/12:30 " + naranja + "\t ent" + morado + " \t FOL" + azul + " \t\t sos" + azul + " \t\t sis inf" + azul + " \t BD" + reset);
		System.out.println("12:30/13:30 " + naranja + "\t ent" + morado + " \t FOL" + azul + " \t\t sis inf" + azul + " \t sis inf" + verde + " \t BD" + reset);
		System.out.println("13:30/14:30 " + naranja + "\t ent" + naranja + " \t digi" + azul + " \t\t sis inf" + azul + " \t sis inf" + verde + " \t BD" + reset);
	}
}

