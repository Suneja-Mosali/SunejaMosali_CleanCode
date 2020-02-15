package q1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleInterestTest {

	SimpleInterest object=new SimpleInterest();
	private static final double DELTA = 1e-15;
	@Test
	public void test() {
		String s="SimpleIntrest";
		assertEquals(576.0,object.IntrestMethod(s,1200,2,24.0),DELTA);
	}

}
