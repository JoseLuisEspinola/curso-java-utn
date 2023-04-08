package FutbolEntrega1;

public class Equipo {
	private int idEquipo;
	private String[] nombre = new String[] {"Argentina", "Arabia Saudito", "Polonia", "Mexico"};
	private String descripcion;
		
	public Equipo(int idEquipo, String[] nombre, String descripcion) {
		this.idEquipo    = idEquipo;
		this.nombre      = nombre;
		this.descripcion = descripcion;
	}
	
	
	public int getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}

	public String[] getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String[] nombre) {
		this.nombre = nombre;
	}
		
	public String geDescripcion() {
		return this.descripcion;
	}
	
	public void setDescripicion(String descripcion) {
		this.descripcion = descripcion;
	}

	

	
}
