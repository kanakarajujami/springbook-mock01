package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringBootVehicleAspectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootVehicleAspectApplication.class, args);
	}

}
