package com.jzt.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author Admin
 * @create 2019-11-27 14:37
 * @desc
 **/
@Component
public class PowerFeignServiceImpl implements PowerFeignService {
    @Override
    public Object getPower() {
        return "系统升级，请稍后访问";
    }
}
