package com.patriarch.calculator.service;

import io.corp.calculator.TracerImpl;

public class CalculatorServiceImpl implements CalculatorService {

	/**
	 * Tracer.
	 */
	private final TracerImpl tracer;
	
	public CalculatorServiceImpl() {
		this.tracer = new TracerImpl();
	}
	
	public CalculatorServiceImpl(TracerImpl tracer) {
		this.tracer = tracer;
	}

	@Override
	public double sum(double value1, double value2) {
		double result = value1 + value2;
		tracer.trace(result);
		return result;
	}

	@Override
	public double sub(double value1, double value2) {
		double result = value1 - value2;
		tracer.trace(result);
		return result;
	}

}
