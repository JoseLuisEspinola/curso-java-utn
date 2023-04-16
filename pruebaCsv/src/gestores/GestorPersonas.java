package gestores;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import modelo.Persona;

/**
 * Esta clase se va a encargar de leer desde un arhivo csv los datos de personas
 * y almacenaralos en un HashMap
 * 
 */
public class GestorPersonas {
	
	private HashMap<Integer, Persona> personas = new HashMap<Integer, Persona>();
	private Persona persona;
	
	public HashMap<Integer, Persona> cargarPersonasDesdeArchivo(String path) {
		
		System.out.println("-------------------------------------");
		System.out.println("Cargando datos del archivo: " + path);
		System.out.println("-------------------------------------");
		try {
			FileReader filePersonas = new FileReader(path);
			BufferedReader brPersonas = new BufferedReader(filePersonas);
			String unaPersona = brPersonas.readLine();	
			while (unaPersona != null) {

				persona = getDatosPersona(unaPersona);
				if (persona != null) {
					personas.put(persona.getIdPersona(), persona);
				}
				unaPersona = brPersonas.readLine();
			}
			brPersonas.close();
		} catch (IOException e) {
			System.out.println("Error al leer un archivo: " + path);
		} 
		return this.personas;

	}

	/**
	 * Validacion y parseo de los datos
	 * 
	 * Metodo privado de la clase Se pasa por parametro un String que representa
	 * todos los datos de una persona, lo convierte y devuelve una Persona En
	 * caso de inconsistencia con los datos devuelve un null
	 * 
	 */

	private Persona getDatosPersona(String unaPersona) {
		String[] datosPersona = unaPersona.split(",");
		Persona persona;
		try {
			int idPersona = Integer.parseInt(datosPersona[0]);
			String nombre = datosPersona[1];
			String apellido = datosPersona[2];
			int edad = Integer.parseInt(datosPersona[3]);
			String telefono = datosPersona[4];
			
			persona = new Persona(idPersona, nombre, apellido, edad, telefono);
			
		} catch (Exception e) {
			System.out.println("Entrada de datos no valida, error en la linea: " + unaPersona);
			persona = null;
		}
		return persona;
		
	}

	
}
