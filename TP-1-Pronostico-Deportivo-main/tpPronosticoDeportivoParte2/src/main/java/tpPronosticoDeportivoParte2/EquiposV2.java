package tpPronosticoDeportivoParte2;

public class EquiposV2 extends Object {

	private String nombreEquipo;
	private String descripEquipo;
	
	// Generando getters y setters
			
	public String getNombreEquipo() {
		return nombreEquipo;
	}
			public EquiposV2(String nombreEquipo) {
		super();
		
				// Auto-generated constructor stub	
		this.nombreEquipo = nombreEquipo;
		
			}
			// Considerando que se puede cambiar el nombre del equipo en algún momento...
			//  public void setNombreEquipo(String nombreEquipo) {
			//  this.nombreEquipo = nombreEquipo;
			//  }
	public String getDescripEquipo() {
		return descripEquipo;
	}
	public void setDescripEquipo(String descripEquipo) {
		this.descripEquipo = descripEquipo;
	}
	
		
}

