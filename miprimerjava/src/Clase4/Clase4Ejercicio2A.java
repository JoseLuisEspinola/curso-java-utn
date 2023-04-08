package Clase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Clase4Ejercicio2A {
	
	public static void main(String[] args) {
		
		String rutaArchivo = "C:\\Users\\Usuario\\eclipse-workspace\\miprimerjava\\src\\Clase4\\Numeros.txt";
		String operacion = "multiplicacion";
		
		int resultado = obtenerResultado(rutaArchivo, operacion);
		
		if (resultado > 0) {
			System.out.println("El resultado de la operacion " + operacion + " es: " + resultado);
		} else {
			System.out.println("El txt esta vacio, o no se pudo leer dicho archivo, ya que el resultado es: " + resultado);
		}
		
	}


	public static int obtenerResultado(String archivo, String operacion) {			
		int resultado= 0;	
		try {
			if (operacion.equals("multiplicacion")) {
				resultado = 1; 
				for (String linea: Files.readAllLines(Paths.get(archivo))) {
					int num = Integer.parseInt(linea);
						resultado = resultado * num;	
			        }	
				} else 
					   for (String linea: Files.readAllLines(Paths.get(archivo))) {
							int num = Integer.parseInt(linea);							
							resultado = resultado + num;
					   }
				  		
		}
		catch (IOException e) {
				System.out.println("Debe tener algun error en la declaracion");
		}

		return resultado;
	}
}
