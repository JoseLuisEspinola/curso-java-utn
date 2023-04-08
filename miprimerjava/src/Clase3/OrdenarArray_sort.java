package Clase3;

import java.util.Arrays;

public class OrdenarArray_sort {

	public static void main(String[] args) {
		//mostrar el array ordenado con sort (ascendente). ESTE LO HICE PARA PROBAR SORT

		int numeros[] = new int[] {3, 5, 1, 2, 1, 7, 0, -1};
		int[] mostrar = ordena(numeros);

		for (int n : mostrar) {
			System.out.print(n + ", ");                                                                                       
		}
	}
	

		public static int[] ordena(int[] vector) {
			
			Arrays.sort(vector);
			return vector;
	    }
				
}
