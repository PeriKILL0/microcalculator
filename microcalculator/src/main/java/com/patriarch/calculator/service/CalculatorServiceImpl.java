package com.patriarch.calculator.service;

import org.springframework.stereotype.Component;

import io.corp.calculator.TracerImpl;

@Component
public class CalculatorServiceImpl implements CalculatorService {

	/**
	 * Tracer.
	 */
	private TracerImpl tracer;

	public void setTracer(TracerImpl tracer) {
		this.tracer = tracer;
	}

	public CalculatorServiceImpl() {
		this.tracer = null;
	}

	public CalculatorServiceImpl(TracerImpl tracer) {
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
