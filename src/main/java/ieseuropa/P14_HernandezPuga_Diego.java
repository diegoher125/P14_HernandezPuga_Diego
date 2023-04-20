package main.java.ieseuropa;

public class P14_HernandezPuga_Diego {
	
	public static Club inicio() {
		Club club = new Club("Real Madrid");
		
		//añadir director deportivo
		club.anyadeDirector(new Director("Tito Floren",23));
		
		//añadir entrenador
		club.anyadeEntrenador(new Entrenador("Carlo Ancelotti",2));
		
		//añadir jugadores
		club.anyadeJugador(new Jugador("Courtois",1,Posicion.Portero));
		club.anyadeJugador(new Jugador("Carvajal",2,Posicion.Defensa));
		club.anyadeJugador(new Jugador("Militao",3,Posicion.Defensa));
		club.anyadeJugador(new Jugador("Alaba",4,Posicion.Defensa));
		club.anyadeJugador(new Jugador("Vallejo",5,Posicion.Defensa));
		club.anyadeJugador(new Jugador("Nacho",6,Posicion.Defensa));
		club.anyadeJugador(new Jugador("Hazard",7,Posicion.Delantero));
		club.anyadeJugador(new Jugador("Kroos",8,Posicion.Centrocampista));
		club.anyadeJugador(new Jugador("Benzema",9,Posicion.Delantero));
		club.anyadeJugador(new Jugador("Modric",10,Posicion.Centrocampista));
		club.anyadeJugador(new Jugador("Asensio",11,Posicion.Delantero));
		club.anyadeJugador(new Jugador("Camavinga",12,Posicion.Centrocampista));
		club.anyadeJugador(new Jugador("Lunin",13,Posicion.Portero));
		club.anyadeJugador(new Jugador("Valverde",15,Posicion.Centrocampista));
		club.anyadeJugador(new Jugador("Odriozola",16,Posicion.Defensa));
		club.anyadeJugador(new Jugador("Lucas",17,Posicion.Centrocampista));
		club.anyadeJugador(new Jugador("Tchouameni",18,Posicion.Centrocampista));
		club.anyadeJugador(new Jugador("Ceballos",19,Posicion.Centrocampista));
		club.anyadeJugador(new Jugador("Vini Jr",20,Posicion.Delantero));
		club.anyadeJugador(new Jugador("Rodrygo",21,Posicion.Delantero));
		club.anyadeJugador(new Jugador("Rudiger",22,Posicion.Defensa));
		club.anyadeJugador(new Jugador("Mendy",23,Posicion.Defensa));
		club.anyadeJugador(new Jugador("Mariano",24,Posicion.Delantero));
		
		return club;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Club club = inicio();
		
		System.out.println("\nAdiós y Hala Madrid!");
	}

}