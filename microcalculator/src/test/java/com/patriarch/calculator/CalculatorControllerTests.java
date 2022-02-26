package com.patriarch.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class CalculatorControllerTests {
	
	CalculatorController controller = new CalculatorController();

	@Test
	void testSum() {
		double result = controller.sum(4.3, 5.5);
		
		assertEquals(9.8, result, 0.0);
	}

	@Test
	void testSub() {
		double result = controller.sub(10.4, 3.5);
		
		assertEquals(6.9, result, 0.0);
		
	}
}
