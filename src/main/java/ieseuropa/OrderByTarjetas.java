package main.java.ieseuropa;

import java.util.Comparator;

public class OrderByTarjetas implements Comparator {

	@Override
	public int compare(Object j1, Object j2) {
		return (((Jugador)j1).getTarjetas() < ((Jugador)j2).getTarjetas() ? 1 : ((Jugador)j1).getTarjetas() == ((Jugador)j2).getTarjetas() ? 0 : -1);
	}

}
