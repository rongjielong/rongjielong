package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ETest {
	E e1=new E();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(86383.76,e1.test5(100000, 0.05, 3),0.05);
	}

}
