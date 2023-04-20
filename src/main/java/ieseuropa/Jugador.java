package main.java.ieseuropa;

public class Jugador extends Miembro {
	
	private int dorsal;
	private Posicion posicion;
	private int goles;
	private int tarjetas;
	private int numPartidos;
	private boolean jugando;
	private boolean puedeJugar;
	
	public Jugador(String nombre, int dorsal, Posicion posicion) {
		super(nombre);
		this.dorsal = dorsal;
		this.posicion = posicion;
		this.goles = 0;
		this.tarjetas = 0;
		this.numPartidos = 0;
		this.jugando = false;
		this.puedeJugar = true;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	public int getTarjetas() {
		return tarjetas;
	}

	public void setTarjetas(int tarjetas) {
		this.tarjetas = tarjetas;
	}

	public int getNumPartidos() {
		return numPartidos;
	}

	public void setNumPartidos(int numPartidos) {
		this.numPartidos = numPartidos;
	}

	public boolean isJugando() {
		return jugando;
	}

	public void setJugando(boolean jugando) {
		this.jugando = jugando;
	}

	public boolean isPuedeJugar() {
		return puedeJugar;
	}

	public void setPuedeJugar(boolean puedeJugar) {
		this.puedeJugar = puedeJugar;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + getNombre() + ", sueldo=" + getSueldo() + ", dorsal="  + dorsal + ", posicion=" + posicion + ", goles=" + goles + ", tarjetas=" + tarjetas
				+ ", numPartidos=" + numPartidos + ", jugando=" + jugando + ", puedeJugar=" + puedeJugar + "]";
	}

}
