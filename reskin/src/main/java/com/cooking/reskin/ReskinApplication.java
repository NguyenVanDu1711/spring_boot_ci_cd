package com.cooking.reskin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReskinApplication {

	private static final String version = "2024-05-20";

	public static void main(String[] args) {
		SpringApplication.run(ReskinApplication.class, args);
	}
}
