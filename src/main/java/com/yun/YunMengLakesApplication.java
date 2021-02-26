package com.yun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@MapperScan("com.yun.mapper")//标记扫描的mapper位置
public class YunMengLakesApplication {

    public static void main(String[] args) {
        SpringApplication.run(YunMengLakesApplication.class, args);
    }

}
