package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GTest {
	G g7=new G();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTest7() {
		assertEquals(3121.60,g7.test7(1000, 0.02, 3),0.01);
	}

}
