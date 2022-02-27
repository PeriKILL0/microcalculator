package com.patriarch.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.patriarch.calculator.service.CalculatorService;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {
	
	@Autowired
	CalculatorService calculatorService;
	
	@RequestMapping("/add")
	public double add(@RequestParam(name = "value1", defaultValue = "0") double value1,
			@RequestParam(name = "value2", defaultValue = "0") double value2) {

		return calculatorService.add(value1, value2);
	}

	@RequestMapping("/subtract")
	public double subtract(@RequestParam(name = "value1", defaultValue = "0") double value1,
			@RequestParam(name = "value2", defaultValue = "0") double value2) {
		return calculatorService.subtract(value1, value2);
	}

}
