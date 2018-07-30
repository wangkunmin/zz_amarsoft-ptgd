package com.xj.amarspi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xj.amarspi.dao")//将项目中对应的dao类的路径加进来就可以了
public class AmarspiApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmarspiApplication.class, args);
    }
}
