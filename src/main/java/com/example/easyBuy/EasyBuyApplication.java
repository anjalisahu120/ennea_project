package com.example.easyBuy;

import com.example.easyBuy.Service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@EnableAutoConfiguration
@SpringBootApplication
public class EasyBuyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyBuyApplication.class, args);
	}

}
