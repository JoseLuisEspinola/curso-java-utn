package Futbol;

public class Jugador {
	private String nombre;
	private int nroCamiseta;
	private String posicion;
	private boolean esTitular;
	
	public Jugador(String nombre, int nroCamiseta, String posicion) {
		this.nombre = nombre;
		this.nroCamiseta = nroCamiseta;
		this.posicion = posicion;
		
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	
	public int getNroCamiseta() {
		return this.nroCamiseta;
	}
	
	
	public String getPosicion() {
		return this.posicion;
	}
	
	
	public boolean getEsTitular() {
		return this.esTitular;
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNroCamiseta(int nroCamiseta) {
		this.nroCamiseta = nroCamiseta;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public void setEsTitular(boolean esTitular) {
		this.esTitular = esTitular;
	}
	
	
}
