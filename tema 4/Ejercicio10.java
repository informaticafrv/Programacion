/*
 * Ejercicio10.java
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
public class Ejercicio10 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.println("Escriba su mes de nacimiento:\n1.Enero 2.Febrero 3.Marzo 4.Abril 5.Mayo 6.Junio 7.Julio 8.Agosto 9.Septiembre 10.Octubre 11.Noviembre 12.Diciembre");
		int mes = s.nextInt();
		
		System.out.println("Escriba su dia de nacimiento");
		int dia = s.nextInt();
		
		switch (mes){
			case 1:
			if(dia <= 0 && dia >=31){
				System.out.println("no se puede nacer antes del dia 1 ni despues del 31");
				}else if(dia >=1 && dia <=19){
					System.out.println("Tu signo es Capricornio");
					}else{
						System.out.print("Tu signo es Piscis");
					}
					break;
			case 2:
			if(dia <= 0 && dia >=31){
				System.out.println("no se puede nacer antes del dia 1 ni después del 27");
				}else if(dia >=1 && dia <=18){
					System.out.print("Tu signo es Acuario");
					}else{
						System.out.println("Tu signo es Piscis");
					}
					break;
			case 3:
			if(dia <= 0 && dia >=31){
				System.out.println("no se puede nacer antes del dia 1 ni después del 31");
			    }else if(dia >=1 && dia <=20){
				    System.out.println("tu signo es Piscis");
				    }else{
						System.out.println("tu signo es Aries");
						}
						break;
			case 4:
			if(dia <= 0 && dia >=31){
				System.out.println("no se puede nacer antes del dia 1 ni después del 31");
			    }else if(dia >=1 && dia <=19){
					System.out.print("tu signo es Aries");
					}else{
						System.out.println("tu signo es Tauro");
						}
						break;
			case 5:
			if(dia <= 0 && dia >=31){
				System.out.println("no se puede nacer antes del dia 1 ni después del 31");
			    }else if(dia >=1 && dia <=20){
					System.out.println("tu signo es Tauro");
					}else{
						System.out.print("tu signo es Geminis");
						}
						break;
			case 6:
			if(dia <= 0 && dia >=31){
				System.out.println("no se puede nacer antes del dia 1 ni después del 31");
			    }else if(dia >=1 && dia <=20){
					System.out.println("tu signo es Geminis");
					}else{
						System.out.println("tu signo es Cancer");
						}
						break;
			case 7:
			if(dia <= 0 && dia >=31){
				System.out.println("no se puede nacer antes del dia 1 ni después del 31");
			    }else if(dia >=1 && dia <=22){
					System.out.print("tu signo es Cancer");
					}else{
						System.out.print("tu signo es Leo");
						}
						break;
			case 8:
			if(dia <= 0 && dia >=31){
				System.out.println("no se puede nacer antes del dia 1 ni después del 31");
			    }else if(dia >=1 && dia <=22){
					System.out.print("tu signo es Leo");
					}else{
						System.out.print("tu signo es Virgo");
						}
						break;
			case 9:
			if(dia <= 0 && dia >=31){
				System.out.println("no se puede nacer antes del dia 1 ni después del 31");
			    }else if(dia >=1 && dia <=22){
					System.out.println("tu signo es Virgo");
					}else{
						System.out.println("tu signo es Libra");
						}
						break;
			case 10:
			if(dia <= 0 && dia >=31){
				System.out.println("no se puede nacer antes del dia 1 ni después del 31");
			    }else if(dia >=1 && dia <=22){
					System.out.println("tu signo es Libra");
					}else{
						System.out.println("tu signo es Escorpio");
						}
						break;
			case 11:
			if(dia <= 0 && dia >=31){
				System.out.println("no se puede nacer antes del dia 1 ni después del 31");
				}else if(dia >=1 && dia <=21){
					System.out.println("tu signo es Escorpio");
					}else{
						System.out.println("tu signo es Sagitario");
						}
						break;
			case 12:
			if(dia <= 0 && dia >=31){
				System.out.println("no se puede nacer antes del dia 1 ni después del 31");
				}else if(dia>=1 && dia <=21){
					System.out.println("tu signo es Sagitario");
					}else{
						System.out.println("tu signo es Capricornio");
						}
						break;
					}
	}
}

