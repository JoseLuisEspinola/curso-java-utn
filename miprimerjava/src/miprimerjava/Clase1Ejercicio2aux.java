package miprimerjava;

import java.util.Scanner;

public class Clase1Ejercicio2aux {

	public static void main(String[] args) {

		/* categoria    ingresos            vehiculos    inmuebles
	       		A        <= 163539             <= 1         <= 1
	       		B     163539 - 572386.50       <= 1         <= 2
  	   	   		C       > 572386.50            3 o +        3 o +

		prodria haberlo hecho con IF anidados, pero por ser el primero, no queria equivocarme
		 */

		Scanner teclado1 = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		Scanner teclado3 = new Scanner(System.in);

		int ingresos = 0;
		int vehiculos = 0;
		int inmuebles = 0;

		System.out.print("Introduzca INGRESO Mensual: ");
		ingresos = teclado1.nextInt();

		System.out.print("Introduzca cantidad de VEHICULOS: ");
		vehiculos = teclado2.nextInt();

		System.out.print("Introduzca cantidad de INMUEBLES: ");
		inmuebles = teclado3.nextInt();

		boolean catA = (ingresos <= 16539) && (vehiculos <= 1) && (inmuebles <= 1);
		boolean catB = (ingresos > 16539 && ingresos <= 572386.50) && (vehiculos <= 1) && (inmuebles <= 2);
		boolean catC = (ingresos > 572386.50) && (vehiculos >= 3) && (inmuebles >= 3);

		if (catA) {
			System.out.println("Pertenece a la categoria A");
		}

		if(catB) {
			System.out.println("Pertenece a la categoria B");
		}

		if(catC) {
			System.out.print("Pertenece a la categoria C");
		}

		if(!catA && !catB && !catC) {
			System.out.println("No pertenece a ninguna categoria");
		}

	}
}
