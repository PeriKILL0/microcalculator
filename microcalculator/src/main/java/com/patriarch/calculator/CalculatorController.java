package com.patriarch.calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

	@RequestMapping("/sum")
	public double sum(@RequestParam(name = "op1", defaultValue = "0") double op1, @RequestParam(name = "op2", defaultValue = "0") double op2) {		
		return op1 + op2;
	}
}
