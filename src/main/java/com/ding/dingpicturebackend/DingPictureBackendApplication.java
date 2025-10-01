package com.ding.dingpicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.ding.dingpicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class DingPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(DingPictureBackendApplication.class, args);
    }

}
