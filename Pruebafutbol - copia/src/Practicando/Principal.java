package Practicando;

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
		String archivoResultado  = "carpetaresultado\\resultados.csv";     // en distintas carpetas como SE PEDIA.
		String archivoPronostico = "carpetapronostico\\pronosticos.csv";   // en distintas carpetas como SE PEDIA.
		int partidos = 0;
		int cantPersonas = 2;
		int sumaPuntosM = 0;
		int sumaPuntosP = 0;
				
		// Envio el nombre de las personas de este pronostico
		System.out.print("PARTICIPANTES:    ");
		for(int i = 0; i < cantPersonas; i++) {
			if(i == 0) {
				Persona persona1 = new Persona(1, "Mariana");
				System.out.print(persona1.getIdPersona() + "-" + persona1.getNombre());
			} else {
				Persona persona2 = new Persona(i+1,"Pedro");
				System.out.println("      " + persona2.getIdPersona() + "-" + persona2.getNombre() + "\n");
			}
		}

				
		try {
			List<String> listaResultado  = Files.readAllLines(Paths.get(archivoResultado));
			List<String> listaPronostico = Files.readAllLines(Paths.get(archivoPronostico));
			
			String[] equipo0Resultado = listaResultado.get(0).split(","); // Cabezera
			String[] equipo1Resultado = listaResultado.get(1).split(","); // Argentina 1 2 ArabiaSaudita
			String[] equipo2Resultado = listaResultado.get(2).split(","); // Polonia 0 0 Mexico
			String[] equipo3Resultado = listaResultado.get(3).split(","); // Argentina 2 0 Mexico
			String[] equipo4Resultado = listaResultado.get(4).split(","); // Arabia Saudita 0 2 Polonia
			
			
			String[] equipo0Pronostico = listaPronostico.get(0).split(",");

			String[] equipo1Pronostico = listaPronostico.get(1).split(",");
			String[] equipo2Pronostico = listaPronostico.get(2).split(",");
			String[] equipo3Pronostico = listaPronostico.get(3).split(",");
			String[] equipo4Pronostico = listaPronostico.get(4).split(",");
			
			String[] equipo5Pronostico = listaPronostico.get(5).split(",");
			String[] equipo6Pronostico = listaPronostico.get(6).split(",");
			String[] equipo7Pronostico = listaPronostico.get(7).split(",");
			String[] equipo8Pronostico = listaPronostico.get(8).split(",");
			

			// paso los parametros a la clase Partido
			Partido resultadoPartido1 = new Partido(1, equipo1Resultado[1], equipo1Resultado[4], Integer.parseInt(equipo1Resultado[2]), Integer.parseInt(equipo1Resultado[3]));
			Partido resultadoPartido2 = new Partido(1, equipo2Resultado[1], equipo2Resultado[4], Integer.parseInt(equipo2Resultado[2]), Integer.parseInt(equipo2Resultado[3]));
			Partido resultadoPartido3 = new Partido(1, equipo3Resultado[1], equipo3Resultado[4], Integer.parseInt(equipo3Resultado[2]), Integer.parseInt(equipo3Resultado[3]));
			Partido resultadoPartido4 = new Partido(1, equipo4Resultado[1], equipo4Resultado[4], Integer.parseInt(equipo4Resultado[2]), Integer.parseInt(equipo4Resultado[3]));
			
			
			// paso los parametros a la clase Pronostico
			Pronostico pronosticoPartido1 = new Pronostico("Mariana", equipo1Pronostico[1], equipo1Pronostico[2], equipo1Pronostico[3], equipo1Pronostico[4], equipo1Pronostico[5]);
			Pronostico pronosticoPartido2 = new Pronostico("Mariana", equipo2Pronostico[1], equipo2Pronostico[2], equipo2Pronostico[3], equipo2Pronostico[4], equipo2Pronostico[5]);
			Pronostico pronosticoPartido3 = new Pronostico("Mariana", equipo3Pronostico[1], equipo3Pronostico[2], equipo3Pronostico[3], equipo3Pronostico[4], equipo3Pronostico[5]);
			Pronostico pronosticoPartido4 = new Pronostico("Mariana", equipo4Pronostico[1], equipo4Pronostico[2], equipo4Pronostico[3], equipo4Pronostico[4], equipo4Pronostico[5]);
			Pronostico pronosticoPartido5 = new Pronostico("Pedro", equipo5Pronostico[1], equipo5Pronostico[2], equipo5Pronostico[3], equipo5Pronostico[4], equipo5Pronostico[5]);
			Pronostico pronosticoPartido6 = new Pronostico("Pedro", equipo6Pronostico[1], equipo6Pronostico[2], equipo6Pronostico[3], equipo6Pronostico[4], equipo6Pronostico[5]);
			Pronostico pronosticoPartido7 = new Pronostico("Pedro", equipo7Pronostico[1], equipo7Pronostico[2], equipo7Pronostico[3], equipo7Pronostico[4], equipo7Pronostico[5]);
			Pronostico pronosticoPartido8 = new Pronostico("Pedro", equipo8Pronostico[1], equipo8Pronostico[2], equipo8Pronostico[3], equipo8Pronostico[4], equipo8Pronostico[5]);
			
			
			//Con estas dos lines, muestro titulo de columnas
			System.out.println("ARCHIVO RESULTADO");
			System.out.println(equipo0Resultado[0] + "    " + equipo0Resultado[1] + "    " + equipo0Resultado[2] + "    " + equipo0Resultado[3] + "    " + equipo0Resultado[4]);
			System.out.println("  " + resultadoPartido1.getIdPartido() + "      " + resultadoPartido1.getEquipo1() + "       "+ resultadoPartido1.getGolesEquipo1() + "              " + resultadoPartido1.getGolesEquipo2() + "         " + resultadoPartido1.getEquipo2() + "        --> Partido:" + (partidos = partidos + 1));
			System.out.println("  " + resultadoPartido2.getIdPartido() + "      " + resultadoPartido2.getEquipo1() + "         "+ resultadoPartido2.getGolesEquipo1() + "              " + resultadoPartido2.getGolesEquipo2() + "         " + resultadoPartido2.getEquipo2() + "                --> Partido:" + (partidos = partidos + 1));
			System.out.println("  " + resultadoPartido3.getIdPartido() + "      " + resultadoPartido3.getEquipo1() + "       "+ resultadoPartido3.getGolesEquipo1() + "              " + resultadoPartido3.getGolesEquipo2() + "         " + resultadoPartido3.getEquipo2() + "                --> Partido:" + (partidos = partidos + 1));
			System.out.println("  " + resultadoPartido4.getIdPartido() + "      " + resultadoPartido4.getEquipo1() + "  "+ resultadoPartido4.getGolesEquipo1() + "              " + resultadoPartido4.getGolesEquipo2() + "         " + resultadoPartido4.getEquipo2() + "               --> Partido:" + (partidos = partidos + 1));
			
			
			System.out.println("\n");
			partidos = 0;
			
			System.out.println("ARCHIVO PRONOSTICO");
			System.out.println(equipo0Pronostico[0] + "  " + equipo0Pronostico[1] + "          " + equipo0Pronostico[2] + "      " + equipo0Pronostico[3] + "     " + equipo0Pronostico[4]+ "     " + equipo0Pronostico[5]);
			System.out.println(pronosticoPartido1.getParticipante() + "       " + pronosticoPartido1.getEquipo1() + "          " + pronosticoPartido1.getGana1() + "          " + pronosticoPartido1.getEmpate() + "          " + pronosticoPartido1.getGana2() + "      " + pronosticoPartido1.getEquipo2() + "      " + "       --> Partido:" + (partidos = partidos + 1));
			System.out.println(pronosticoPartido2.getParticipante() + "       " + pronosticoPartido2.getEquipo1() + "            " + pronosticoPartido2.getGana1() + "          " + pronosticoPartido2.getEmpate() +  "          " + pronosticoPartido2.getGana2() + "       " + pronosticoPartido2.getEquipo2() + "                     --> Partido:" + (partidos = partidos + 1));
			System.out.println(pronosticoPartido3.getParticipante() + "       " + pronosticoPartido3.getEquipo1() + "          " + pronosticoPartido3.getGana1() + "          " + pronosticoPartido3.getEmpate() + "          " + pronosticoPartido3.getGana2() + "      " + pronosticoPartido3.getEquipo2() + "      " + "               --> Partido:" + (partidos = partidos + 1));
			System.out.println(pronosticoPartido4.getParticipante() + "       " + pronosticoPartido4.getEquipo1() + "     " + pronosticoPartido4.getGana1() + "          " + pronosticoPartido4.getEmpate() +  "          " + pronosticoPartido4.getGana2() + "       " + pronosticoPartido4.getEquipo2() + "                    --> Partido:" + (partidos = partidos + 1));
			partidos = 0;
			System.out.println(pronosticoPartido5.getParticipante() + "         " + pronosticoPartido5.getEquipo1() + "          " + pronosticoPartido5.getGana1() + "          " + pronosticoPartido5.getEmpate() + "          " + pronosticoPartido5.getGana2() + "       " + pronosticoPartido5.getEquipo2() + "      " + "       --> Partido:" + (partidos = partidos + 1));
			System.out.println(pronosticoPartido6.getParticipante() + "         " + pronosticoPartido6.getEquipo1() + "            " + pronosticoPartido6.getGana1() + "          " + pronosticoPartido6.getEmpate() +  "          " + pronosticoPartido6.getGana2() + "       " + pronosticoPartido6.getEquipo2() + "                     --> Partido:" + (partidos = partidos + 1));
			System.out.println(pronosticoPartido7.getParticipante() + "         " + pronosticoPartido7.getEquipo1() + "          " + pronosticoPartido7.getGana1() + "          " + pronosticoPartido7.getEmpate() + "          " + pronosticoPartido7.getGana2() + "       " + pronosticoPartido7.getEquipo2() + "      " + "               --> Partido:" + (partidos = partidos + 1));
			System.out.println(pronosticoPartido8.getParticipante() + "         " + pronosticoPartido8.getEquipo1() + "     " + pronosticoPartido8.getGana1() + "          " + pronosticoPartido8.getEmpate() +  "          " + pronosticoPartido8.getGana2() + "       " + pronosticoPartido8.getEquipo2() + "                    --> Partido:" + (partidos = partidos + 1));

			
			System.out.println("\n");
			String[] resulPartido1 = resultadoPartido1.getGanador();
			String[] resulPartido2 = resultadoPartido2.getGanador();
			String[] resulPartido3 = resultadoPartido3.getGanador();
			String[] resulPartido4 = resultadoPartido4.getGanador();

			
			// **************************************************
			// para sumar puntos del partido 1 (Mariana)
			// **************************************************
			if(resulPartido1[1] == "x") {
				if(Objects.equals(resulPartido1[1], pronosticoPartido1.getGana1())) {
					sumaPuntosM = sumaPuntosM + 1;
				} 
			}
			

			if(resulPartido1[2] == "x") {
				if(Objects.equals(resulPartido1[2], pronosticoPartido1.getEmpate())) {
					sumaPuntosM = sumaPuntosM + 1;
				} 
			}
			
			
			if(resulPartido1[3] == "x") {
				if(Objects.equals(resulPartido1[3], pronosticoPartido1.getGana2())) {
					sumaPuntosM = sumaPuntosM + 1;
				} 
			}
			
			
			// **************************************************
			// para sumar puntos del partido 2 (Mariana)
			// **************************************************
			if(resulPartido2[1] == "x") {
				if(Objects.equals(resulPartido2[1], pronosticoPartido2.getGana1())) {
					sumaPuntosM = sumaPuntosM + 1;
				} 
			}
						

			if(resulPartido2[2] == "x") {
				if(Objects.equals(resulPartido2[2], pronosticoPartido2.getEmpate())) {
					sumaPuntosM = sumaPuntosM + 1;
				} 
			}
			
			
			if(resulPartido2[3] == "x") {
				if(Objects.equals(resulPartido2[3], pronosticoPartido2.getGana2())) {
					sumaPuntosM = sumaPuntosM + 1;
				} 
			}
			
			
			// **************************************************
			// para sumar puntos del partido 3 (Mariana)
			// **************************************************
			if(resulPartido3[1] == "x") {
				if(Objects.equals(resulPartido3[1], pronosticoPartido3.getGana1())) {
					sumaPuntosM = sumaPuntosM + 1;
				} 
			}
			

			if(resulPartido3[2] == "x") {
				if(Objects.equals(resulPartido3[2], pronosticoPartido3.getEmpate())) {
					sumaPuntosM = sumaPuntosM + 1;
				} 
			}
			
			
			if(resulPartido3[3] == "x") {
				if(Objects.equals(resulPartido3[3], pronosticoPartido3.getGana2())) {
					sumaPuntosM = sumaPuntosM + 1;
				} 
			}
			
			
			// **************************************************
			// para sumar puntos del partido 4 (Mariana)
			// **************************************************
			if(resulPartido4[1] == "x") {
				if(Objects.equals(resulPartido4[1], pronosticoPartido4.getGana1())) {
					sumaPuntosM = sumaPuntosM + 1;
				} 
			}
			

			if(resulPartido4[2] == "x") {
				if(Objects.equals(resulPartido4[2], pronosticoPartido4.getEmpate())) {
					sumaPuntosM = sumaPuntosM + 1;
				} 
			}
			
			
			if(resulPartido4[3] == "x") {
				if(Objects.equals(resulPartido4[3], pronosticoPartido4.getGana2())) {
					sumaPuntosM = sumaPuntosM + 1;
				} 
			}

			
//********************************************************************************************
			// **************************************************
			// para sumar puntos del partido 1 (Pedro)
			// **************************************************
			if(resulPartido1[1] == "x") {
				if(Objects.equals(resulPartido1[1], pronosticoPartido5.getGana1())) {
					sumaPuntosP = sumaPuntosP + 1;
				} 
			}
						

			if(resulPartido1[2] == "x") {
				if(Objects.equals(resulPartido1[2], pronosticoPartido5.getEmpate())) {
					sumaPuntosP = sumaPuntosP + 1;
				} 
			}
						
						
			if(resulPartido1[3] == "x") {
				if(Objects.equals(resulPartido1[3], pronosticoPartido5.getGana2())) {
					sumaPuntosP = sumaPuntosP + 1;
				} 
			}
						
						
			// **************************************************
			// para sumar puntos del partido 2 (Pedro)
			// **************************************************
			if(resulPartido2[1] == "x") {
				if(Objects.equals(resulPartido2[1], pronosticoPartido6.getGana1())) {
					sumaPuntosP = sumaPuntosP + 1;
				} 
			}
									

			if(resulPartido2[2] == "x") {
				if(Objects.equals(resulPartido2[2], pronosticoPartido6.getEmpate())) {
					sumaPuntosP = sumaPuntosP + 1;
				} 
			}
						
						
			if(resulPartido2[3] == "x") {
				if(Objects.equals(resulPartido2[3], pronosticoPartido6.getGana2())) {
					sumaPuntosP = sumaPuntosP + 1;
				} 
			}
						
						
			// **************************************************
			// para sumar puntos del partido 3 (Pedro)
			// **************************************************
			if(resulPartido3[1] == "x") {
				if(Objects.equals(resulPartido3[1], pronosticoPartido7.getGana1())) {
					sumaPuntosP = sumaPuntosP + 1;
				} 
			}
						

			if(resulPartido3[2] == "x") {
				if(Objects.equals(resulPartido3[2], pronosticoPartido7.getEmpate())) {
					sumaPuntosP = sumaPuntosP + 1;
				} 
			}
						
						
			if(resulPartido3[3] == "x") {
				if(Objects.equals(resulPartido3[3], pronosticoPartido7.getGana2())) {
					sumaPuntosP = sumaPuntosP + 1;
				} 
			}
						
				
			// **************************************************
			// para sumar puntos del partido 4 (Pedro)
			// **************************************************
			if(resulPartido4[1] == "x") {
				if(Objects.equals(resulPartido4[1], pronosticoPartido8.getGana1())) {
					sumaPuntosP = sumaPuntosP + 1;
				} 
			}
						

			if(resulPartido4[2] == "x") {
				if(Objects.equals(resulPartido4[2], pronosticoPartido8.getEmpate())) {
					sumaPuntosP = sumaPuntosP + 1;
				} 
			}
						
						
			if(resulPartido4[3] == "x") {
				if(Objects.equals(resulPartido4[3], pronosticoPartido8.getGana2())) {
					sumaPuntosP = sumaPuntosP + 1;
				} 
			}

			
			System.out.println("PUNTOS TOTAL de aciertos para Mariana: " +  sumaPuntosM);
			System.out.println("PUNTOS TOTAL de aciertos para Pedro: " +  sumaPuntosP);

		}catch(IOException e) {        // comienza la excepcion
				System.out.println("Hubo un error en la operacion...");
			
		} 
			
	}   // termina main

}  // termina principal
