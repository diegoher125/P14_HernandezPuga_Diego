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
	
	public String alineacion(int[] dorsales) {
		String alineacion = "";
		for(int i=0;i<dorsales.length;i++) {
			alineacion += "\n" + plantilla.get(plantilla.indexOf(new Jugador(dorsales[i+1]))).alinear();
		}
		return alineacion;
	}

	@Override
	public String toString() {
		return "Club [nombre=" + nombre + ", director=" + director + ", entrenador=" + entrenador + ", plantilla="
				+ plantilla + "]";
	}

}
