package main.java.ieseuropa;

public class Director extends Miembro {
	
	private int numAnos;
	
	public Director(String nombre, int numAnos) {
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
		return "Director [nombre=" + getNombre() + ", sueldo=" + getSueldo() + ", numAnos=" + numAnos + "]";
	}

}
