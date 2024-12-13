package com.sms.Spring_boot_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.sms.Spring_boot_backend")
public class SpringBootBackendApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendApplication.class, args);
	}
}
