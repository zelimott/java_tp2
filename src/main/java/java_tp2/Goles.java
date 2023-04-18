package java_tp2;

import javax.print.DocFlavor.STRING;

public class Goles {

	private int gol1 = 0;
	private int gol2 = 0;
	
	public Goles (int anota1, int anota2) {
		this.gol1 = anota1;
		this.gol2 = anota2;
	}

	public int getGol1() {
		return gol1;
	}

	public int getGol2() {
		return gol2;
	}

	public int resultado() {
		int resultado = 3;
		
		if (gol1 > gol2) {
			resultado = 1;
		}

		if (gol2 > gol1) {
			resultado = 2;
		}
		
		return resultado ;
	}
	
}
