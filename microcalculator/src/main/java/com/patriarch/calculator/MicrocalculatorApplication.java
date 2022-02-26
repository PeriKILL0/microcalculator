package com.patriarch.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.corp.calculator.TracerImpl;

@SpringBootApplication
@RestController
@RequestMapping(path = "/calculator")
public class MicrocalculatorApplication {

	TracerImpl tracer = new TracerImpl();

	@RequestMapping("/sum")
	public double sum(@RequestParam(name = "op1", defaultValue = "0") double op1,
			@RequestParam(name = "op2", defaultValue = "0") double op2) {
		double result = op1 + op2;
		tracer.trace(result);
		return result;
	}

	@RequestMapping("/sub")
	public double sub(@RequestParam(name = "op1", defaultValue = "0") double op1,
			@RequestParam(name = "op2", defaultValue = "0") double op2) {
		double result = op1 - op2;
		tracer.trace(result);
		return result;
	}

	public static void main(String[] args) {
		SpringApplication.run(MicrocalculatorApplication.class, args);
	}

}
