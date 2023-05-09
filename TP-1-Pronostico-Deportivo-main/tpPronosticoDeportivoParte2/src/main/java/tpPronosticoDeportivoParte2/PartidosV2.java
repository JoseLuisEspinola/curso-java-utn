package tpPronosticoDeportivoParte2;

public class PartidosV2 {

	private RondaV2 ronda;
	private EquiposV2 equipoN1;
	private EquiposV2 equipoN2;
	private int golesEqN1;
	private int golesEqN2;
	
		// Generando getters y setters
	
		public PartidosV2(RondaV2 ronda, EquiposV2 equipoN1, EquiposV2 equipoN2) {
			super();
			this.ronda = ronda;
			this.equipoN1 = equipoN1;
			this.equipoN2 = equipoN2;
			}
		
		public RondaV2 getRonda() {
			return ronda;
		}
		public void setRondaV2(RondaV2 ronda) {
			this.ronda = ronda;
		}
		public EquiposV2 getEquipoN1() {
		return equipoN1;
		}
	public void setEquipoN1(EquiposV2 equipoN1) {
		this.equipoN1 = equipoN1;
	}
	public EquiposV2 getEquipoN2() {
		return equipoN2;
	}
	public void setEquipoN2(EquiposV2 equipoN2) {
		this.equipoN2 = equipoN2;
	}
	public int getGolesEqN1() {
		return golesEqN1;
	}
	public void setGolesEqN1(int golesEqN1) {
		this.golesEqN1 = golesEqN1;
	}
	public int getGolesEqN2() {
		return golesEqN2;
	}
	public void setGolesEqN2(int golesEqN2) {
		this.golesEqN2 = golesEqN2;
	}
	
		public String resultado(EquiposV2 equipo) {
			if(golesEqN1 == golesEqN2) { 
				return "Empate";
			}
				// Si no es empate....
			
				if (equipo.getNombreEquipo().equals(equipoN1.getNombreEquipo())) {
					if (golesEqN1>golesEqN2) {
						return "Ganador";		
							} else {
								return "Perdedor";
							}
	
				} else {
					// Como equipo no es Equipo1, entonces es Equipo 2....
					if(golesEqN2>golesEqN1) {
						return "Ganador";
							} else {
								return "Perdedor";
					}
					} 
				}

		public void setRonda(int parseInt) {
			// TODO Auto-generated method stub
			
		}
		}
	
	
