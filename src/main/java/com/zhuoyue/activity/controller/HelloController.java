package com.zhuoyue.activity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello "+name+"，this is first messge";
    }
    
    
    @RequestMapping("/hello2")
    public String index2(@RequestParam String name) {
        return "hello  22222 "+name+"，this is first messge";
    }
    
    
}