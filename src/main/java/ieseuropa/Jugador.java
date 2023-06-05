package main.java.ieseuropa;

public class Jugador extends Miembro implements Comparable<Jugador> {

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

	public Jugador(int dorsal) {
		super();
		this.dorsal = dorsal;
		this.posicion = Posicion.Centrocampista;
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

	public void sacarTarjeta() {
			tarjetas += 1;
			if (revisarTarjetas()) {
				puedeJugar = false;
			}
	}

	private boolean revisarTarjetas() {
		if (tarjetas % 5 == 0) {
			return false;
		} else {
			return true;
		}
	}

	public void marcarGol() {
			goles += 1;
	}

	public float establecerSueldo() {
		switch (posicion) {
		default:
			return 0;
		case Portero, Defensa:
			return 50000;
		case Centrocampista:
			return 75000;
		case Delantero:
			return 100000;
		}
	}

	private float aumentoXGol() {
		switch (posicion) {
		default:
			return 0;
		case Portero, Defensa:
			return 5000;
		case Centrocampista:
			return 2500;
		case Delantero:
			return 1000;
		}
	}

	private float reduccionXTarjeta() {
		switch (posicion) {
		default:
			return 0;
		case Portero, Defensa:
			return 50;
		case Centrocampista:
			return 200;
		case Delantero:
			return 1000;
		}
	}

	public String calcularSueldo() {
		setSueldo(establecerSueldo());
		return "\nEl sueldo de " + getNombre() + " con dorsal " + dorsal + " es "
				+ (getSueldo() + (goles * aumentoXGol()) - (tarjetas * reduccionXTarjeta())) + "€";
	}

	public boolean saleAJugar() {
		if(puedeJugar) {
			jugando = true;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isPortero() {
		if(this.posicion.equals(Posicion.Portero)) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean equals(Object o) {
		if (this.dorsal == ((Jugador) o).getDorsal()) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int compareTo(Jugador jugador) {
		return (goles < jugador.getGoles() ? 1 : goles == jugador.getGoles() ? 0 : -1);
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + getNombre() + ", sueldo=" + getSueldo() + ", dorsal=" + dorsal + ", posicion="
				+ posicion + ", goles=" + goles + ", tarjetas=" + tarjetas + ", numPartidos=" + numPartidos
				+ ", jugando=" + jugando + ", puedeJugar=" + puedeJugar + "]";
	}

}
