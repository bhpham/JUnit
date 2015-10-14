package net.mv.unitTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitTest {

	private Collection collection;
	
	@BeforeClass
	public static void oneTimeSetUp() {
		//One-time inilization code
		System.out.println("@BeforeClass - oneTimeSetUp");
	}
	
	@AfterClass
	public static void oneTimeTearDown() {
		//One-time cleanup code
		System.out.println("@AfterClass - oneTimeTearDown");
	}
	
	@Before
    public void setUp() {
        collection = new ArrayList();
        System.out.println("@Before - setUp");
    }

    @After
    public void tearDown() {
        collection.clear();
        System.out.println("@After - tearDown");
    }

    @Test
    public void testEmptyCollection() {
        assertTrue(collection.isEmpty());
        System.out.println("@Test - testEmptyCollection");
    }

    @Test
    public void testOneItemCollection() {
        collection.add("itemA");
        assertEquals(1, collection.size());
        System.out.println("@Test - testOneItemCollection");
    }
}