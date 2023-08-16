package com.example.software.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName HelloController
 * Description
 * Create by luochuang
 * Date 2023/8/16 12:19 下午
 */
@RestController
public class HelloController {

    @RequestMapping(value = "hello1",method = RequestMethod.GET)
    public String hello1(){
        return "hello_1";
    }
}
