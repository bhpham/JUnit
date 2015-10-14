package net.mv.ignoreTest;

import org.junit.Ignore;
import org.junit.Test;

public class JUnitTest3 {

	@Ignore("Not ready to run")
	@Test
	public void ignoreThisMethod() {
		System.out.println("This method is not ready yet");
	}
}
