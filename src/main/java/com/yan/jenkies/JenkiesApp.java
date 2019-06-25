package com.yan.jenkies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkiesApp {

    @RequestMapping("/index")
    public String test(){
        String str= "测试自动化部署！";
        return str;
    }

    public static void main(String[] args) {
        SpringApplication.run(JenkiesApp.class);
    }
}
