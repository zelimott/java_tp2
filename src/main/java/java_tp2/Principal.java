package java_tp2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		String nomcontrol = "????";
		String nomaposta  = "????";
		int nrocontrol = 0;
		int apostador = 0;
		int puntaje = 0;
		int aciertos = 0;

		try {
			/////////////////////////////////////////////////////////////////////////////////////////
			repopartido repo1 = new repopartido(args[0]);
			Map<Integer, String> repoPartido = repo1.repositorio();

			/////////////////////////////////////////////////////////////////////////////////////////
			repopartido repo2 = new repopartido(args[1]);
			Map<Integer, String> repoPronostico = repo2.repositorio();

			/////////////////////////////////////////////////////////////////////////////////////////
			nrocontrol = 0;

			for (Map.Entry<Integer,String> lineaPronostico: repoPronostico.entrySet()) {
				int keyPronostico = lineaPronostico.getKey();

				Encuentro bet = new Encuentro(lineaPronostico.getValue());
				int resulpron = bet.resultado() ;

				nomaposta = bet.getNombre();

				for (Map.Entry<Integer,String> lineaPartido: repoPartido.entrySet()) {
					int keyPartido = (lineaPartido.getKey() % 100000);

					Encuentro match = new Encuentro(lineaPartido.getValue());
					int resultado = match.resultado() ;
					
					if (keyPartido == (keyPronostico % 100000) ) {

						apostador = (keyPronostico - keyPronostico % 100000) / 100000 ;

						if (nrocontrol != apostador) {
							if (nrocontrol != 0) {
								System.out.println(	"APOSTADOR " + nrocontrol + " " + nomcontrol  
													+ " PUNTAJE = " + puntaje ); 
							}	
							nrocontrol = apostador ;
							nomcontrol = nomaposta ;
							puntaje = 0;	
						}
								
						if (resultado == resulpron) {
							puntaje ++ ;
							aciertos ++ ;
						}
					}	
				}
			}

			System.out.println(	  "APOSTADOR "  + nrocontrol + " " + nomcontrol  
								+ " PUNTAJE = " + puntaje ); 

			System.out.println( "Aciertos totales = " + aciertos );
					
		} catch (IOException e) {
			System.out.println("Fallo la apertura del archivos TXT");
			System.exit(1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
	}

}

