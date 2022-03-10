package com.jeespring.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Pay01Application {

    public static void main(String[] args) {
        SpringApplication.run(Pay01Application.class, args);
    }

}
