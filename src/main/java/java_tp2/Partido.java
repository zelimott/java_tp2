package java_tp2;

public class Partido {
	
	private int ronda = 0;
	private int numero = 0;
	private Equipo equipo1;
	private Equipo equipo2;
	private Goles tablero;
	private Persona persona = new Persona( "nn");
	
	public int getRonda() {
		return ronda;
	}

	public void setRonda(int ronda) {
		this.ronda = ronda;
	}
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Equipo getNombre1() {
		return equipo1;
	}

	public void setNombre1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}

	public Equipo getNombre2() {
		return equipo2;
	}
	
	public void setNombre2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}
	
	public Goles getgol() {
		return tablero;
	}
	
	public void setGoles(Goles tableroX) {
		this.tablero = tableroX;
	}

	public int getGol1() {
		return tablero.getGol1() ;
	}

	public int getGol2() {
		return tablero.getGol2() ;
	}	

	public int getresultado() {
		return tablero.resultado() ;
	}	

	public Persona getPersona() {
		return persona ;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}
