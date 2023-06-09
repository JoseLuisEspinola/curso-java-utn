package Clase7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;

public class Inicio {

	public static void main(String[] args) {
		String archivoEntrada = "compras.txt";
		
		try {
			List<String> lista = Files.readAllLines(Paths.get(archivoEntrada));
			String[] datosProducto1 = lista.get(1).split(" "); // 40 jabon 123f .split(" ") == [40 jabon 123f]
			String[] datosProducto2 = lista.get(2).split(" ");
			String[] datosProducto3 = lista.get(3).split(" ");
			
			
			Producto producto1 = new Producto(datosProducto1[1], datosProducto1[2], Float.parseFloat(datosProducto1[0]));
			Producto producto2 = new Producto(datosProducto2[1], datosProducto2[2], Float.parseFloat(datosProducto2[0]));
			Producto producto3 = new Producto(datosProducto3[1], datosProducto3[2], Float.parseFloat(datosProducto3[0]));
			
			Carrito carrito = new Carrito(producto1, producto2, producto3, LocalDateTime.parse("2023-01-13T11:12:00"));
			
			Persona persona1 = new Persona("Fernando", "Torres", LocalDateTime.parse("1980-03-13T11:12:00"), carrito);                               //("1980-03-13T11:12:00"), carrito);
			
			
			Carrito miCarrito = persona1.getCarrito();  // Estas 2 lineas, son suplantadas
			
			Descuento desFijo = new DescuentoFijo(100);
			
			Descuento desPorcentaje = new DescuentoPorcentaje(0.1f);
			
			float resultado = miCarrito.costoFinal(desPorcentaje);   // por la linea siguiente que empieza con el float
			
			
			
			
			//float resultado = persona1.getCarrito().costoFinal();  // esta sola linea, reemplaza a las 2 anteriores
			System.out.println("El costo TOTAL del carrito es de: " + resultado);
			
			System.out.println(" ");
			
			System.out.println("La persona que hizo la compra es " + persona1.getApellido() +" " + persona1.getNombre() + ", que tiene " + persona1.edad() + " años.");
			
			
					}catch(IOException e) {        // comienza la excepcion
			System.out.println("Hubo un error en la operacion...");
		}

	
	}
}
