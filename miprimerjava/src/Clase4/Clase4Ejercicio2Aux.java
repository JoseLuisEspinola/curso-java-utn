package Clase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Clase4Ejercicio2Aux {
	public static void main(String[] args) {
				
		String rutaArchivo = "C:\\Users\\Usuario\\eclipse-workspace\\miprimerjava\\src\\Clase4\\Numeros.txt";
	//	String rutaArchivo = "C:\\Users\\pc\\eclipse-workspace\\primerproyecto\\src\\Clase4\\numeros.txt";				
		
		int resultado = obtenerResultado(rutaArchivo);
				
		if (resultado > 0) {
			System.out.println("El resultado de la SUMA es: " + resultado);
		}
	}

	public static int obtenerResultado(String archivo) {			
		int resultado= 0;	
		try {
			for (String linea: Files.readAllLines(Paths.get(archivo))) {
				int num = Integer.parseInt(linea);
					resultado = resultado + num;	
			}	
						  		
		}
		catch (IOException e) {
				System.out.println(" ");
		}

		return resultado;
	}		
		
}
