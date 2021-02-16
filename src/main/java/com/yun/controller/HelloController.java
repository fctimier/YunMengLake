package com.yun.controller;

import com.yun.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping(value="/hello",produces = "text/html;charset=utf-8")
    public String hello(){
        return helloService.sayHello();
    }

    @GetMapping("/data")
    public List<String> getData(){
        List<String> list = new ArrayList<String>();
        for (int i = 0 ; i < 10 ; i++ ){
            list.add("com>>>"+i);
        }
        return list;
    }
}
