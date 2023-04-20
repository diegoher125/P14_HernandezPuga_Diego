package main.java.ieseuropa;

public class NoJugador extends Miembro {
	
private int numAnos;
	
	public NoJugador(String nombre, int numAnos) {
		super(nombre);
		this.numAnos = numAnos;
	}

	public int getNumAnos() {
		return numAnos;
	}

	public void setNumAnos(int numAnos) {
		this.numAnos = numAnos;
	}
	
	public String calcularSueldo() {
		return "";
	}

	@Override
	public String toString() {
		return "Entrenador [nombre=" + getNombre() + ", sueldo=" + getSueldo() + ", numAnos=" + numAnos + "]";
	}

}
