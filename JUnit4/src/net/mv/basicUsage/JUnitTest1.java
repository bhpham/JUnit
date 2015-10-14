package net.mv.basicUsage;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/***
 * 
 * @author Binh Pham
 * 
 */
public class JUnitTest1 {

	private Collection collection;
	
	@BeforeClass
	public static void oneTimeSetUp() {
		System.out.println("@BeforeClass - OneTimeSetUp");
	}
	
	@AfterClass
	public static void oneTimeTearDown() {
		System.out.println("@AfterClass - OneTimeTearDown");
	}
	
	@Before
	public void setUp() {
		collection = new ArrayList();
		System.out.println("@Before - SetUp");
	}
	
	@After
	public void tearDown() {
		collection.clear();
		System.out.println("@After - TearDown");
	}
	
	@Test
	public void testEmptyCollection() {
		assertTrue(collection.isEmpty());
		System.out.println("@Test - TestEmptyCollection");
	}
	
	@Test
	public void testOneItemCollection() { 
		collection.add("Item A");
		assertEquals(1, collection.size());
		System.out.println("@Test - TestOneItemCollection");
		
	}
}
