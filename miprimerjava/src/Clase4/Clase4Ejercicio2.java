package Clase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Clase4Ejercicio2 {
		/* 2. Haga una main donde por parametro envie la ruta de un archivo. Ese archivo debe 
		 * contener numeros. El programa debe escribir por consola la suma de esos numeros.
		 * 
		 * a. Al programa anterior agreguele un parametro para que la operacion pueda ser
		 *  suma o multiplicacion. */
		 
	public static void main(String[] args) {	 
		// args = ["../numeros.txt", "suma"]
		System.out.println(args[0]);
		String archivo = args[0];
		String operacion = args[1];
		int acumulador = 0;

		if(operacion.equals("multiplicacion")) {
			acumulador = 1;
		}
		
		try {
			for (String linea : Files.readAllLines(Paths.get(archivo))) {
				if (operacion.equals("suma")) {
					acumulador = acumulador + Integer.parseInt(linea);
				} 
				if (operacion.equals("multiplicacion")) {
						acumulador = acumulador * Integer.parseInt(linea);
				}
				if (!operacion.equals("suma") && !operacion.equals("multiplicacion")) {
					System.out.println("Debe ingresar la palabra 'suma' o 'multiplicacion'");
					break;
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(acumulador);
	}

}
