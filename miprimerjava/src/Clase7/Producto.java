package Clase7;

public class Producto {
	private String nombre;
	private String codigo;
	private float precio;

	public Producto(String nombre, String codigo, float precio) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
	
	}


	// get y set Nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;
	}

	
	// get y set codigo	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String nuevoCodigo) {
		this.codigo = nuevoCodigo;
	}

	
	// get y set precio
	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float nuevoPrecio) {
		this.precio = nuevoPrecio;
	}
	
	
	// otros metodos
	public float costoFinal() {
		return this.precio;
	}

	
}
