package net.mv.suitTest;


import net.mv.basicUsage.JUnitTest1;
import net.mv.expectedException.JUnitTest2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	JUnitTest1.class,
	JUnitTest2.class
})
public class JUnitTest5 {

}
