package com.patriarch.calculator.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.patriarch.calculator.service.CalculatorService;

class CalculatorControllerTests {

	private CalculatorController calculatorController;

	@Mock
	private CalculatorService calculatorService;

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.openMocks(this);
		calculatorController = new CalculatorController(calculatorService);
	}

	@Test
	void testAdd() {
		double expected = 4.2 + 5.6;
		when(calculatorService.add(anyDouble(), anyDouble())).thenReturn(expected);

		double result = calculatorController.add(4.2, 5.6);

		assertEquals(expected, result, 0.0);
	}

	@Test
	void testSubtract() {
		double expected = 10.4 - 3.5;
		when(calculatorService.subtract(anyDouble(), anyDouble())).thenReturn(expected);

		double result = calculatorController.subtract(10.4, 3.5);

		assertEquals(expected, result, 0.0);
	}

}
