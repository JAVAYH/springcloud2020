package com.sdmc.springcloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/test")
@Controller
public class Test {

    @RequestMapping("/hello")
    @ResponseBody
    public String test() {
        return "test";
    }
}
