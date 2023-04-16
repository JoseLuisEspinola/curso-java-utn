package Practicando;

public class Partido {
	private int idPartido;
	private String equipo1;
	private String equipo2;
	private int golesEquipo1;
	private int golesEquipo2;
	
	
	public Partido(int idPartido, String equipo1, String equipo2, int golesEquipo1, int golesEquipo2) {
		this.idPartido = idPartido;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.golesEquipo1 = golesEquipo1;
		this.golesEquipo2 = golesEquipo2;
	}

	
		
	// otros metodos
	public String[] getGanador() {
		String[] resultado = new String[] {"", "", " ", " ", " ", ""};
		//String resultado[] = {"", "-", "-", "-", ""};
		resultado[0] = equipo1;
		resultado[4] = equipo2;
		if (golesEquipo1 > golesEquipo2) {
			resultado[1] = "x";    // gana equipo1
		} else {
			if (golesEquipo2 > golesEquipo1) {
				resultado[3] = "x";   // gana equipo2
			} else {
				resultado[2] = "x";   // empate
				}
		}
		return resultado;
	}
	
	
	
	public int getIdPartido() {
		return this.idPartido;
	}
	
	public void setIdPartido(int idPartido) {
		this.idPartido = idPartido;
	}
		
		
	
	public String getEquipo1() {
		return this.equipo1;
	}
	
	public void setEquipo1(String equipo1) {
		this.equipo1 = equipo1;
	}
	
	
	
	public String getEquipo2() {
		return this.equipo2;
	}
	
	public void setEquipo2(String equipo2) {
		this.equipo2 = equipo2;
	}
	
	
	
	public int getGolesEquipo1() {
		return this.golesEquipo1;
	}
	
	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}
	
	
		
	public int getGolesEquipo2() {
		return this.golesEquipo2;
	}
	
	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}
	
}