package com.ibm.unittesting.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.ibm.unittesting.math.Arthimetic;

class ArithmeticTest {

	static Arthimetic arthimetic;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		arthimetic = new Arthimetic();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	final void testSum() {
//		fail("Not yet implemented");
		int expectedResult = 6;
		int actualResult = arthimetic.sum(4, 2);
		assertEquals(expectedResult, actualResult);
	}
	
	@ParameterizedTest
	@CsvSource({ "2, 3, 5", "-1, 1, 0", "0, 0, 0", "10, -5, 5" })
	void testSum(int num1, int num2, int expectedResult) {
		assertEquals(expectedResult, arthimetic.sum(num1, num2));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1,3,5,-3,15, Integer.MAX_VALUE })
	void testOdd(int number) {
		assertTrue(number % 2 != 0);
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "racec", "radar", "level", "rotor" })
	void testLength(String text) {
		assertTrue(text.length()==5);
	}
	
	@ParameterizedTest
	@CsvSource({ "apple, 5", "banana, 6", "'', 0", "hello Ibmer, 11" })
	void testStringLength(String input, int expectedLength) {
		assertEquals(expectedLength, input.length());
	}
	
}
