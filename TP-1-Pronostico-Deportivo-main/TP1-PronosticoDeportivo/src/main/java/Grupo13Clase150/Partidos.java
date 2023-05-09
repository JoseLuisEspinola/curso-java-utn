package Grupo13Clase150;

public class Partidos {

	private Equipos equipoN1;
	private Equipos equipoN2;
	private int golesEqN1;
	private int golesEqN2;
	
		// Generando getters y setters
	
		public Partidos(Equipos equipoN1, Equipos equipoN2) {
			super();
			this.equipoN1 = equipoN1;
			this.equipoN2 = equipoN2;
			}
		
	public Equipos getEquipoN1() {
		return equipoN1;
		}
	public void setEquipoN1(Equipos equipoN1) {
		this.equipoN1 = equipoN1;
	}
	public Equipos getEquipoN2() {
		return equipoN2;
	}
	public void setEquipoN2(Equipos equipoN2) {
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
	
		public String resultado(Equipos equipo) {
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

		}
	
	
