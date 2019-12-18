package com.tcwong.mongodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MongoTemplateController {

    @Autowired
    @Qualifier("firstMongoTemplate")
    private MongoTemplate firstMongoTemplate;

    @Autowired
    @Qualifier("secondMongoTemplate")
    private MongoTemplate secondMongoTemplate;

    @GetMapping("/firstMongoTemplate")
    public void firstTemplate() {
        Map<Object, Object> map = new HashMap<>();
        map.put("数据库", "firstMongoTemplate");
        firstMongoTemplate.insert(map, "firstDB");
    }

    @GetMapping("/secondMongoTemplate")
    public void secondTemplate() {
        Map<Object, Object> map = new HashMap<>();
        map.put("数据库", "secondMongoTemplate");
        secondMongoTemplate.insert(map, "secondDB");
    }


}
