import static org.junit.Assert.*;

import org.junit.Test;


public class PostFixOperationTest {

	@Test
	public void testGetOutput() {
		PostFixOperation s1 = new PostFixOperation("53+2*");
		assertEquals(16,s1.getOutput());
		PostFixOperation s2 = new PostFixOperation("43-56+*");
		assertEquals(11,s2.getOutput());
		PostFixOperation s3 = new PostFixOperation("22+48+*");
		assertEquals(48,s3.getOutput());
	}

}
