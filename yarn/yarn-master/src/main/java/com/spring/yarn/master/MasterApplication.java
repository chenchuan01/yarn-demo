package com.spring.yarn.master;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class MasterApplication {
	public static void main(String[] args) {
		SpringApplication.run(MasterApplication.class, args);
	}
}
