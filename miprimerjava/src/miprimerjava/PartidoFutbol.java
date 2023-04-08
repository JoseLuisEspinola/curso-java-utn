package miprimerjava;

import java.util.Random;

public class PartidoFutbol {
	public static void main(String[] args) {
	    Random rand = new Random();
	    String[] equipos = {"Equipo A", "Equipo B"}; // Nombres de los equipos
	    int[] goles = {0, 0}; // Número de goles de cada equipo
	    int minutos = 0; // Duración del partido en minutos
		    
	    System.out.println("¡Comienza el partido!");
		    
	    // Simulación del partido
	    while (minutos < 90) {
	      int equipo = rand.nextInt(2); // Seleccionar un equipo al azar
	      int gol = rand.nextInt(2); // Determinar si el equipo anotó un gol
	      
	      if (gol == 1) {
	        goles[equipo]++;
	        System.out.println("¡Gol de " + equipos[equipo] + "!");
	      }
		      
	      minutos += rand.nextInt(5); // Avanzar un número aleatorio de minutos
	    }
		    
	    // Mostrar resultado final del partido
	    System.out.println("¡Fin del partido!");
	    System.out.println(equipos[0] + " " + goles[0] + " - " + goles[1] + " " + equipos[1]);
	  }
}
