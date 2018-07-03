package com.jary.rs.jaryrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootTemplateApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootTemplateApplication.class, args);
	}
}
