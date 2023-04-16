package vistas;

import java.util.Scanner;

import modelo.Agenda;
import modelo.Persona;

public class MenuConsulta {
	
	private String opcion;
	private boolean salir;
	private Agenda agenda = new Agenda();;
	
	Scanner scn = new Scanner(System.in);
		
	public void iniciarConsultas() {
		
		agenda.leerDatosPersonas();
		
		this.salir = false;
		while (!salir) {
			
			imprimirPantalla();
			
			this.opcion = scn.nextLine();
			switch (opcion) {
			case "1":
				consultarPersona();
				break;
			case "2":
				imprimirListadoPersonas();
				break;
			case "0":
				System.out.println("Ha salido de la consulta");
				this.salir = true;
                break;
             default:
                System.out.println("Error de ingreso, debe elegir una opcion valida");;
			}
		}
	}
		
	private void consultarPersona() {
		try {
			@SuppressWarnings("resource")
			Scanner scnId = new Scanner(System.in);
			System.out.println("Ingrese el Id de la persona: ");
			String ingreso = scnId.nextLine();
			int idPersona = Integer.parseInt(ingreso);
			imprimirDatosPersona(idPersona);

		} catch (Exception e) {
			System.out.println("Ingreso de Id no valido");
		}
	}
	
	private void imprimirPantalla() {
		System.out.println("====================================");
		System.out.println("|      AGENDA MENU PRINCIPAL       |");
		System.out.println("|----------------------------------|");
		System.out.println("| 1 - CONSULTA DE PERSONA POR ID   |");
		System.out.println("| 2 - LISTADO DE PERSONAS          |");
		System.out.println("| 0 - Salir de la aplicacion  	   |");
		System.out.println("====================================");
		System.out.println("Presione una de las opciones: ");
	}
	
	
	private void imprimirDatosPersona(int idPersona) {
		Persona persona = this.agenda.obtenerDatosPersona(idPersona);
		if (persona != null) {
			System.out.print("Nombre: " + persona.getNombre());
			System.out.print(" Apellido: " + persona.getApellido());
			System.out.print(" Edad: " + persona.getEdad());
			System.out.println(" Telefono: " + persona.getTelefono());
		}
	}
	
	private void imprimirListadoPersonas() {
		System.out.println("-------------------------------------");
		System.out.println(" Listado de personas agendadas");
		System.out.println("-------------------------------------");
		agenda.listarPersonasPorPantalla();
	}

}
