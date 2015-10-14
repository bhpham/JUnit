package net.mv.timeTest;

import org.junit.Test;

/***
 * 
 * @author Binh Pham
 * Make sure the testing method will return after certain time
 */
public class TimeTest {

	/*
	 * infinity() will not return, so the JUnit engine will mark it as failed and throw an exception
	 */
	@Test(timeout = 1000)
	public void infinity() {
		while(true);
	}
}
