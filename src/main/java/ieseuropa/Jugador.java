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
		if(jugando) {
			tarjetas += 1;
			if(revisarTarjetas()) {
				puedeJugar = false;
			}
		}
	}
	
	private boolean revisarTarjetas() {
		if(tarjetas % 5 == 0) {
			return false;
		}else {
			return true;
		}
	}
	
	public void marcarGol() {
		if(jugando) {
			goles += 1;
		}
	}
	
	public float establecerSueldo() {
		switch(posicion) {
		default:
			return 0;
		case Portero,Defensa:
			return 50000;
		case Centrocampista:
			return 75000;
		case Delantero:
			return 100000;
		}
	}
	
	private float aumentoXGol() {
		switch(posicion) {
		default:
			return 0;
		case Portero,Defensa:
			return 5000;
		case Centrocampista:
			return 2500;
		case Delantero:
			return 1000;
		}
	}
	
	private float reduccionXTarjeta() {
		switch(posicion) {
		default:
			return 0;
		case Portero,Defensa:
			return 50;
		case Centrocampista:
			return 200;
		case Delantero:
			return 1000;
		}
	}
	
	public String calcularSueldo() {
		setSueldo(establecerSueldo());
		return "El sueldo de " + getNombre() + " es " + (getSueldo() + (goles * aumentoXGol()) - (tarjetas * reduccionXTarjeta())) + "€";
	}
	
	private void saleAJugar() {
		jugando = true;
	}
	
	public String alinear() {
		if(puedeJugar) {
			saleAJugar();
			return getNombre() + " con dorsal " + dorsal + " sale al campo";
		}else {
			return getNombre() + " con dorsal " + dorsal + " no puede jugar";
		}
	}
	
	@Override
	public boolean equals(Object o) {
		if (dorsal == ((Jugador) o).dorsal) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + getNombre() + ", sueldo=" + getSueldo() + ", dorsal="  + dorsal + ", posicion=" + posicion + ", goles=" + goles + ", tarjetas=" + tarjetas
				+ ", numPartidos=" + numPartidos + ", jugando=" + jugando + ", puedeJugar=" + puedeJugar + "]";
	}

}
