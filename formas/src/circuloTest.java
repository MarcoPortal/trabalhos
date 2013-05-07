import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class circuloTest {

	
	private circulo c;
	
	@Before
	public void setUp(){
		c= new circulo(10);
		}
	
	@Test
	public void testCalculaArea() {
		setUp();
		assertEquals(314.15, c.calculaArea(),0.001);
	}
	

	@Test
	public void testCalculaPerimetro() {
		setUp();
		assertEquals(62.83, c.calculaPerimetro(),0.001);
	}

}
