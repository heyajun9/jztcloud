package com.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Admin
 * @create 2019-11-21 19:36
 * @desc
 **/
@Configuration
public class OrderRibbonConfig {
    @Bean
    public IRule iRule(){
        return new RandomRule();
    }
}
