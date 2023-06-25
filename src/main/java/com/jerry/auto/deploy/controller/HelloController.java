package com.jerry.auto.deploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(("/hello"))
public class HelloController {

    @GetMapping("/path")
    public Map<String, Object> path() {
        Map<String, Object> rst = new HashMap<>();
        rst.put("姓名", "p");
        rst.put("年龄", 123);

        return rst;
    }

}
