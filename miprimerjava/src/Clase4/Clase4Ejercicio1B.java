package Clase4;

import java.util.Arrays;
import java.util.Scanner;

public class Clase4Ejercicio1B {

	public static void main(String[] args) {
		// Clase 4 - Ejercicio 1-B.
		// Ordena numero en forma ascendete o descendente (1 sola letra) y los devuelve en un vector
		// Tanto los numero, como la letra es entrada por teclado
		
		Scanner teclado1 = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		Scanner teclado3 = new Scanner(System.in);
		Scanner teclado4 = new Scanner(System.in);
		
		int numero1 = 0;
		int numero2 = 0;
		int numero3 = 0;
		String orden = "";    // no le puse char, porque si el usuario ingresa mas de 1 letra, me va a dar error, y no se controlarlo a dicho error
		
		System.out.println("Ingrese el PRIMER numero:");
		numero1 = teclado1.nextInt();
		
		System.out.println("Ingrese el SEGUNDO numero:");
		numero2 = teclado2.nextInt();
		
		System.out.println("Ingrese el TERCER numero:");
		numero3 = teclado3.nextInt();
		
		System.out.println("Ahora Ingrese el a = ascendente - d = descendente:");
		orden = teclado4.nextLine();
				
		
		int numeros[] = OrdenaVector(numero1, numero2, numero3, orden);  // El ejercicio pide con UNA LETRA... "a = ascendente" o "d = descendente"
		System.out.println(Arrays.toString(numeros));
				

		
	}  // termina main
	
	public static int[] OrdenaVector(int num1, int num2, int num3, String orden) {
		
		int[] vector = new int[] {num1, num2, num3};
		
		for(int i = 0; i < vector.length; i++) {
			
			for(int j = i + 1; j < vector.length; j++) {
				
				if(orden.equals("a")) {
					if (vector[i] > vector[j]) {
						int aux = vector[i];
						vector[i] = vector[j];
						vector[j] = aux;
					}
				}  // termina el orden.equals
				else if(orden.equals("d")) {
						if (vector[i] < vector[j]) {
							int aux = vector[i];
							vector[i] = vector[j];
							vector[j] = aux;
						}   // termina if vector j
				}  // termina else
		}    // termina for j
		}// termina for i
		
		return vector;
    }   // termina OrdenaVector

}   // termina Clase4Ejercicio1B
