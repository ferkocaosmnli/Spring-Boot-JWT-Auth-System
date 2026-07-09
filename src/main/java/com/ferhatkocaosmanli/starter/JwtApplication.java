package com.ferhatkocaosmanli.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"com.ferhatkocaosmanli"})
@EntityScan(basePackages = {"com.ferhatkocaosmanli"})
@EnableJpaRepositories(basePackages = {"com.ferhatkocaosmanli"})
@SpringBootApplication
public class JwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtApplication.class, args);
	}

}
