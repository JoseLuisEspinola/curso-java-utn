package Grupo13Clase150;

public class Pronostico {

	private Partidos partido;
	private Equipos equipo;
	private String resultado;
	
	// Generando el constructor...
	
	public Pronostico(Partidos partido, Equipos equipo, String resultado) {
		super();
		this.partido = partido;
		this.equipo = equipo;
		this.resultado = resultado;
	}

	// Cargando los getters..
	
	public Partidos getPartido() {
		return partido;
	}

	public Equipos getEquipo() {
		return equipo;
	}

	public String getResultado() {
		return resultado;
	}
	
	public int puntos( )  {
		String resultadoReal = partido.resultado(equipo);   // resultadoReal es el del partido real...
		if (resultado.equals(resultadoReal)) { 
			return 1;
		} else {
		return 0;
		}
	}
	
}
