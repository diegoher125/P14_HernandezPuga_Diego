package main.java.ieseuropa;

public class Director extends NoJugador {

	public Director(String nombre, int numAnos) {
		super(nombre, numAnos);
	}

	public String calcularSueldo() {
		return "\n" + getNombre() + " por ser director no cobra";
	}

}
