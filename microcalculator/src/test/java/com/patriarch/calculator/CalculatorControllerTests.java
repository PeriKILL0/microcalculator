package com.patriarch.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorControllerTests {
	
	CalculatorController controller = new CalculatorController();

	@Test
	void testSum() {
		Double result = controller.sum(4.3, 5.5);
		
		assertEquals(9.8, result);
	}

}
