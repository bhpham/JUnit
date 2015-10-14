package net.mv.expectedException;

import org.junit.Test;

/***
 * 
 * @author Binh Pham
 * Test the Exception throw by the method
 */
public class ExpectedExceptionTest {

	/**
	 * In the example below, the divisionWithException() method will throw an
	 * ArithmeticException Exception, since this is an expected exception, so
	 * the unit test will pass.
	 */
	@Test(expected = ArithmeticException.class)
	public void divisionWithException() {
		int i = 1 / 0;
	}
}
