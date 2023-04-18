package java_tp2;

public class Equipo {

	public String nombre;
	//private String descripcion;//

	public Equipo (String nombreX) {
		this.nombre = nombreX;
	}

	public void setNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
