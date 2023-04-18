package java_tp2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EncuentroTest {
	
	@Test
	public void testVictoriaLocal () {
		
		
		String linea = "1,1,ARGENTINA,ARABIA SAUDITA,14,2,Dummy";
		
		Encuentro match = new Encuentro(linea);
		
		int resultado = match.resultado();
		
		assertEquals(1, resultado);
				
	}
}
