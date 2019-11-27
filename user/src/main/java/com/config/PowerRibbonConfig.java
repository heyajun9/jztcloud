package com.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Admin
 * @create 2019-11-21 19:37
 * @desc
 **/
@Configuration
public class PowerRibbonConfig {

    @Bean
    public IRule iRule(){
        return new RetryRule();
    }
}

