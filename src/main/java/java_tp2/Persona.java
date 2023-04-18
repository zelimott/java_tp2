package java_tp2;

public class Persona {

	public String nombre;
	public int dni = 0;
	
	public Persona (String nombre) {
		this.nombre = nombre;
	}

	public void setNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}	
}
