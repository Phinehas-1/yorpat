package com.bigdecimal.yorpat;

import org.springframework.boot.SpringApplication;

public class TestYorpatApplication {

	public static void main(String[] args) {
		SpringApplication.from(YorpatApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
