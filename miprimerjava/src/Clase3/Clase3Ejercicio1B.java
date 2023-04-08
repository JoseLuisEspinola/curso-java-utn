package Clase3;

import java.util.Arrays;

public class Clase3Ejercicio1B {

	public static void main(String[] args) {
		// Clase 3 - Ejercicio 1-B.
		// Ordena numero en forma ascendete o descendente y los devuelve en un vector

		int numeros[] = OrdenaVector(5, 1, 9, "asc");  // "asc" o "des"
		System.out.println(Arrays.toString(numeros));
		
	}  // termina main
	

	public static int[] OrdenaVector(int num1, int num2, int num3, String orden) {
		
		int[] vector = new int[] {num1, num2, num3};
		
		for(int i = 0; i < vector.length; i++) {
			
			for(int j = i + 1; j < vector.length; j++) {
				
				if (orden.equals("asc")) {
				
					if (vector[i] > vector[j]) {
						int aux = vector[i];
						vector[i] = vector[j];
						vector[j] = aux;
					}
				}  // termina el orden.equals
				else if(orden.equals("des")) {
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

}   // termina Clase3Ejercicio1B
