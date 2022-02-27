package com.patriarch.calculator.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorControllerTests {

	private CalculatorController calculatorController;

	@BeforeEach
	void setUp() throws Exception {
		calculatorController = new CalculatorController();
	}

	@Test
	void testAdd() {
		double result = calculatorController.add(4.2, 5.6);

		assertEquals(9.8, result, 0.0);
	}

	@Test
	void testSubtract() {
		double result = calculatorController.subtract(10.4, 3.5);

		assertEquals(6.9, result, 0.0);
	}

}
