package com.jzt.controller;

import com.jzt.service.PowerFeignService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Admin
 * @create 2019-11-20 16:48
 * @desc
 **/
@RestController
public class UserController {

    private final static String SERVER="SERVER-POWER";
    private final static String SERVER1="SERVER-ORDER";

    @Autowired
    private PowerFeignService powerFeignService;

    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("/getUser")
    public Object getUser(){
        Map<String,Object> map=new HashMap<>();
        map.put("key","user");
        return map;
    }
    @RequestMapping("/getOrder")
    public Object getOrder(){
        return restTemplate.getForObject("http://"+SERVER1+"/getOrder",Object.class);
    }

    /**
     * 降级，超时，熔断，限流
     * @return
     */
    @RequestMapping("/getPower")
    @HystrixCommand(fallbackMethod = "getFallBackPower",threadPoolKey  ="power",
                    threadPoolProperties = {
                     @HystrixProperty(name="coreSize",value="10")
                    }
    )
    public Object getPower(){
        return restTemplate.getForObject("http://"+SERVER+"/getPower",Object.class);
    }

    public Object getFallBackPower(){
        return "系统升级中，请重试";
    }
    /**
     * 采用feign方式，调用微服务（针对接口方式）
     * @return
     */
    @RequestMapping("/getFeignPower")
    public Object getFeignPower(){
          return powerFeignService.getPower();
    }
}
