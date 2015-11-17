package aleteo.digital.prueba;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMultiplica {

	
	@Before
	public void setUp(){
		
	}
	
	@Test
	public void test() {
		assertEquals(4, Prueba.multiplica());
	}

}
