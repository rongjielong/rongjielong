package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FTest {
	F f1=new F();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTest6() {
		assertEquals(0.084,f1.test6(300000, 200000, 5),0.01);
	}

}
