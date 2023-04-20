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

	@Override
	public String toString() {
		return "Club [nombre=" + nombre + ", director=" + director + ", entrenador=" + entrenador + ", plantilla="
				+ plantilla + "]";
	}

}
