package com.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BankDeposit1Application {

	public static void main(String[] args) {
		SpringApplication.run(BankDeposit1Application.class, args);
	}
}
