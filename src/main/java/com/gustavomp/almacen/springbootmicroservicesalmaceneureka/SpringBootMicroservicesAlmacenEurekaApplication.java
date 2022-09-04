package com.gustavomp.almacen.springbootmicroservicesalmaceneureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // Habilitando como servidor
public class SpringBootMicroservicesAlmacenEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroservicesAlmacenEurekaApplication.class, args);
	}

}
