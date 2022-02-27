package com.patriarch.calculator.service;

import org.springframework.stereotype.Component;

import io.corp.calculator.TracerImpl;

/**
 * Calculator service implementation.
 * 
 * @author JFP
 *
 */
@Component
public class CalculatorServiceImpl implements CalculatorService {

	/**
	 * Tracer.
	 */
	private final TracerImpl tracer;

	/**
	 * Default constructor.
	 */
	public CalculatorServiceImpl() {
		this.tracer = new TracerImpl();
	}

	/**
	 * Private constructor.
	 * 
	 * @param tracer Tracer.
	 */
	CalculatorServiceImpl(TracerImpl tracer) {
		this.tracer = tracer;
	}

	@Override
	public double add(double value1, double value2) {
		double result = value1 + value2;
		if (null != tracer) {
			tracer.trace(result);
		}
		return result;
	}

	@Override
	public double subtract(double value1, double value2) {
		double result = value1 - value2;
		if (null != tracer) {
			tracer.trace(result);
		}
		return result;
	}

}
