package Clase7_3;

public class DescuentoPorcentajeConTope extends DescuentoPorcentaje{

	 private float tope;
	
	// constructor
	public DescuentoPorcentajeConTope(float tope) {
		super(0);
		this.tope = tope;
	}

	
	public float getTope() {
		return this.tope;
	}
	
	public void setTope(float nuevoValor) {
		this.tope = nuevoValor;
	}
	
	
	@Override
	public void setValorDesc(float valor) {
		if(valor > this.tope) {
			super.setValorDesc(0);
			System.out.println("No se puede poner ESE valor, porque supero el TOPE...");
		} else {
			super.setValorDesc(valor);
		}
	}
	
//	public float getValorDesc() 
//	public void SetValorDesc(float valor)
//	public float valorFinal(float valorInicial)
	
}
