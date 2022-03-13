package com.jeespring.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatewayOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayOrderApplication.class, args);
    }

}
