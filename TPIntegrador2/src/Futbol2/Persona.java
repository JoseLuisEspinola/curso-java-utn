package Futbol2;

public class Persona {
	private int idPersona;
	private String nombre;
	
	public Persona(int idPersona, String nombre) {
		this.idPersona = idPersona;
		this.nombre = nombre;
	}

	
	public int getIdPersona() {
		return idPersona;
	}
	
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}