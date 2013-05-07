import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class trianguloTest {

	@Test
	public void test() {
		
		private triangulo t;
		
		@Before
		public void setUp(){
		 t = new triangulo(3,4,5);
			
		}
		
		@Test
		public void testCalculaArea() {
			setUp();
			assertEquals(6,t.calculaArea(),0.001);
		}
		

		@Test
		public void testCalculaPerimetro() {
			setUp();
			assertEquals(10, t.calculaPerimetro(),0.001);
		}
		
		
		
	}
