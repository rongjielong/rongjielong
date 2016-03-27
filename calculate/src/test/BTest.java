package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BTest {
	B b1=new B();
	@Before
	public void setUp() throws Exception {
	}

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		
		 assertEquals(1150.00,b1.test2(1000, 5, 0.03),0.1);
	}

}
