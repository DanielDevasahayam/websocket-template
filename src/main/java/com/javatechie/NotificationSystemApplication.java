package com.javatechie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
		"com.admin.dashboard",
		"com.javatechie"
})
public class NotificationSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationSystemApplication.class, args);
	}

}
