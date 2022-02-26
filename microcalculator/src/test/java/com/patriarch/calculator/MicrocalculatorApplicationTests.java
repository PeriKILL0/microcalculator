package com.patriarch.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MicrocalculatorApplicationTests {

	MicrocalculatorApplication calculator = new MicrocalculatorApplication();

	@Test
	void testSum() {
		double result = calculator.sum(4.3, 5.5);
		
		assertEquals(9.8, result, 0.0);
	}

	@Test
	void testSub() {
		double result = calculator.sub(10.4, 3.5);
		
		assertEquals(6.9, result, 0.0);
		
	}

}
