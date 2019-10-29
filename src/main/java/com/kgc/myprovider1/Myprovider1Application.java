package com.kgc.myprovider1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Myprovider1Application {

    public static void main(String[] args) {
        SpringApplication.run(Myprovider1Application.class, args);
    }

}
