package com.jzt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Admin
 * @create 2019-11-20 17:08
 * @desc
 **/
@SpringBootApplication
@EnableEurekaClient
public class AppPowerServer1 {
    public static void main(String[] args) {
        SpringApplication.run(AppPowerServer1.class);
    }
}
