package Clase7_3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;


class TextCarrito {

	@Test
	void testCostoFinalDescuentoFijo() {
		
		Producto producto1 = new Producto("Arroz", "3423", 2000);
		Producto producto2 = new Producto("Atun", "3424", 2000);
		Producto producto3 = new Producto("Sal", "3425", 2000);

		Carrito miCarrito = new Carrito(producto1, producto2, producto3, LocalDateTime.parse("2023-01-13T11:12:00"));
		Descuento desFijo = new DescuentoFijo(2000);
		
		float valorFinal = miCarrito.costoFinal(desFijo);
		assertEquals(valorFinal, 4000);
	}

	
	@Test
	void testCostoFinalDescuentoPorcentaje() {
		Producto producto1 = new Producto("Arroz", "3423", 4000);
		Producto producto2 = new Producto("Atun", "3424", 4000);
		Producto producto3 = new Producto("Sal", "3425", 2000);

		Carrito miCarrito = new Carrito(producto1, producto2, producto3, LocalDateTime.parse("2023-01-13T11:12:00"));
		Descuento desPorcentaje = new DescuentoPorcentaje(0.50F);
		
		float valorFinal = miCarrito.costoFinal(desPorcentaje);
		assertEquals(valorFinal, 5000);
	}
	
	
	@Test
	void testCostoFinalDescuentoPorcentajeConTope() {
		Producto producto1 = new Producto("Arroz", "3423", 4000);
		Producto producto2 = new Producto("Atun", "3424", 4000);
		Producto producto3 = new Producto("Sal", "3425", 2000);

		Carrito miCarrito = new Carrito(producto1, producto2, producto3, LocalDateTime.parse("2023-01-13T11:12:00"));
		Descuento desPorcentaje = new DescuentoPorcentajeConTope(0.50F);
		desPorcentaje.setValorDesc(0.20F);
		
		float valorFinal = miCarrito.costoFinal(desPorcentaje);
		assertEquals(valorFinal, 8000);
	}
	
	
}
