package com.tcwong.mongodb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Set;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test1() {
        return "hello ";
    }

    @PostMapping("/test2")
    public void test2(@RequestBody Map<Object,Object> map) {
        Set<Object> objects = map.keySet();
        for (Object object : objects) {
            Object o = map.get(object);
            System.out.println(o);
        }
    }

}