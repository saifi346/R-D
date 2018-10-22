package com.bank.withdraw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BankWithdrawApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankWithdrawApplication.class, args);
	}
}
