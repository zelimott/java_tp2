package java_tp2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class repopartido {
	public String ruta;
	
	public repopartido (String ruta) {
		this.ruta = ruta;
	}
	
	public Map<Integer, String> repositorio () throws IOException {

		String nomcontrol = "????";
		int nrocontrol = 0;
		boolean primero;
		
		Path archPartidos = Paths.get(ruta);
		
		List<String> lineasArch = Files.readAllLines(archPartidos);

		Map<Integer, String> repositorio = new TreeMap<Integer, String>();

		primero = true;
		for (String lineapar : lineasArch) {
			if (primero) {
				primero = false;
			} else {
				if (!lineapar.isBlank()) {	
					String[] pk = lineapar.split(",");

					try {
						if (pk.length < 7) {
							throw new Exception ("Faltan campos en "+ ruta + " !!!");
						}

				    	Integer.parseInt( pk[4] );
				    	Integer.parseInt( pk[5] );
					}
				    catch (NumberFormatException ex) {
				    	System.out.println("Los Goles deben ser números enteros !!!");
				    	System.exit(1);
				    } 
				    catch (Exception e) {
							System.out.println(e.getMessage());
							System.exit(1);
					}
					
					if (! nomcontrol.equals(pk[6] )) {
						nomcontrol = pk[6];
						nrocontrol ++;
					}		

					Integer pkey = Integer.valueOf(pk[0]) * 1000 + Integer.valueOf(pk[1]) +  nrocontrol * 100000 ;

					repositorio.put(pkey, lineapar);
				}
			}
		}
		return repositorio;
	}

}
