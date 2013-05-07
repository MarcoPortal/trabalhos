import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class retanguloTest {

private retangulo r;
	
	@Before
	public void setUp(){
	 r = new retangulo(2,3);
		
	}
	
	@Test
	public void testCalculaArea() {
		setUp();
		assertEquals(6,r.calculaArea(),0.001);
	}
	

	@Test
	public void testCalculaPerimetro() {
		setUp();
		assertEquals(10, r.calculaPerimetro(),0.001);
	}

}
