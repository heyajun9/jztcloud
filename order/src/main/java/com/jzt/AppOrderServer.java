package com.jzt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Admin
 * @create 2019-11-20 16:59
 * @desc
 **/
@SpringBootApplication
@EnableEurekaClient
public class AppOrderServer {
    public static void main(String[] args) {
        SpringApplication.run(AppOrderServer.class);
    }
}
