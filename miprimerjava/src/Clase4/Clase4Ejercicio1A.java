package Clase4;

import java.util.Arrays;

public class Clase4Ejercicio1A {

	public static void main(String[] args) {
		// C:\Users\Usuario\eclipse-workspace\miprimerjava\src\Clase4
		// abrir terminal nueva
		// ir a la ubicacion de la clase
		// compilar el archivo .java
		// ejecutar la clase y el metodo main con los argumentos que yo quiera
		// System.out.println(Arrays.toString(args));
		// System.out.println(Arrays.toString(args));
		
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int n3 = Integer.parseInt(args[2]);
		String orden = (args[3]);
				
		System.out.println(Arrays.toString(OrdenaVector(n1, n2, n3, orden)));
		
		

	}
	
	
	public static int[] OrdenaVector(int num1, int num2, int num3, String orden) {
		
		int[] vector = new int[] {num1, num2, num3};
		
		for(int i = 0; i < vector.length; i++) {
			
			for(int j = i + 1; j < vector.length; j++) {
				
				if (orden.equals("a")) {
				
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

}
