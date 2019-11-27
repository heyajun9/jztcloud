package com.jzt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Admin
 * @create 2019-11-20 16:59
 * @desc
 **/
@RestController
public class OrderController {
    @RequestMapping("/getOrder")
    public Object getPower(){
       Map<String,Object> map=new HashMap<>();
       map.put("key","order1");
       return map;
    }

}
