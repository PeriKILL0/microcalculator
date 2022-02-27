package com.patriarch.calculator.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import io.corp.calculator.TracerImpl;

class CalculatorServiceImplTests {

	private CalculatorService calculator;

	@Mock
	private TracerImpl tracer;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
		calculator = new CalculatorServiceImpl(tracer);
	}

	@Test
	void testSum() {
		double result = calculator.sum(4.3, 5.5);

		assertEquals(9.8, result, 0.0);
		verify(tracer, times(1)).trace(result);
	}

	@Test
	void testSub() {
		double result = calculator.sub(10.4, 3.5);

		assertEquals(6.9, result, 0.0);
		verify(tracer, times(1)).trace(result);
	}

}
