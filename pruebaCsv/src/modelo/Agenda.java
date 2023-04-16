package modelo;

import java.util.HashMap;

import gestores.GestorPersonas;

public class Agenda {
	
	private HashMap<Integer, Persona> listaPersonas = new HashMap<Integer, Persona>();
	
	
	/**
	 * Lee el archivo csv y guarda los datos parseados en el HashMap
	 */
	public void leerDatosPersonas() {
		try {
			GestorPersonas gsPersonas = new GestorPersonas();
			String pathPersona = "archivos/personas.csv";
			
			this.listaPersonas = gsPersonas.cargarPersonasDesdeArchivo(pathPersona);	
		} catch (Exception e) {
			System.out.println("Error al obtener la lista de personas");
		}
	
	}
	
	public Persona obtenerDatosPersona(int idPersona) {
		return listaPersonas.get(idPersona);
	}
	
	public void listarPersonasPorPantalla() {
		for (Integer clave: listaPersonas.keySet()) {
			Persona p = listaPersonas.get(clave);
			System.out.println("ID: " + p.getIdPersona() 
					+ " Nombre: " + p.getNombre() 
					+ " Apellido: " + p.getApellido()
					+ " Edad: " + p.getEdad()
					+ " Telefono: " + p.getTelefono());
			}
	}
	
}
