package Clase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Clase4Ejercicio3 {

	public static void main(String[] args) {
		
		String operacion          = "codificar";
		int desplazamiento        = 2;
		String archivoEntrada     = "PALABRASOK.txt";             // este y el siguiente renglon son para "codificar"
		String archivoSalida      = "PALABRASCODIFICADAS.txt";
		
		//String archivoEntrada     = "PALABRASCODIFICADAS.txt";  // este y el siguiente renglos son para "decodificar"
		//String archivoSalida      = "PALABRASOK.txt";
		
		String resultado          = "";
		String resultadoOperacion = "la operacion fue exitosa";
				
		try {
			for(String linea : Files.readAllLines(Paths.get(archivoEntrada))) {
				if(operacion.equals("codificar")) {
					resultado = resultado + codificar(linea, desplazamiento);
				}
				else if(operacion.equals("decodificar")) {
					resultado = resultado + decodificar(linea, desplazamiento);
				}
			}
			Files.writeString(Paths.get(archivoSalida), resultado);
			
		} catch(IOException e)  {
			resultadoOperacion = "Hubo un error en la operacion";
		}
		
		System.out.println(resultadoOperacion);    
	}  // termino el main

	
	
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
