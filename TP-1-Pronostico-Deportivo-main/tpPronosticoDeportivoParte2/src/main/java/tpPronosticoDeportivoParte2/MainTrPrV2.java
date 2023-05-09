// Programaci�n generado por Juan Carlos Magnin
// Curso "Desarrollador JAVA Inicial" - # 150
// Trabajo de Grupo N� 13
// Integrantes: Rodolfo Medran, Silvia Acastello, Pablo Mart�n Maymo, Jos� Luis Espinola, Juan Magnin
// Versi�n 2 (entrega 2) - Abril 17, 2003. 


package tpPronosticoDeportivoParte2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import tpPronosticoDeportivoParte2.ParticipanteV2;
import tpPronosticoDeportivoParte2.RondaV2;
import tpPronosticoDeportivoParte2.EquiposV2;
import tpPronosticoDeportivoParte2.PartidosV2;
import tpPronosticoDeportivoParte2.PronosticoV2;

public class MainTrPrV2 {

	public static void main(String[ ] args) {
		// TODO Auto-generated method stub

			// Leer resultados
		Collection<PartidosV2> partidos = new ArrayList<PartidosV2> ( );
		
			Path pathResultados = Paths.get("C:\\Users\\Usuario\\eclipse-workspace\\TP-1-Pronostico-Deportivo-main\\tpPronosticoDeportivoParte2\\resultadoTest2.csv");
			                                
			
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
					RondaV2 ronda = new RondaV2(campos[0]);
					EquiposV2 equipoN1 = new EquiposV2(campos[1]);
					EquiposV2 equipoN2 = new EquiposV2(campos[4]);
					PartidosV2 partido = new PartidosV2(ronda,equipoN1,equipoN2);
					partido.setRonda(Integer.parseInt(campos[0]));
					partido.setGolesEqN1(Integer.parseInt(campos[2]));
					partido.setGolesEqN2(Integer.parseInt(campos[3]));
					partidos.add(partido);		//Lista de todos los partidos y rondas...
					}
			} 
		
			// Leer pron�stico
		int puntos = 0;          // Aqu� se deben sumar los puntos de una �nica persona....
			
			Path pathPronostico = Paths.get("C:\\Users\\Usuario\\eclipse-workspace\\TP-1-Pronostico-Deportivo-main\\tpPronosticoDeportivoParte2\\pronosticoTest2.csv");
				
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
			ParticipanteV2 participante = new ParticipanteV2(campos[0]);
			RondaV2 ronda = new RondaV2(campos[1]);
			EquiposV2 equipoN1 = new EquiposV2(campos[2]);
			EquiposV2 equipoN2 = new EquiposV2(campos[6]);
			PartidosV2 partido = null;
			
			for(PartidosV2 partidoCol : partidos) { 
				if(partidoCol.getRonda().getRonda(
						).equals(ronda.getRondaV2())				
				&&partidoCol.getEquipoN1().getNombreEquipo(
						).equals(equipoN1.getNombreEquipo()) 
				&& partidoCol.getEquipoN2().getNombreEquipo(
								).equals(equipoN2.getNombreEquipo())) {
					
					partido  = partidoCol;				// Se busca coincidencia de equipos entre rondas, partidos y pron�stico....
				}
			}
					// Definiendo por equipo si gana, empata o pierde....
			
			EquiposV2 equipo = null;
			String resultado = null;
			if("X".equals(campos[3])) {
				equipo = equipoN1;
				resultado = "Ganador";
			}
			if("X".equals(campos[4])) {
				equipo = equipoN1;
				resultado = "Empate";
			}
			if("X".equals(campos[5])) {
				equipo = equipoN1;
				resultado = "Perdedor";
			}
			
			PronosticoV2 pronostico = new PronosticoV2(ronda, partido, equipo, resultado);
			
				// Sumar los puntos acertados....
			
			puntos += pronostico.puntos( );
			
	}
	}
	// Finalmente, se muestran los puntos del usuario por consola....
					System.out.println("Los puntos obtenidos por el usuario son: " + puntos);
	}
}
