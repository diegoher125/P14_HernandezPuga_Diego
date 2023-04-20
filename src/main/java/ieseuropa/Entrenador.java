package main.java.ieseuropa;

public class Entrenador extends NoJugador {
	
	public Entrenador(String nombre, int numAnos) {
		super(nombre,numAnos);
	}
	
	private float bonus() {
		return 1 + (((getNumAnos() - 1) * 10) / 100);
	}
	
	public String calcularSueldo() {
		setSueldo(100000);
		return "El sueldo de " + getNombre() + " es " + (getSueldo() * bonus()) + "€";
	}

}
