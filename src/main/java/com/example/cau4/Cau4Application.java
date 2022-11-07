package com.example.cau4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Cau4Application {

    public static void main(String[] args) {
        SpringApplication.run(Cau4Application.class, args);
    }

}
