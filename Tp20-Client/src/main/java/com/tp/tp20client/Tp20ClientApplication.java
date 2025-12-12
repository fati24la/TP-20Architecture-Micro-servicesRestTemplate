package com.tp.tp20client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Tp20ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp20ClientApplication.class, args);
    }

}
