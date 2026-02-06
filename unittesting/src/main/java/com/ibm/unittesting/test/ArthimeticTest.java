package com.ibm.unittesting.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ibm.unittesting.math.Arthimetic;

public class ArthimeticTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Start of class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("End of class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Start of each method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("End of each method");
	}

	@Test
	public void test() {
		int expectedResult=6;
		Arthimetic arthimetic = new Arthimetic();
		int actualResult=arthimetic.sum(2, 4);
		
		assertEquals("comparing results: ",expectedResult, actualResult);
//		fail("Not yet implemented");
	}

}
