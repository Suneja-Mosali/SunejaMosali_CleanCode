package q1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompoundInsterestTest {

	CompoundInsterest object=new CompoundInsterest();
	private static final double DELTA = 1e-15;
	@Test
	public void test() {
		String s="CompoundIntrest";
		assertEquals(645.1200000000001,object.IntrestMethod(s,1200,2,24.0),DELTA);
	}
}
