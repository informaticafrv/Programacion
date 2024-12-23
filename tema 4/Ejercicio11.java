/*
 * Ejercicio11.java
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
//Escribe un programa que dada una hora determinada (horas y minutos),
//calcule los segundos que faltan para llegar a la medianoche.
import java.util.Scanner;
public class Ejercicio11 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.println("Escriba la hora: ");
		int  hora = s.nextInt();
		
		System.out.println("Escriba los minutos");
		int minutos = s.nextInt();
		
		int segundos = (minutos * 60) + (hora * 60 *60);
		int dia = 86400;
		
		if (hora < 0 && hora > 23 || minutos < 0 && minutos > 59){
			System.out.print("la hora introducida es incorrecta");
			}else{
				System.out.print("los segundos que quedan son: "+(dia - segundos)+"s");
				}
	}
}

