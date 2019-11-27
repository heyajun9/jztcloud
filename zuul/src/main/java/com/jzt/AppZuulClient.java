package com.jzt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Admin
 * @create 2019-11-27 14:50
 * @desc
 **/
@SpringBootApplication
@EnableZuulProxy
public class AppZuulClient {
    public static void main(String[] args) {
        SpringApplication.run(AppZuulClient.class);
    }
}
