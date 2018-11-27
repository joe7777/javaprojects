package com.in28minutes.springboot.microservice.example.currencyconversion.spring_boot_microservice_currency_conversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.in28minutes.springboot.microservice.example.currencyconversion")
@EnableDiscoveryClient
public class SpringBootMicroserviceCurrencyConversion 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(SpringBootMicroserviceCurrencyConversion.class, args);
    }
}
