package com.tcwong.demo.controller;

import com.tcwong.demo.bean.Student;
import com.tcwong.demo.bean.StudentExample;
import com.tcwong.demo.dao.mysql.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    StudentMapper studentMapper;

    @GetMapping("/test1")
    public Object test1() {
        StudentExample studentExample = new StudentExample();
        List<Student> students = studentMapper.selectByExample(studentExample);
        return students;
    }
}
