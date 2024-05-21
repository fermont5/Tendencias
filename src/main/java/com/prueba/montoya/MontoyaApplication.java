package com.prueba.montoya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class MontoyaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MontoyaApplication.class, args);
	}

}
