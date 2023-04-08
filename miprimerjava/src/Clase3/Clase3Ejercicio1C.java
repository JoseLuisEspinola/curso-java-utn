package Clase3;

import java.util.Arrays;

public class Clase3Ejercicio1C {

	public static void main(String[] args) {
		// Clase 3 - Ejercicio 1-C.
		// Suma numero de un vector

		int mayor = 4;    // valor a tener como referencia para sumar
		int[] nuevoArray = new int[] {5, 1, 9, 10, 3, 8};
		
		int sumados = SumaVector(nuevoArray, mayor);
		
		System.out.print("Los valores del vector son: ");
		for(int j=0; j < nuevoArray.length; j++) {
			System.out.print(nuevoArray[j] + ", ");
		}
		
		System.out.print(" y sumando los mayores de " + mayor + ", nos da el resultado: ");
			
		System.out.println(sumados);
		
	}  // termina main
	

	public static int SumaVector(int[] vector, int mayorA) {
		
		int suma = 0;
		
		for(int i = 0; i < vector.length; i++) {
			
			if (vector[i] > mayorA) {
				suma = suma + vector[i];
		     }   // termina if
			
		}   // termina for
		
		return suma;
		
	}   // termina SumaVector
	
}   // termina Clase3Ejercicio1B
	
		
		
		
		
		

	
