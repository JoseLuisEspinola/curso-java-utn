package tpPronosticoDeportivoParte2;

import tpPronosticoDeportivoParte2.EquiposV2;
import tpPronosticoDeportivoParte2.PartidosV2;

public class PronosticoV2 {

	private ParticipanteV2 participante;
	private RondaV2 ronda;
	private PartidosV2 partido;
	private EquiposV2 equipo;
	private String resultado;
	
	// Generando el constructor...
	
	public PronosticoV2(RondaV2 ronda, PartidosV2 partido, EquiposV2 equipo, String resultado) {
		super();
		this.participante = participante;
		this.ronda = ronda;
		this.partido = partido;
		this.equipo = equipo;
		this.resultado = resultado;
	}

	// Cargando los getters..
	
	public ParticipanteV2 getParticipante() {
		return participante;
	}
	
	public RondaV2 getRonda() {
		return ronda;
	}
	
	public PartidosV2 getPartido() {
		return partido;
	}

	public EquiposV2 getEquipo() {
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
