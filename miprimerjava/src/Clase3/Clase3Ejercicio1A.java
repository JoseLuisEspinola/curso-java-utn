package Clase3;

public class Clase3Ejercicio1A {

	public static void main(String[] args) {
		// Clase 3 - Ejercicio 1-A.
		// Busca la cantidad de apariciones de una letra, en un string

		char MiLetra    = 'a';
		String MiCadena = "La casa de la moneda en argentina";
	
		BuscarAparicionesLetra(MiCadena, MiLetra);   // llama al metodo que busca cantidad de letras iguales
    	
	}  // termina main


	public static void BuscarAparicionesLetra(String cadena, char letra) {
		int contar = 0;
	
		for(int i=0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == letra) {
				contar = contar + 1;
			}
		}
		System.out.println(contar);
	}   
}