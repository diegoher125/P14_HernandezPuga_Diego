package main.java.ieseuropa;

public class Entrenador extends Miembro {
	
	private int numAnos;
	
	public Entrenador(String nombre, int numAnos) {
		super(nombre);
		this.numAnos = numAnos;
	}

	public int getNumAnos() {
		return numAnos;
	}

	public void setNumAnos(int numAnos) {
		this.numAnos = numAnos;
	}

	@Override
	public String toString() {
		return "Entrenador [nombre=" + getNombre() + ", sueldo=" + getSueldo() + ", numAnos=" + numAnos + "]";
	}

}
