package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ATest {
    A a1=new A();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		
		assertTrue (a1.test1(2));
	}

}
