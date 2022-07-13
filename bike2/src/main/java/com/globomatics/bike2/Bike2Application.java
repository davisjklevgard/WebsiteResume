package com.globomatics.bike2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class Bike2Application {

    public static void main(String[] args) {
        SpringApplication.run(Bike2Application.class, args);
    }

}
