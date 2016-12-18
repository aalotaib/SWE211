package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	Triangle t1 = new Triangle();

	@Test
	public void testTriangleType() {
		assertEquals(1 , t1.triangleType(5,6,3));
		

	}


}
