package com.jzt.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author Admin
 * @create 2019-11-20 16:52
 * @desc
 **/
@Configuration
public class AppConfig {
    @Bean
    @LoadBalanced  //采用ribbon进行客户端负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

//    @Bean
//    public IRule iRule(){
//        return new RandomRule();
//    }

//    @Bean
//    public TomcatServletWebServerFactory tomcat(){
//        TomcatServletWebServerFactory tomcatServletWebServerFactory=new TomcatServletWebServerFactory();
//        tomcatServletWebServerFactory.setPort(5000);
//        return tomcatServletWebServerFactory;
//    }


}
