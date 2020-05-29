package com.intecsec.mall.order;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @description:
 * @author: peter.peng
 * @create: 2020-02-12 21:03
 **/
@SpringBootApplication
@EnableDubbo
public class OrderApp {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrderApp.class);
    }
}
