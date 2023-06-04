package main.java.ieseuropa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Club {

	private String nombre;
	private Director director;
	private Entrenador entrenador;
	private ArrayList<Jugador> plantilla;
	private boolean alineados;

	public Club(String nombre) {
		this.nombre = nombre;
		this.plantilla = new ArrayList<>();
		this.alineados = false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public Entrenador getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

	public ArrayList<Jugador> getPlantilla() {
		return plantilla;
	}

	public void setPlantilla(ArrayList<Jugador> plantilla) {
		this.plantilla = plantilla;
	}

	public boolean isAlineados() {
		return alineados;
	}

	public void setAlineados(boolean alineados) {
		this.alineados = alineados;
	}

	public void anyadeDirector(Director director) {
		this.director = director;
	}

	public void anyadeEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

	public void anyadeJugador(Jugador jugador) {
		plantilla.add(jugador);
	}

	public void ficharJugador(Jugador jugador) {
		plantilla.add(jugador);
	}

	public String venderJugador(int dorsal) {
		if (existeJugador(dorsal)) {
			plantilla.remove(plantilla.indexOf(new Jugador(dorsal)));
			return "Jugador vendido";
		} else {
			return "No existe el jugador";
		}
	}

	public boolean existeJugador(int dorsal) {
		if (plantilla.contains(new Jugador(dorsal))) {
			return true;
		} else {
			return false;
		}
	}

	public String ordenadoTarjetas() {
		Collections.sort(plantilla, new OrderByTarjetas());
		String jugadores = "";
		for (int i = 0; i < 5; i++) {
			jugadores += "\n" + plantilla.get(i).getNombre() + " con " + plantilla.get(i).getTarjetas() + " tarjetas";
		}
		return jugadores;
	}

	public String ordenadoGoles() {
		Collections.sort(plantilla);
		String jugadores = "";
		for (int i = 0; i < 5; i++) {
			jugadores += "\n" + plantilla.get(i).getNombre() + " con " + plantilla.get(i).getGoles() + " goles";
		}
		return jugadores;
	}
//
	public boolean alineacion(ArrayList<Integer> dorsales) {
		if (!comprobarPortero(dorsales) || jugadorRepetido(dorsales)) {
			return false;
		} else {
			for (int dorsal: dorsales) {
				if (plantilla.contains(new Jugador(dorsal))) {
					if(!plantilla.get(plantilla.indexOf(new Jugador(dorsal))).saleAJugar()) {
						return false;
					}
				}else {
					return false;
				}
			}
			return true;
		}
	}

	private boolean jugadorRepetido(ArrayList<Integer> dorsales) {
		HashSet<Integer> dorsalesSet = new HashSet<>();
		for (int dorsal : dorsales) {
			if (dorsalesSet.contains(dorsal)) {
				return true;
			}
			dorsalesSet.add(dorsal);
		}
		return false;
	}

	private boolean comprobarPortero(ArrayList<Integer> dorsales) {
		int contadorPorteros = 0;
		for (int dorsal : dorsales) {
	        if (plantilla.get(plantilla.indexOf(new Jugador(dorsal))).isPortero()) {
	            contadorPorteros++;
	        }
	    }
		if (contadorPorteros == 1) {
			return true;
		}else {
			return false;
		}
	}

	public void jugadorGol(int dorsal) {
		plantilla.get(plantilla.indexOf(new Jugador(dorsal))).marcarGol();
	}

	public void jugadorTarjeta(int dorsal) {
		plantilla.get(plantilla.indexOf(new Jugador(dorsal))).sacarTarjeta();
	}

	public String verTarjetas(int dorsal) {
		return "Tiene " + plantilla.get(plantilla.indexOf(new Jugador(dorsal))).getTarjetas() + " tarjetas";
	}

	public String verDirector() {
		return director.getNombre() + " es el director del club y lleva " + director.getNumAnos() + " años en el club";
	}

	public String verEntrenador() {
		return entrenador.getNombre() + " es el entrenador del club y lleva " + entrenador.getNumAnos()
				+ " años en el club";
	}

	public String verPlantilla() {
		String jugadores = "La plantilla esta formada por:";
		for (Jugador jugador : plantilla) {
			jugadores += jugador.getNombre() + ",";
		}
		return jugadores.substring(0, (jugadores.length() - 1));
	}

	public String calcularSueldos() {
		String sueldos = "Los sueldos son: " + director.calcularSueldo() + entrenador.calcularSueldo();
		for (Jugador jugador : plantilla) {
			sueldos += jugador.calcularSueldo();
		}
		return sueldos;
	}

	@Override
	public String toString() {
		return "Club [nombre=" + nombre + ", director=" + director + ", entrenador=" + entrenador + ", plantilla="
				+ plantilla + "]";
	}

}
