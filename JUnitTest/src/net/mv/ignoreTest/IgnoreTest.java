package net.mv.ignoreTest;

import org.junit.Ignore;
import org.junit.Test;

/***
 * 
 * @author Binh Pham
 * Ignore certain methods for unit test
 */
public class IgnoreTest {

	/*
	 * JUnit will not test the method below
	 */
	@Ignore("Not ready to run")
	@Test
	public void divisionWithException() {
		System.out.println("Method is not ready yet!");
	}
}
