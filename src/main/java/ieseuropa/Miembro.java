package main.java.ieseuropa;

public abstract class Miembro {

	private String nombre;
	private float sueldo;

	public Miembro(String nombre) {
		this.nombre = nombre;
		this.sueldo = 0;
	}

	public Miembro() {
		this.nombre = "";
		this.sueldo = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public String calcularSueldo() {
		return "";
	}

	@Override
	public String toString() {
		return "Miembro [nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}

}
