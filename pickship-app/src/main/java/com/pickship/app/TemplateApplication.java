package com.pickship.app;

import static com.pickship.app.TemplateApplicationConstants.BASE_PACKAGE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author v8
 * Created by kropfcar on 21.06.19.
 */
@SpringBootApplication
@ComponentScan(basePackages = BASE_PACKAGE)
@EntityScan(basePackages = BASE_PACKAGE)
public class TemplateApplication {
	public static void main(String[] args) {
		SpringApplication.run(TemplateApplication.class, args);
	}
}
