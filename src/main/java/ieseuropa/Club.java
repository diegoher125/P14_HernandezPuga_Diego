package main.java.ieseuropa;

import java.util.ArrayList;

public class Club {

	private String nombre;
	private Director director;
	private Entrenador entrenador;
	private ArrayList<Jugador> plantilla;

	public Club(String nombre) {
		this.nombre = nombre;
		this.plantilla = new ArrayList<>();
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

	public void venderJugador(int dorsal) {
		plantilla.remove(plantilla.indexOf(new Jugador(dorsal)));
	}

	public boolean alineacion(ArrayList<Integer> dorsales) {
		if (!comprobarPortero(dorsales)) {
			return false;
		} else {
			for (int i = 0; i < dorsales.size(); i++) {
				if (!plantilla.get(plantilla.indexOf(new Jugador(dorsales.get(i + 1)))).alinear()
						|| !plantilla.contains(new Jugador(dorsales.get(i + 1)))) {
					return false;
				}
			}
			return true;
		}
	}

	private boolean comprobarPortero(ArrayList<Integer> dorsales) {
		boolean portero = false;
		boolean variosPorteros = false;
		for (int i = 0; i < dorsales.size(); i++) {
			if (plantilla.get(plantilla.indexOf(new Jugador(dorsales.get(i)))).getPosicion() == Posicion.Portero) {
				portero = true;
			} else if (portero) {
				variosPorteros = true;
			}
		}
		if (variosPorteros || !portero) {
			return false;
		} else {
			return true;
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
		return entrenador.getNombre() + " es el entrenador del club y lleva " + entrenador.getNumAnos() + " años en el club";
	}
	
	public String verPlantilla() {
		String jugadores = "La plantilla esta formada por:";
		for(Jugador jugador: plantilla) {
			jugadores += jugador.getNombre() + ",";
		}
		return jugadores.substring(0, (jugadores.length()-1));
	}
	
	public String calcularSueldos() {
		String sueldos = "Los sueldos son: " + director.calcularSueldo() + entrenador.calcularSueldo();
		for(Jugador jugador: plantilla) {
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
