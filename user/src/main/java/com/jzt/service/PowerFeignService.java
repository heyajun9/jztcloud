package com.jzt.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Admin
 * @create 2019-11-21 19:50
 * @desc  feign整合hystrix服务访问
 **/
@FeignClient(name="SERVER-POWER",fallback = PowerFeignServiceImpl.class)
public interface PowerFeignService {
    @RequestMapping("/getPower")
    public Object getPower();
}
