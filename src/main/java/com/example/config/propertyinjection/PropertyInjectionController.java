package com.example.config.propertyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
@RequestMapping("/propertyinjection")
public class PropertyInjectionController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("/hello")
    public String hello() {
        String h = "hello";
        return h;
    }

}
