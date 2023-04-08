package Clase7;

public abstract class Descuento {
	private float valor;
	
	
	
	
	// constructor
	public Descuento(float valor) {
		this.valor = valor;
	}
	
	
	public float getValorDesc() {
		return valor;
    }
	
	
	public void SetValorDesc(float valor) {
		this.valor = valor;	
	}
	
	
	public abstract float valorFinal (float valorInicial);  //metodo abstracto quien me herede tiene que implementarme
		
}
	
