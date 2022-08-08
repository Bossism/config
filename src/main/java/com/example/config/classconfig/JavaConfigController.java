package com.example.config.classconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
@RequestMapping("/javaconfig")
public class JavaConfigController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("/hello")
    public String hello() {
        String h = "hello";
        String y = "yyy";
        return h + y;
    }

}
