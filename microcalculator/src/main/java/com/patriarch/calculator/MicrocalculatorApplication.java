package com.patriarch.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.corp.calculator.TracerImpl;

@SpringBootApplication
@RestController
public class MicrocalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrocalculatorApplication.class, args);
	}

}
