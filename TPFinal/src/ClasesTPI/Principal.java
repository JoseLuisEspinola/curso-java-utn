package ClasesTPI;

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
		String rutaArchivoResultado  = "carpetaresultado\\resultados.csv";     // en distintas carpetas como SE PEDIA.
		String rutaArchivoPronostico = "carpetapronostico\\pronosticos.csv";   // en distintas carpetas como SE PEDIA.
		
		int cantPersonas = 3;
		int sumaPuntosM = 0;
		int sumaPuntosP = 0;
		int sumaPuntosJ = 0;
				
		
		// Envio el nombre de las personas de este pronostico
		System.out.print("PARTICIPANTES:    ");
		for(int i = 0; i < cantPersonas; i++) {
			if(i == 0) {
				Persona persona1 = new Persona(i+1, "Mariana");
				System.out.print(persona1.getIdPersona() + "-" + persona1.getNombre());
			} 
			
			if(i == 1) {
				Persona persona2 = new Persona(i+1, "Pedro");
				System.out.print("      " + persona2.getIdPersona() + "-" + persona2.getNombre());
			}
			
			if(i == 2) {
				Persona persona3 = new Persona(i+1, "Julian");
				System.out.println("      " + persona3.getIdPersona() + "-" + persona3.getNombre() + "\n");
			}
		}

		
		// Guardo datos de RESULTADO - deberia ser una clase
		int j = 0;
		try {
			List<String> listaResultado  = Files.readAllLines(Paths.get(rutaArchivoResultado));
			List<String> listaPronostico = Files.readAllLines(Paths.get(rutaArchivoPronostico));
			
			
			// RESULTADO
			String[] equipo0Resultado = listaResultado.get(0).split(","); // Cabezera
			String[] equipo1Resultado = listaResultado.get(1).split(","); // Argentina 1 2 ArabiaSaudita
			String[] equipo2Resultado = listaResultado.get(2).split(","); // Polonia 0 0 Mexico
			String[] equipo3Resultado = listaResultado.get(3).split(","); // Argentina 2 0 Mexico
			String[] equipo4Resultado = listaResultado.get(4).split(","); // Arabia Saudita 0 2 Polonia
			String[] equipo5Resultado = listaResultado.get(5).split(","); // Argentina 2 0 Polonia
			String[] equipo6Resultado = listaResultado.get(6).split(","); // Arabia Saudita 1 2 Mexico
			
			// PRONOSTICO
			String[] equipo0Pronostico = listaPronostico.get(0).split(",");
			
			String[] equipo1Pronostico = listaPronostico.get(1).split(",");
			String[] equipo2Pronostico = listaPronostico.get(2).split(",");
			String[] equipo3Pronostico = listaPronostico.get(3).split(",");
			String[] equipo4Pronostico = listaPronostico.get(4).split(",");
			String[] equipo5Pronostico = listaPronostico.get(5).split(",");
			String[] equipo6Pronostico = listaPronostico.get(6).split(",");
			
			String[] equipo7Pronostico = listaPronostico.get(7).split(",");
			String[] equipo8Pronostico = listaPronostico.get(8).split(",");
			String[] equipo9Pronostico = listaPronostico.get(9).split(",");
			String[] equipo10Pronostico = listaPronostico.get(10).split(",");
			String[] equipo11Pronostico = listaPronostico.get(11).split(",");
			String[] equipo12Pronostico = listaPronostico.get(12).split(",");
			
			String[] equipo13Pronostico = listaPronostico.get(13).split(",");
			String[] equipo14Pronostico = listaPronostico.get(14).split(",");
			String[] equipo15Pronostico = listaPronostico.get(15).split(",");
			String[] equipo16Pronostico = listaPronostico.get(16).split(",");
			String[] equipo17Pronostico = listaPronostico.get(17).split(",");
			String[] equipo18Pronostico = listaPronostico.get(18).split(",");
			

			// paso los parametros a la clase Partido
			Partido resultadoPartido1 = new Partido(Integer.parseInt(equipo1Resultado[0]), Integer.parseInt(equipo1Resultado[1]), equipo1Resultado[2], equipo1Resultado[5], Integer.parseInt(equipo1Resultado[3]), Integer.parseInt(equipo1Resultado[4]));
			Partido resultadoPartido2 = new Partido(Integer.parseInt(equipo2Resultado[0]), Integer.parseInt(equipo2Resultado[1]), equipo2Resultado[2], equipo2Resultado[5], Integer.parseInt(equipo2Resultado[3]), Integer.parseInt(equipo2Resultado[4]));
			Partido resultadoPartido3 = new Partido(Integer.parseInt(equipo3Resultado[0]), Integer.parseInt(equipo3Resultado[1]), equipo3Resultado[2], equipo3Resultado[5], Integer.parseInt(equipo3Resultado[3]), Integer.parseInt(equipo3Resultado[4]));
			Partido resultadoPartido4 = new Partido(Integer.parseInt(equipo4Resultado[0]), Integer.parseInt(equipo4Resultado[1]), equipo4Resultado[2], equipo4Resultado[5], Integer.parseInt(equipo4Resultado[3]), Integer.parseInt(equipo4Resultado[4]));
			Partido resultadoPartido5 = new Partido(Integer.parseInt(equipo5Resultado[0]), Integer.parseInt(equipo5Resultado[1]), equipo5Resultado[2], equipo5Resultado[5], Integer.parseInt(equipo5Resultado[3]), Integer.parseInt(equipo5Resultado[4]));
			Partido resultadoPartido6 = new Partido(Integer.parseInt(equipo6Resultado[0]), Integer.parseInt(equipo6Resultado[1]), equipo6Resultado[2], equipo6Resultado[5], Integer.parseInt(equipo6Resultado[3]), Integer.parseInt(equipo6Resultado[4]));
			
			
			// paso los parametros a la clase Pronostico
			Pronostico pronosticoPartido1 = new Pronostico(equipo1Pronostico[0], equipo1Pronostico[1], equipo1Pronostico[2], equipo1Pronostico[3], equipo1Pronostico[4], equipo1Pronostico[5]);
			Pronostico pronosticoPartido2 = new Pronostico(equipo2Pronostico[0], equipo2Pronostico[1], equipo2Pronostico[2], equipo2Pronostico[3], equipo2Pronostico[4], equipo2Pronostico[5]);
			Pronostico pronosticoPartido3 = new Pronostico(equipo3Pronostico[0], equipo3Pronostico[1], equipo3Pronostico[2], equipo3Pronostico[3], equipo3Pronostico[4], equipo3Pronostico[5]);
			Pronostico pronosticoPartido4 = new Pronostico(equipo4Pronostico[0], equipo4Pronostico[1], equipo4Pronostico[2], equipo4Pronostico[3], equipo4Pronostico[4], equipo4Pronostico[5]);
			Pronostico pronosticoPartido5 = new Pronostico(equipo5Pronostico[0], equipo5Pronostico[1], equipo5Pronostico[2], equipo5Pronostico[3], equipo5Pronostico[4], equipo5Pronostico[5]);
			Pronostico pronosticoPartido6 = new Pronostico(equipo6Pronostico[0], equipo6Pronostico[1], equipo6Pronostico[2], equipo6Pronostico[3], equipo6Pronostico[4], equipo6Pronostico[5]);
			
			Pronostico pronosticoPartido7 = new Pronostico(equipo7Pronostico[0], equipo7Pronostico[1], equipo7Pronostico[2], equipo7Pronostico[3], equipo7Pronostico[4], equipo7Pronostico[5]);
			Pronostico pronosticoPartido8 = new Pronostico(equipo8Pronostico[0], equipo8Pronostico[1], equipo8Pronostico[2], equipo8Pronostico[3], equipo8Pronostico[4], equipo8Pronostico[5]);
			Pronostico pronosticoPartido9 = new Pronostico(equipo9Pronostico[0], equipo9Pronostico[1], equipo9Pronostico[2], equipo9Pronostico[3], equipo9Pronostico[4], equipo9Pronostico[5]);
			Pronostico pronosticoPartido10 = new Pronostico(equipo10Pronostico[0], equipo10Pronostico[1], equipo10Pronostico[2], equipo10Pronostico[3], equipo10Pronostico[4], equipo10Pronostico[5]);
			Pronostico pronosticoPartido11 = new Pronostico(equipo11Pronostico[0], equipo11Pronostico[1], equipo11Pronostico[2], equipo11Pronostico[3], equipo11Pronostico[4], equipo11Pronostico[5]);
			Pronostico pronosticoPartido12 = new Pronostico(equipo12Pronostico[0], equipo12Pronostico[1], equipo12Pronostico[2], equipo12Pronostico[3], equipo12Pronostico[4], equipo12Pronostico[5]);
			
			Pronostico pronosticoPartido13 = new Pronostico(equipo13Pronostico[0], equipo13Pronostico[1], equipo13Pronostico[2], equipo13Pronostico[3], equipo13Pronostico[4], equipo13Pronostico[5]);
			Pronostico pronosticoPartido14 = new Pronostico(equipo14Pronostico[0], equipo14Pronostico[1], equipo14Pronostico[2], equipo14Pronostico[3], equipo14Pronostico[4], equipo14Pronostico[5]);
			Pronostico pronosticoPartido15 = new Pronostico(equipo15Pronostico[0], equipo15Pronostico[1], equipo15Pronostico[2], equipo15Pronostico[3], equipo15Pronostico[4], equipo15Pronostico[5]);
			Pronostico pronosticoPartido16 = new Pronostico(equipo16Pronostico[0], equipo16Pronostico[1], equipo16Pronostico[2], equipo16Pronostico[3], equipo16Pronostico[4], equipo16Pronostico[5]);
			Pronostico pronosticoPartido17 = new Pronostico(equipo17Pronostico[0], equipo17Pronostico[1], equipo17Pronostico[2], equipo17Pronostico[3], equipo17Pronostico[4], equipo17Pronostico[5]);
			Pronostico pronosticoPartido18 = new Pronostico(equipo18Pronostico[0], equipo18Pronostico[1], equipo18Pronostico[2], equipo18Pronostico[3], equipo18Pronostico[4], equipo18Pronostico[5]);
			
			
			//Con estas dos lines, muestro titulo de columnas
			System.out.println("ARCHIVO RESULTADO");
			
			System.out.println(equipo0Resultado[0] + "    " + equipo0Resultado[1] + "    " + equipo0Resultado[2] + "        " + equipo0Resultado[3] + "    " + equipo0Resultado[4] + "    " + equipo0Resultado[5]);
			System.out.println("   " + resultadoPartido1.getIdPartido() + "         " + resultadoPartido1.getIdRonda() + "      " + resultadoPartido1.getEquipo1() + "           " + resultadoPartido1.getGolesEquipo1() + "              " + resultadoPartido1.getGolesEquipo2() + "         " + resultadoPartido1.getEquipo2());
			System.out.println("   " + resultadoPartido2.getIdPartido() + "         " + resultadoPartido2.getIdRonda() + "      " + resultadoPartido2.getEquipo1() + "             " + resultadoPartido2.getGolesEquipo1() + "              " + resultadoPartido2.getGolesEquipo2() + "         " + resultadoPartido2.getEquipo2());
			System.out.println("   " + resultadoPartido3.getIdPartido() + "         " + resultadoPartido3.getIdRonda() + "      " + resultadoPartido3.getEquipo1() + "           " + resultadoPartido3.getGolesEquipo1() + "              " + resultadoPartido3.getGolesEquipo2() + "         " + resultadoPartido3.getEquipo2());
			System.out.println("   " + resultadoPartido4.getIdPartido() + "         " + resultadoPartido4.getIdRonda() + "      " + resultadoPartido4.getEquipo1() + "      " + resultadoPartido4.getGolesEquipo1() + "              " + resultadoPartido4.getGolesEquipo2() + "         " + resultadoPartido4.getEquipo2());
			System.out.println("   " + resultadoPartido5.getIdPartido() + "         " + resultadoPartido5.getIdRonda() + "      " + resultadoPartido5.getEquipo1() + "           " + resultadoPartido5.getGolesEquipo1() + "              " + resultadoPartido5.getGolesEquipo2() + "         " + resultadoPartido5.getEquipo2());
			System.out.println("   " + resultadoPartido6.getIdPartido() + "         " + resultadoPartido6.getIdRonda() + "      " + resultadoPartido6.getEquipo1() + "      " + resultadoPartido6.getGolesEquipo1() + "              " + resultadoPartido6.getGolesEquipo2() + "         " + resultadoPartido6.getEquipo2());
			
			
			System.out.println("\n");
			
			System.out.println("ARCHIVO PRONOSTICO");
			System.out.println(equipo0Pronostico[0] + "  " + equipo0Pronostico[1] + "          " + equipo0Pronostico[2] + "      " + equipo0Pronostico[3] + "     " + equipo0Pronostico[4]+ "     " + equipo0Pronostico[5]);
			System.out.println(pronosticoPartido1.getParticipante() + "       " + pronosticoPartido1.getEquipo1() + "          " + pronosticoPartido1.getGana1() + "          " + pronosticoPartido1.getEmpate() + "          " + pronosticoPartido1.getGana2() + "       " + pronosticoPartido1.getEquipo2());
			System.out.println(pronosticoPartido2.getParticipante() + "       " + pronosticoPartido2.getEquipo1() + "            " + pronosticoPartido2.getGana1() + "          " + pronosticoPartido2.getEmpate() +  "          " + pronosticoPartido2.getGana2() + "       " + pronosticoPartido2.getEquipo2());
			System.out.println(pronosticoPartido3.getParticipante() + "       " + pronosticoPartido3.getEquipo1() + "          " + pronosticoPartido3.getGana1() + "          " + pronosticoPartido3.getEmpate() + "          " + pronosticoPartido3.getGana2() + "       " + pronosticoPartido3.getEquipo2());
			System.out.println(pronosticoPartido4.getParticipante() + "       " + pronosticoPartido4.getEquipo1() + "     " + pronosticoPartido4.getGana1() + "          " + pronosticoPartido4.getEmpate() +  "          " + pronosticoPartido4.getGana2() + "       " + pronosticoPartido4.getEquipo2());
			System.out.println(pronosticoPartido5.getParticipante() + "       " + pronosticoPartido5.getEquipo1() + "          " + pronosticoPartido5.getGana1() + "          " + pronosticoPartido5.getEmpate() + "          " + pronosticoPartido5.getGana2() + "       " + pronosticoPartido5.getEquipo2());
			System.out.println(pronosticoPartido6.getParticipante() + "       " + pronosticoPartido6.getEquipo1() + "     " + pronosticoPartido6.getGana1() + "          " + pronosticoPartido6.getEmpate() +  "          " + pronosticoPartido6.getGana2() + "       " + pronosticoPartido6.getEquipo2());
			
			System.out.println(pronosticoPartido7.getParticipante() + "         " + pronosticoPartido7.getEquipo1() + "          " + pronosticoPartido7.getGana1() + "          " + pronosticoPartido7.getEmpate() + "          " + pronosticoPartido7.getGana2() + "       " + pronosticoPartido7.getEquipo2());
			System.out.println(pronosticoPartido8.getParticipante() + "         " + pronosticoPartido8.getEquipo1() + "            " + pronosticoPartido8.getGana1() + "          " + pronosticoPartido8.getEmpate() +  "          " + pronosticoPartido8.getGana2() + "       " + pronosticoPartido8.getEquipo2());
			System.out.println(pronosticoPartido9.getParticipante() + "         " + pronosticoPartido9.getEquipo1() + "          " + pronosticoPartido9.getGana1() + "          " + pronosticoPartido9.getEmpate() + "          " + pronosticoPartido9.getGana2() + "       " + pronosticoPartido9.getEquipo2());
			System.out.println(pronosticoPartido10.getParticipante() + "         " + pronosticoPartido10.getEquipo1() + "     " + pronosticoPartido10.getGana1() + "          " + pronosticoPartido10.getEmpate() +  "          " + pronosticoPartido10.getGana2() + "       " + pronosticoPartido10.getEquipo2());
			System.out.println(pronosticoPartido11.getParticipante() + "         " + pronosticoPartido11.getEquipo1() + "          " + pronosticoPartido11.getGana1() + "          " + pronosticoPartido11.getEmpate() + "          " + pronosticoPartido11.getGana2() + "       " + pronosticoPartido11.getEquipo2());
			System.out.println(pronosticoPartido12.getParticipante() + "         " + pronosticoPartido12.getEquipo1() + "     " + pronosticoPartido12.getGana1() + "          " + pronosticoPartido12.getEmpate() +  "          " + pronosticoPartido12.getGana2() + "       " + pronosticoPartido12.getEquipo2());
			
			System.out.println(pronosticoPartido13.getParticipante() + "        " + pronosticoPartido13.getEquipo1() + "          " + pronosticoPartido13.getGana1() + "          " + pronosticoPartido13.getEmpate() + "          " + pronosticoPartido13.getGana2() + "       " + pronosticoPartido13.getEquipo2());
			System.out.println(pronosticoPartido14.getParticipante() + "        " + pronosticoPartido14.getEquipo1() + "            " + pronosticoPartido14.getGana1() + "          " + pronosticoPartido14.getEmpate() +  "          " + pronosticoPartido14.getGana2() + "       " + pronosticoPartido14.getEquipo2());
			System.out.println(pronosticoPartido15.getParticipante() + "        " + pronosticoPartido15.getEquipo1() + "          " + pronosticoPartido15.getGana1() + "          " + pronosticoPartido15.getEmpate() + "          " + pronosticoPartido15.getGana2() + "       " + pronosticoPartido15.getEquipo2());
			System.out.println(pronosticoPartido16.getParticipante() + "        " + pronosticoPartido16.getEquipo1() + "     " + pronosticoPartido16.getGana1() + "          " + pronosticoPartido16.getEmpate() +  "          " + pronosticoPartido16.getGana2() + "       " + pronosticoPartido16.getEquipo2());
			System.out.println(pronosticoPartido17.getParticipante() + "        " + pronosticoPartido17.getEquipo1() + "          " + pronosticoPartido17.getGana1() + "          " + pronosticoPartido17.getEmpate() + "          " + pronosticoPartido17.getGana2() + "       " + pronosticoPartido17.getEquipo2());
			System.out.println(pronosticoPartido18.getParticipante() + "        " + pronosticoPartido18.getEquipo1() + "     " + pronosticoPartido18.getGana1() + "          " + pronosticoPartido18.getEmpate() +  "          " + pronosticoPartido18.getGana2() + "       " + pronosticoPartido18.getEquipo2());
			
			
			
			System.out.println("\n");
			String[] resulPartido1 = resultadoPartido1.getGanador();
			String[] resulPartido2 = resultadoPartido2.getGanador();
			String[] resulPartido3 = resultadoPartido3.getGanador();
			String[] resulPartido4 = resultadoPartido4.getGanador();
			String[] resulPartido5 = resultadoPartido5.getGanador();
			String[] resulPartido6 = resultadoPartido6.getGanador();
			
			// **************************************************
			// PARA sumar puntos del partido 1 (Mariana)
			// **************************************************
			if(resulPartido1[2] == "x") {
				if(Objects.equals(resulPartido1[2], pronosticoPartido1.getGana1())) {
					sumaPuntosM = sumaPuntosM + 1;
				} 
			}
			

			if(resulPartido1[3] == "x") {
				if(Objects.equals(resulPartido1[3], pronosticoPartido1.getEmpate())) {
					sumaPuntosM = sumaPuntosM + 1;
				} 
			}
			
			
			if(resulPartido1[4] == "x") {
				if(Objects.equals(resulPartido1[4], pronosticoPartido1.getGana2())) {
					sumaPuntosM = sumaPuntosM + 1;
				} 
			}
			
			
			// **************************************************
			// PARA sumar puntos del partido 2 (Mariana)
			// **************************************************
			if(resulPartido2[2] == "x") {
				if(Objects.equals(resulPartido2[2], pronosticoPartido2.getGana1())) {
					sumaPuntosM = sumaPuntosM + 1;
				} 
			}
						

			if(resulPartido2[3] == "x") {
				if(Objects.equals(resulPartido2[3], pronosticoPartido2.getEmpate())) {
					sumaPuntosM = sumaPuntosM + 1;
				} 
			}
			
			
			if(resulPartido2[4] == "x") {
				if(Objects.equals(resulPartido2[4], pronosticoPartido2.getGana2())) {
					sumaPuntosM = sumaPuntosM + 1;
				} 
			}
			
			
			// **************************************************
			// PARA sumar puntos del partido 3 (Mariana)
			// **************************************************
			if(resulPartido3[2] == "x") {
				if(Objects.equals(resulPartido3[2], pronosticoPartido3.getGana1())) {
					sumaPuntosM = sumaPuntosM + 1;
				} 
			}
			

			if(resulPartido3[3] == "x") {
				if(Objects.equals(resulPartido3[3], pronosticoPartido3.getEmpate())) {
					sumaPuntosM = sumaPuntosM + 1;
				} 
			}
			
			
			if(resulPartido3[4] == "x") {
				if(Objects.equals(resulPartido3[4], pronosticoPartido3.getGana2())) {
					sumaPuntosM = sumaPuntosM + 1;
				} 
			}
			
			
			// **************************************************
			// PARA sumar puntos del partido 4 (Mariana)
			// **************************************************
			if(resulPartido4[2] == "x") {
				if(Objects.equals(resulPartido4[2], pronosticoPartido4.getGana1())) {
					sumaPuntosM = sumaPuntosM + 1;
				} 
			}
			

			if(resulPartido4[3] == "x") {
				if(Objects.equals(resulPartido4[4], pronosticoPartido4.getEmpate())) {
					sumaPuntosM = sumaPuntosM + 1;
				} 
			}
			
			
			if(resulPartido4[4] == "x") {
				if(Objects.equals(resulPartido4[4], pronosticoPartido4.getGana2())) {
					sumaPuntosM = sumaPuntosM + 1;
				} 
			}

			
			
			// **************************************************
			// PARA sumar puntos del partido 5 (Mariana)
			// **************************************************
			if(resulPartido5[2] == "x") {
				if(Objects.equals(resulPartido5[2], pronosticoPartido5.getGana1())) {
					sumaPuntosM = sumaPuntosM + 1;
				} 
			}
						

			if(resulPartido5[3] == "x") {
				if(Objects.equals(resulPartido5[3], pronosticoPartido5.getEmpate())) {
					sumaPuntosM = sumaPuntosM + 1;
				} 
			}
						
						
			if(resulPartido5[4] == "x") {
				if(Objects.equals(resulPartido5[4], pronosticoPartido5.getGana2())) {
					sumaPuntosM = sumaPuntosM + 1;
				} 
			}
						
						
			// **************************************************
			// PARA sumar puntos del partido 6 (Mariana)
			// **************************************************
			if(resulPartido6[2] == "x") {
				if(Objects.equals(resulPartido6[2], pronosticoPartido6.getGana1())) {
					sumaPuntosM = sumaPuntosM + 1;
				} 
			}
									

			if(resulPartido6[3] == "x") {
				if(Objects.equals(resulPartido6[3], pronosticoPartido6.getEmpate())) {
					sumaPuntosM = sumaPuntosM + 1;
				} 
			}
						
						
			if(resulPartido6[4] == "x") {
				if(Objects.equals(resulPartido6[4], pronosticoPartido6.getGana2())) {
					sumaPuntosM = sumaPuntosM + 1;
				} 
			}			
			
			
//********************************************************************************************
			// **************************************************
			// para sumar puntos del partido 1 (Pedro)
			// **************************************************
			if(resulPartido1[2] == "x") {
				if(Objects.equals(resulPartido1[2], pronosticoPartido7.getGana1())) {
					sumaPuntosP = sumaPuntosP + 1;
				} 
			}
						

			if(resulPartido1[3] == "x") {
				if(Objects.equals(resulPartido1[3], pronosticoPartido7.getEmpate())) {
					sumaPuntosP = sumaPuntosP + 1;
				} 
			}
						
						
			if(resulPartido1[4] == "x") {
				if(Objects.equals(resulPartido1[4], pronosticoPartido7.getGana2())) {
					sumaPuntosP = sumaPuntosP + 1;
				} 
			}
						
						
			// **************************************************
			// PARA sumar puntos del partido 2 (Pedro)
			// **************************************************
			if(resulPartido2[2] == "x") {
				if(Objects.equals(resulPartido2[2], pronosticoPartido8.getGana1())) {
					sumaPuntosP = sumaPuntosP + 1;
				} 
			}
									

			if(resulPartido2[3] == "x") {
				if(Objects.equals(resulPartido2[3], pronosticoPartido8.getEmpate())) {
					sumaPuntosP = sumaPuntosP + 1;
				} 
			}
						
						
			if(resulPartido2[4] == "x") {
				if(Objects.equals(resulPartido2[4], pronosticoPartido8.getGana2())) {
					sumaPuntosP = sumaPuntosP + 1;
				} 
			}
						
						
			// **************************************************
			// PARA sumar puntos del partido 3 (Pedro)
			// **************************************************
			if(resulPartido3[2] == "x") {
				if(Objects.equals(resulPartido3[2], pronosticoPartido9.getGana1())) {
					sumaPuntosP = sumaPuntosP + 1;
				} 
			}
						

			if(resulPartido3[3] == "x") {
				if(Objects.equals(resulPartido3[3], pronosticoPartido9.getEmpate())) {
					sumaPuntosP = sumaPuntosP + 1;
				} 
			}
						
						
			if(resulPartido3[4] == "x") {
				if(Objects.equals(resulPartido3[4], pronosticoPartido9.getGana2())) {
					sumaPuntosP = sumaPuntosP + 1;
				} 
			}
						
				
			// **************************************************
			// PARA sumar puntos del partido 4 (Pedro)
			// **************************************************
			if(resulPartido4[2] == "x") {
				if(Objects.equals(resulPartido4[2], pronosticoPartido10.getGana1())) {
					sumaPuntosP = sumaPuntosP + 1;
				} 
			}
						

			if(resulPartido4[3] == "x") {
				if(Objects.equals(resulPartido4[3], pronosticoPartido10.getEmpate())) {
					sumaPuntosP = sumaPuntosP + 1;
				} 
			}
						
						
			if(resulPartido4[4] == "x") {
				if(Objects.equals(resulPartido4[4], pronosticoPartido10.getGana2())) {
					sumaPuntosP = sumaPuntosP + 1;
				} 
			}


			// **************************************************
			// PARA sumar puntos del partido 5 (Pedro)
			// **************************************************
			if(resulPartido5[2] == "x") {
				if(Objects.equals(resulPartido5[2], pronosticoPartido11.getGana1())) {
					sumaPuntosP = sumaPuntosP + 1;
				} 
			}
						

			if(resulPartido5[3] == "x") {
				if(Objects.equals(resulPartido5[3], pronosticoPartido11.getEmpate())) {
					sumaPuntosP = sumaPuntosP + 1;
				} 
			}
						
						
			if(resulPartido5[4] == "x") {
				if(Objects.equals(resulPartido5[4], pronosticoPartido11.getGana2())) {
					sumaPuntosP = sumaPuntosP + 1;
				} 
			}
						
						
			// **************************************************
			// para sumar puntos del partido 6 (Pedro)
			// **************************************************
			if(resulPartido6[2] == "x") {
				if(Objects.equals(resulPartido6[2], pronosticoPartido12.getGana1())) {
					sumaPuntosP = sumaPuntosP + 1;
				} 
			}
									

			if(resulPartido6[3] == "x") {
				if(Objects.equals(resulPartido6[3], pronosticoPartido12.getEmpate())) {
					sumaPuntosP = sumaPuntosP + 1;
				} 
			}

			if(resulPartido6[4] == "x") {
				if(Objects.equals(resulPartido6[4], pronosticoPartido12.getGana2())) {
					sumaPuntosP = sumaPuntosP + 1;
				} 
			}
			

//****************************************************************************************************
			// **************************************************
			// PARA sumar puntos del partido 1 (Julian)
			// **************************************************
			if(resulPartido1[2] == "x") {
				if(Objects.equals(resulPartido1[2], pronosticoPartido13.getGana1())) {
					sumaPuntosJ = sumaPuntosJ + 1;
				} 
			}
			

			if(resulPartido1[3] == "x") {
				if(Objects.equals(resulPartido1[3], pronosticoPartido13.getEmpate())) {
					sumaPuntosJ = sumaPuntosJ + 1;
				} 
			}
			
			
			if(resulPartido1[4] == "x") {
				if(Objects.equals(resulPartido1[4], pronosticoPartido13.getGana2())) {
					sumaPuntosJ = sumaPuntosJ + 1;
				} 
			}
			
			
			// **************************************************
			// PARA sumar puntos del partido 2 (Julian)
			// **************************************************
			if(resulPartido2[2] == "x") {
				if(Objects.equals(resulPartido2[2], pronosticoPartido14.getGana1())) {
					sumaPuntosJ = sumaPuntosJ + 1;
				} 
			}
						

			if(resulPartido2[3] == "x") {
				if(Objects.equals(resulPartido2[3], pronosticoPartido14.getEmpate())) {
					sumaPuntosJ = sumaPuntosJ + 1;
				} 
			}
			
			
			if(resulPartido2[4] == "x") {
				if(Objects.equals(resulPartido2[4], pronosticoPartido14.getGana2())) {
					sumaPuntosJ = sumaPuntosJ + 1;
				} 
			}
			
			
			// **************************************************
			// PARA sumar puntos del partido 3 (Julian)
			// **************************************************
			if(resulPartido3[2] == "x") {
				if(Objects.equals(resulPartido3[2], pronosticoPartido15.getGana1())) {
					sumaPuntosJ = sumaPuntosJ + 1;
				} 
			}
			

			if(resulPartido3[3] == "x") {
				if(Objects.equals(resulPartido3[3], pronosticoPartido15.getEmpate())) {
					sumaPuntosJ = sumaPuntosJ + 1;
				} 
			}
			
			
			if(resulPartido3[4] == "x") {
				if(Objects.equals(resulPartido3[4], pronosticoPartido15.getGana2())) {
					sumaPuntosJ = sumaPuntosJ + 1;
				} 
			}
			
			
			// **************************************************
			// PARA sumar puntos del partido 4 (Julian)
			// **************************************************
			if(resulPartido4[2] == "x") {
				if(Objects.equals(resulPartido4[2], pronosticoPartido16.getGana1())) {
					sumaPuntosJ = sumaPuntosJ + 1;
				} 
			}
			

			if(resulPartido4[3] == "x") {
				if(Objects.equals(resulPartido4[3], pronosticoPartido16.getEmpate())) {
					sumaPuntosJ = sumaPuntosJ + 1;
				} 
			}
			
			
			if(resulPartido4[4] == "x") {
				if(Objects.equals(resulPartido4[4], pronosticoPartido16.getGana2())) {
					sumaPuntosJ = sumaPuntosJ + 1;
				} 
			}

			
			
			// **************************************************
			// PARA sumar puntos del partido 5 (Julian)
			// **************************************************
			if(resulPartido5[2] == "x") {
				if(Objects.equals(resulPartido5[2], pronosticoPartido17.getGana1())) {
					sumaPuntosJ = sumaPuntosJ + 1;
				} 
			}
						

			if(resulPartido5[3] == "x") {
				if(Objects.equals(resulPartido5[3], pronosticoPartido17.getEmpate())) {
					sumaPuntosJ = sumaPuntosJ + 1;
				} 
			}
						
						
			if(resulPartido5[4] == "x") {
				if(Objects.equals(resulPartido5[4], pronosticoPartido17.getGana2())) {
					sumaPuntosJ = sumaPuntosJ + 1;
				} 
			}
						
						
			// **************************************************
			// PARA sumar puntos del partido 6 (Julian)
			// **************************************************
			if(resulPartido6[2] == "x") {
				if(Objects.equals(resulPartido6[2], pronosticoPartido18.getGana1())) {
					sumaPuntosJ = sumaPuntosJ + 1;
				} 
			}
									

			if(resulPartido6[3] == "x") {
				if(Objects.equals(resulPartido6[3], pronosticoPartido18.getEmpate())) {
					sumaPuntosJ = sumaPuntosJ + 1;
				} 
			}
						
						
			if(resulPartido6[4] == "x") {
				if(Objects.equals(resulPartido6[4], pronosticoPartido18.getGana2())) {
					sumaPuntosJ = sumaPuntosJ + 1;
				} 
			}			
			
			
			// Imprimo los los puntos
			System.out.println("TOTAL de PUNTOS para Mariana: " +  sumaPuntosM);
			System.out.println("TOTAL de PUNTOS para Pedro:   " +  sumaPuntosP);
			System.out.println("TOTAL de PUNTOS para Julian:  " +  sumaPuntosJ);

		}catch(IOException e) {        // comienza la excepcion
				//System.out.println("Hubo un error en la operacion...");
			System.out.println(e);
			
		} 
			
	}   // termina main

}  // termina principal
