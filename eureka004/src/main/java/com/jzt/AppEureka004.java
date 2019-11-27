package com.jzt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Admin
 * @create 2019-11-21 8:49
 * @desc
 **/
@SpringBootApplication
@EnableEurekaServer
public class AppEureka004 {
    public static void main(String[] args) {
        SpringApplication.run(AppEureka004.class);
    }
}
