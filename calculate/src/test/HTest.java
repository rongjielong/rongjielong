package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HTest {
	H h1=new H();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTest8() {
		assertEquals(79770.71,h1.test8(5000000, 0.06, 30),0.5);
	}

}
