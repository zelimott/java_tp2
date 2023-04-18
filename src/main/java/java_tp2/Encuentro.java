package java_tp2;

public class Encuentro {
	
	public String linea;
	
	public Encuentro (String lin) {
		this.linea = lin;
	}
	
	public String getNombre() { 
		String[] alinea = linea.split(",") ;
		return alinea[6];		
	}

	public int resultado() {	
		String[] alinea = linea.split(",") ;

		int ronda = Integer.parseInt(alinea[0]); 
		int numero = Integer.parseInt(alinea[1]);
		String local = alinea[2];				
		String visita = alinea[3];
		int tantos1 = Integer.parseInt(alinea[4]);	
		int tantos2 = Integer.parseInt(alinea[5]) ;
		String nombre = getNombre();		//alinea[6] ;
		
		Equipo equipo1 = new Equipo(local) ;
		Equipo equipo2 = new Equipo(visita);
		Goles score = new Goles(tantos1, tantos2);
		Persona persona = new Persona(nombre);
		
		Partido picado1 = new Partido();
		
		picado1.setRonda(ronda);
		picado1.setNumero(numero);
		picado1.setNombre1(equipo1);
		picado1.setNombre2(equipo2);
		picado1.setGoles(score);
		picado1.setPersona(persona);

		return picado1.getresultado();
	}
}

