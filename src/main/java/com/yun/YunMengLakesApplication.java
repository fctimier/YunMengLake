package com.yun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement(proxyTargetClass = true)
@EnableJpaRepositories(basePackages = {"com.yun.repository"})
@EntityScan(basePackages = {"com.yun.model"})
@SpringBootApplication
public class YunMengLakesApplication {

    public static void main(String[] args) {
        SpringApplication.run(YunMengLakesApplication.class, args);
    }

}
