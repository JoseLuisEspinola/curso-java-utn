package Clase6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class CalculadoraTest {

	@Test
	void sumarTest() {
		double resultado = Clase6Calculadora.sumar(2, 2);
		assertEquals(resultado, 4);
	}
	
	
	@Test
	void restarTest() {
		double resultado = Clase6Calculadora.restar(4, 2);
		assertEquals(resultado, 2);
	}
	
	
	@Test
	void multiplicarTest() {
		double resultado = Clase6Calculadora.multiplicar(4, 4);
		assertEquals(resultado, 16);
	}
	
	
	@Test
	void dividirTest() {
		double resultado = Clase6Calculadora.dividir(3, 3);
		assertEquals(resultado, 1);
	}
	
}
