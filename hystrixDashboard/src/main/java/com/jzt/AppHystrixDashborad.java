package com.jzt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author Admin
 * @create 2019-11-27 17:03
 * @desc
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class AppHystrixDashborad {
    public static void main(String[] args) {
        SpringApplication.run(AppHystrixDashborad.class);
    }
}
