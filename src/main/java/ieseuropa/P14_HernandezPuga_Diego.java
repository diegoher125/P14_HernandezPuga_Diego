package main.java.ieseuropa;

import java.util.ArrayList;
import java.util.Scanner;

public class P14_HernandezPuga_Diego {

	private static String pedirString(String texto) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(texto);
		return teclado.nextLine();
	}

	private static int pedirInt(String texto) {
		Scanner teclado = new Scanner(System.in);
		System.out.print(texto);
		return teclado.nextInt();
	}

	public static Club inicio() {
		Club club = new Club("Real Madrid");

		// añadir director deportivo
		club.anyadeDirector(new Director("Tito Floren", 23));

		// añadir entrenador
		club.anyadeEntrenador(new Entrenador("Carlo Ancelotti", 2));

		// añadir jugadores
		club.anyadeJugador(new Jugador("Courtois", 1, Posicion.Portero));
		club.anyadeJugador(new Jugador("Carvajal", 2, Posicion.Defensa));
		club.anyadeJugador(new Jugador("Militao", 3, Posicion.Defensa));
		club.anyadeJugador(new Jugador("Alaba", 4, Posicion.Defensa));
		club.anyadeJugador(new Jugador("Vallejo", 5, Posicion.Defensa));
		club.anyadeJugador(new Jugador("Nacho", 6, Posicion.Defensa));
		club.anyadeJugador(new Jugador("Hazard", 7, Posicion.Delantero));
		club.anyadeJugador(new Jugador("Kroos", 8, Posicion.Centrocampista));
		club.anyadeJugador(new Jugador("Benzema", 9, Posicion.Delantero));
		club.anyadeJugador(new Jugador("Modric", 10, Posicion.Centrocampista));
		club.anyadeJugador(new Jugador("Asensio", 11, Posicion.Delantero));
		club.anyadeJugador(new Jugador("Camavinga", 12, Posicion.Centrocampista));
		club.anyadeJugador(new Jugador("Lunin", 13, Posicion.Portero));
		club.anyadeJugador(new Jugador("Valverde", 15, Posicion.Centrocampista));
		club.anyadeJugador(new Jugador("Odriozola", 16, Posicion.Defensa));
		club.anyadeJugador(new Jugador("Lucas", 17, Posicion.Centrocampista));
		club.anyadeJugador(new Jugador("Tchouameni", 18, Posicion.Centrocampista));
		club.anyadeJugador(new Jugador("Ceballos", 19, Posicion.Centrocampista));
		club.anyadeJugador(new Jugador("Vini Jr", 20, Posicion.Delantero));
		club.anyadeJugador(new Jugador("Rodrygo", 21, Posicion.Delantero));
		club.anyadeJugador(new Jugador("Rudiger", 22, Posicion.Defensa));
		club.anyadeJugador(new Jugador("Mendy", 23, Posicion.Defensa));
		club.anyadeJugador(new Jugador("Mariano", 24, Posicion.Delantero));

		return club;
	}

	private static void crearAlineacion(Club club) {
		while (!club.alineacion(pedirDorsales())) {
			System.out.println("La alineacion esta mal");
		}
	}

	private static ArrayList<Integer> pedirDorsales() {
		ArrayList<Integer> dorsales = new ArrayList<>();
		System.out.println("Introduzca el dorsal de los 11 jugadores titulares:");
		for (int i = 0; i < 11; i++) {
			dorsales.add(pedirInt(""));
		}
		return dorsales;
	}

	private static void inicioMenu(Club club) {
		int opcion = 0;
		while (opcion != 5) {
			System.out.println("Sobre que desea realizar una accion:" + "\n1. Director deportivo" + "\n2. Entrenador"
					+ "\n3. Club" + "\n4. Jugador" + "\n5. Salir");
			opcion = pedirInt("");
			menuPrincipal(opcion, club);
		}
	}

	private static void menuPrincipal(int opcion, Club club) {
		switch (opcion) {
		case 1:
			menuDirector(club);
			break;
		case 2:
			break;
		case 3:
			menuClub(club);
			break;
		case 4:
			menuJugador(club);
			break;
		case 5:
			System.out.println("\nAdiós y Hala Madrid!");
			break;
		}
	}

	private static void menuClub(Club club) {
		System.out.println("Que información desea consultar: " + "\n1. Ver director deportivo " + "\n2. Ver entrenador "
				+ "\n3. Ver plantilla " + "\n4. Ver lista de los 5 maximos goleadores"
				+ "\n5. Ver lista de los 5 jugadores con más tarjetas" + "\n6. Calcular sueldos");
		switch (pedirInt("")) {
		case 1:
			System.out.println(club.verDirector());
			break;
		case 2:
			System.out.println(club.verEntrenador());
			break;
		case 3:
			System.out.println(club.verPlantilla());
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			System.out.println(club.calcularSueldos());
			break;
		}
	}

	private static void menuJugador(Club club) {
		System.out.println("Que acción desea realizar:\n1. Ver tarjeta\n2. Marca gol\n3.Sacar tarjeta");
		switch (pedirInt("")) {
		case 1:
			System.out.println("De que jugador quieres ver las tarjetas:");
			club.verTarjetas(pedirInt(""));
			break;
		case 2:
			System.out.println("Que jugador ha marcado un gol:");
			club.jugadorGol(pedirInt(""));
			break;
		case 3:
			System.out.println("A que jugador le han sacado tarjeta:");
			club.jugadorTarjeta(pedirInt(""));
			break;
		}
	}
	
	private static void menuDirector(Club club) {
		System.out.println("Que acción desea realizar:\n1. Fichar jugador\n2. Vender jugador");
		switch (pedirInt("")) {
		case 1:
			break;
		case 2:
			System.out.println("Que jugador desea vender:");
			club.venderJugador(pedirInt(""));
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Club club = inicio();
		// crearAlineacion(club);
		inicioMenu(club);

	}

}