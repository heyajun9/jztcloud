package com.jzt;

import com.config.OrderRibbonConfig;
import com.config.PowerRibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Admin
 * @create 2019-11-20 16:46
 * @desc
 **/
@SpringBootApplication
@EnableEurekaClient
@RibbonClients({@RibbonClient(name="SERVER-ORDER",configuration = OrderRibbonConfig.class),
                 @RibbonClient(name="SERVER-POWER",configuration= PowerRibbonConfig.class)})
@EnableFeignClients
@EnableHystrix
public class AppUserClient {
    public static void main(String[] args) {
        SpringApplication.run(AppUserClient.class);
    }
}
