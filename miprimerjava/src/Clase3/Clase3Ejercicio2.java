package Clase3;

public class Clase3Ejercicio2 {

	public static void main(String[] args) {
		
		int desplazar = 1;
		String palabra = "holis te quiero";
		String palabraCodificada = codificar(palabra, desplazar);
		String palabraDecodificada = decodificar(palabraCodificada, desplazar);
		
		System.out.println(palabra);
		System.out.println("");
		System.out.println("CODIFICADO:");
		System.out.println(palabraCodificada);
		System.out.println("");
		System.out.println("DECODIFICADO:");
		System.out.println(palabraDecodificada);
	}

	
	public static String codificar(String palabra, int desplazamiento) {
		String nueva = "";
		for(int i = 0; i < palabra.length(); i++) {
			nueva = nueva + sigienteCaracter(palabra.charAt(i), desplazamiento);
		}
		return nueva;
	}	
	
	

	public static String decodificar(String palabra, int desplazamiento) {
		String nueva = "";
		for(int i = 0; i < palabra.length(); i++) {
			nueva = nueva + sigienteCaracter(palabra.charAt(i), (-desplazamiento));
		}
		return nueva;
	}


	public static char sigienteCaracter(char caracter, int desplazamiento) {
		String abc = "abcdefghijklmnñopqrstuvwxyz";
		char letra = ' ';
		int posicion = 0;
		
		for(int i = 0; i < abc.length(); i++) {
			if (abc.charAt(i) == caracter) {
				posicion = i + desplazamiento;
				letra = abc.charAt(posicion);
			}
		}
		return letra;
	}
}
