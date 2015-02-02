import static org.junit.Assert.*;

import org.junit.Test;


public class SimpleStackTestCase {

	@Test
	public void testGetOutput() {
		SimpleStack s1 = new SimpleStack(new int[]{5,3,4,-1,-1});
		assertEquals(7,s1.getOutput());
		SimpleStack s2 = new SimpleStack(new int[]{5,-1,3,-1,4});
		assertEquals(8,s2.getOutput());
		SimpleStack s3 = new SimpleStack(new int[]{5,-1,-1,-1,3,-1,4});
		assertEquals(8,s3.getOutput());
	}

}
