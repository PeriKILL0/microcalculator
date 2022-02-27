package com.patriarch.calculator.service;

/**
 * Calculator service interface.
 * 
 * @author JFP
 *
 */
public interface CalculatorService {
	/**
	 * Adds two values.
	 * 
	 * @param value1 First value.
	 * @param value2 Second value.
	 * @return Sum.
	 */
	public double sum(double value1, double value2);

	/**
	 * Subtracts two values.
	 * 
	 * @param value1 First value.
	 * @param value2 Second value.
	 * @return Subtraction.
	 */
	public double sub(double value1, double value2);
}
