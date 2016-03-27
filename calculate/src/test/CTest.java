package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CTest {
	C c1=new C();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(1060.90,c1.test3(1000, 2, 0.03),0.2);
	}

}
