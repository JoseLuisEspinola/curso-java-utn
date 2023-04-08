package FutbolEntrega1;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Principal {

	public static void main(String[] args) {
		String archivoResultado  = "carpetaresultado\\resultados.txt";        // YO interprete que habia que poner los archivos en rutas diferentes: carpetaresultado
		String archivoPronostico = "carpetapronostico\\pronosticos.txt";      // YO interprete que habia que poner los archivos en rutas diferentes: carpetapronostico
		int sumaPuntos = 0;
		
		// Envio el nombre de la UNICA persona de este pronostico
		Persona persona = new Persona("JOSE LUIS");
		System.out.println("La persona que hizo este pronostico es: " + persona.getNombre());
		System.out.println("\n");
		
		try {
			List<String> listaResultado  = Files.readAllLines(Paths.get(archivoResultado));
			List<String> listaPronostico = Files.readAllLines(Paths.get(archivoPronostico));
			
			String[] equipo1Resultado = listaResultado.get(0).split(" "); // Cabecera: Equipo1 Cant.Goles1 Cant.Goles2 Equipo
			String[] equipo2Resultado = listaResultado.get(1).split(" "); // Fila 1:   Argentina 1 2 ArabiaSaudita
			String[] equipo3Resultado = listaResultado.get(2).split(" "); // Fila 2:   Polonia 0 0 Mexico
			
			String[] equipo1Pronostico = listaPronostico.get(0).split(" ");  // Cabecera: Equipo1 Gana1 Empata Gana2 Equipo2
			String[] equipo2Pronostico = listaPronostico.get(1).split(" ");  // Fila 1:   Argentina x - - ArabiaSaudita
			String[] equipo3Pronostico = listaPronostico.get(2).split(" ");  // Fila 2:   Polonia - x - Mexico

			// paso los parametros a la clase Partido
			Partido resultadoPartido1 = new Partido(1, equipo2Resultado[0], equipo2Resultado[3], Integer.parseInt(equipo2Resultado[1]), Integer.parseInt(equipo2Resultado[2]));
			Partido resultadoPartido2 = new Partido(2, equipo3Resultado[0], equipo3Resultado[3], Integer.parseInt(equipo3Resultado[1]), Integer.parseInt(equipo3Resultado[2]));
			
			// paso los parametros a la clase Pronostico
			Pronostico pronosticoPartido1 = new Pronostico(1, equipo2Pronostico[0], equipo2Pronostico[1], equipo2Pronostico[2], equipo2Pronostico[3], equipo2Pronostico[4]);
			Pronostico pronosticoPartido2 = new Pronostico(2, equipo3Pronostico[0], equipo3Pronostico[1], equipo3Pronostico[2], equipo3Pronostico[3], equipo3Pronostico[4]);
			
			
			//Con estas dos lines, muestro titulo de columnas
			System.out.println("ARCHIVO RESULTADO");
			System.out.println(equipo1Resultado[0] + "  " + equipo1Resultado[1] + "  " + equipo1Resultado[2] + "  " + equipo1Resultado[3]);
			System.out.println(resultadoPartido1.getEquipo1() + "     "+ resultadoPartido1.getGolesEquipo1() + "            " + resultadoPartido1.getGolesEquipo2() + "       " + resultadoPartido1.getEquipo2() + "        = Partido:" + resultadoPartido1.getIdPartido());
			System.out.println(resultadoPartido2.getEquipo1() + "       "+ resultadoPartido2.getGolesEquipo1() + "            " + resultadoPartido2.getGolesEquipo2() + "       " + resultadoPartido2.getEquipo2() + "               = Partido:" + resultadoPartido2.getIdPartido());
			
			System.out.println("\n");
						
			System.out.println("ARCHIVO PRONOSTICO");
			System.out.println(equipo1Pronostico[0] + "  " + equipo1Pronostico[1] + "  " + equipo1Pronostico[2] + "  " + equipo1Pronostico[3] + " " + equipo1Pronostico[4]);
			System.out.println(pronosticoPartido1.getEquipo1() + "  "+ pronosticoPartido1.getGana1() + "      " + pronosticoPartido1.getEmpate() + "       " + pronosticoPartido1.getGana2() + "   " + pronosticoPartido1.getEquipo2() + "       = Partido:" + resultadoPartido1.getIdPartido());
			System.out.println(pronosticoPartido2.getEquipo1() + "    "+ pronosticoPartido2.getGana1() + "      " + pronosticoPartido2.getEmpate() + "       " + pronosticoPartido2.getGana2() + "   " + pronosticoPartido2.getEquipo2() + "              = Partido:" + resultadoPartido2.getIdPartido());
			
			System.out.println("");
			String[] resulPartido1 = resultadoPartido1.getGanador();
			String[] resulPartido2 = resultadoPartido2.getGanador();

			//Las 2 siguientes lineas las utilice para ver si podia ver correctamente el ARCHIVO RESULTADO REAL, con "x" e "-"
			//System.out.println("Partido 1 RESULTADO: " + resulPartido1[0] + " " + resulPartido1[1] + " " + resulPartido1[2] + " " + resulPartido1[3] + " " + resulPartido1[4]);
			//System.out.println("Partido 2 RESULTADO: " + resulPartido2[0] + "   " + resulPartido2[1] + " " + resulPartido2[2] + " " + resulPartido2[3] + " " + resulPartido2[4]);
			
			
			// **************************************************
			// para sumar puntos del partido 1
			// **************************************************
			if(resulPartido1[1] == "x") {
				if(Objects.equals(resulPartido1[1], pronosticoPartido1.getGana1())) {
					sumaPuntos = sumaPuntos + 1;
				} 
			}
			

			if(resulPartido1[2] == "x") {
				if(Objects.equals(resulPartido1[2], pronosticoPartido1.getEmpate())) {
					sumaPuntos = sumaPuntos + 1;
				} 
			}
			
			
			if(resulPartido1[3] == "x") {
				if(Objects.equals(resulPartido1[3], pronosticoPartido1.getGana2())) {
					sumaPuntos = sumaPuntos + 1;
				} 
			}
			
			
			// **************************************************
			// para sumar puntos del partido 2
			// **************************************************
			if(resulPartido2[1] == "x") {
				if(Objects.equals(resulPartido2[1], pronosticoPartido2.getGana1())) {
					sumaPuntos = sumaPuntos + 1;
				} 
			}
						

			if(resulPartido2[2] == "x") {
				if(Objects.equals(resulPartido2[2], pronosticoPartido2.getEmpate())) {
					sumaPuntos = sumaPuntos + 1;
				} 
			}
			
			
			if(resulPartido2[3] == "x") {
				if(Objects.equals(resulPartido2[3], pronosticoPartido2.getGana2())) {
					sumaPuntos = sumaPuntos + 1;
				} 
			}
			
			
			
			System.out.println("\n" + "TOTAL de PUNTO en aciertos de PRONOSTICO vs RESULTADO es: " + sumaPuntos);
					

		}catch(IOException e) {        // comienza la excepcion
				System.out.println("Hubo un ERROR en la operacion...");
			
			}
			
	}   // termina main
}  // termina principal
