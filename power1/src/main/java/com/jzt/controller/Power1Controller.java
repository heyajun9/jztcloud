package com.jzt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Admin
 * @create 2019-11-20 17:09
 * @desc
 **/
@RestController
public class Power1Controller {
    @RequestMapping("/getPower")
    public Object getPower(){
        Map<String,Object> map=new HashMap<>();
        map.put("key","power1");
        return map;
    }
}
