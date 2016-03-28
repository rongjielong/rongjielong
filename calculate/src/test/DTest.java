package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DTest {
	D d1=new D();
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void test() {
	
		assertEquals(1000.00,d1.test4(1300, 0.03, 10),0.1);
	}

}
