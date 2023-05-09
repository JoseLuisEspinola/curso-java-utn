// Programaci�n generado por Juan Carlos Magnin
// Curso "Desarrollador JAVA Inicial" - # 150
// Trabajo de Grupo N� 13
// Integrantes: Rodolfo Medran, Silvia Acastello, Pablo Mart�n Maymo, Jos� Luis Espinola, Juan Magnin
// Abril 7, 2003. 

package Grupo13Clase150;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainTrPr {

	public static void main(String[ ] args) {
		// TODO Auto-generated method stub

			// Leer resultados
		Collection<Partidos> partidos = new ArrayList<Partidos> ( );
		
			Path pathResultados = Paths.get("C:\\Users\\juanc\\eclipse-workspace\\TP1-PronosticoDeportivo\\resultadoTest1.csv");
			
					//Se devuelve una colecci�n de lineas  C:\\Users\\juanc\\
					//List hereda y genera una colecci�n	
					
			
			List<String> lineasResultados = null;
			try {
				lineasResultados = Files.readAllLines(pathResultados);
			} catch (IOException e) {
				
				// Se interrumpe el programa si no se puede leer la l�nea...
				
				System.out.println("No se pudo leer la l�nea de resultados....");
				System.exit(1);
			} 
			boolean encabezado = true;
			for (String lineaResultado : lineasResultados) {
				if (encabezado) {
					encabezado = false;   // Aqu� se saca el encabezado...
				} else {
				
					String[ ] campos = lineaResultado.split(","); 
					Equipos equipoN1 = new Equipos(campos[0]);
					Equipos equipoN2 = new Equipos(campos[3]);
					Partidos partido = new Partidos(equipoN1,equipoN2);
					partido.setGolesEqN1(Integer.parseInt(campos[1]));
					partido.setGolesEqN2(Integer.parseInt(campos[2]));
					partidos.add(partido);		//Lista de todos los partidos...
					}
			} 
		
			// Leer pron�stico
		int puntos = 0;          // Aqu� se deben sumar los puntos de una �nica persona....
			
			Path pathPronostico = Paths.get("C:\\Users\\juanc\\eclipse-workspace\\TP1-PronosticoDeportivo\\pronosticoTest1.csv");
				
	List<String> lineasPronostico = null;
	try {
		lineasPronostico = Files.readAllLines(pathPronostico);
	} catch (IOException e) {
		
		// Se interrumpe el programa si no se puede leer la l�nea...
		
		System.out.println("No se pudo leer la l�nea de pronosticos....");
		System.exit(1);
	} 
	encabezado = true; 			    // Variable boolean ya declarada...
	for (String lineaPronostico : lineasPronostico) {
		if (encabezado) {
			encabezado = false;   	// Aqu� se saca el encabezado...
		} else {
	
			String[ ] campos = lineaPronostico.split(",");
			Equipos equipoN1 = new Equipos(campos[0]);
			Equipos equipoN2 = new Equipos(campos[4]);
			Partidos partido = null;
			
			for(Partidos partidoCol : partidos) { 
				if(partidoCol.getEquipoN1().getNombreEquipo(
						).equals(equipoN1.getNombreEquipo()) 
						&& partidoCol.getEquipoN2().getNombreEquipo(
								).equals(equipoN2.getNombreEquipo())) {
					
					partido  = partidoCol;				// Se busca coincidencia de equipos entre partidos y pron�stico....
				}
			}
					// Definiendo por equipo si gana, empata o pierde....
			
			Equipos equipo = null;
			String resultado = null;
			if("X".equals(campos[1])) {
				equipo = equipoN1;
				resultado = "Ganador";
			}
			if("X".equals(campos[2])) {
				equipo = equipoN1;
				resultado = "Empate";
			}
			if("X".equals(campos[3])) {
				equipo = equipoN1;
				resultado = "Perdedor";
			}
			
			Pronostico pronostico = new Pronostico(partido, equipo, resultado);
			
				// Sumar los puntos acertados....
			
			puntos += pronostico.puntos( );
			
	}
	}
	// Finalmente, se muestran los puntos del usuario por consola....
					System.out.println("Los puntos obtenidos por el usuario son: " + puntos);
	}
}
