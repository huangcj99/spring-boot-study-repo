package com.smallcatcat.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
 * Created by smallcatcat on 2017/12/14.
 */

@Component
@RestController
public class HelloController {

    @Value("${com.smallcatcat.demo.name}")
    private String name;

    @RequestMapping("/hello")
    public String index(){
        return "Hello World";
    }
}
