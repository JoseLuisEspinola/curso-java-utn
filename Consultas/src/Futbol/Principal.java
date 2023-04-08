package Futbol;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		
		
		Jugador j1 = new Jugador("messi", 10, "medio campo");
		Jugador j2 = new Jugador("kun", 11, "delantero");
		
		jugadores.add(j1);
		jugadores.add(j2);
		jugadores.add(new Jugador("maradona", 10, "medio campo"));
		
		Jugador miJugadorFavorito = jugadores.get(0); //jugadores
		String nombre = jugadores.get(0).getNombre();
		
		System.out.println("Los nombres de los jugadores son: ");
		int pasadas = 0;
		for (int i = 0;i <jugadores.size(); i++) {
			pasadas = pasadas +1;
			System.out.println(pasadas);
			System.out.println(jugadores.get(i).getNombre());
		}
		
		
		Equipo argentina = new Equipo("Argentina", "A");
				
		argentina.agregarJugador(miJugadorFavorito);
		
		Jugador j4 = argentina.dameJugadorPorNumero(10);
		System.out.println(j4.getNombre());
		
		
		
		
		
	}
	
}
