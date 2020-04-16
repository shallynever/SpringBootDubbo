package com.zhouj.endless.dubbo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 天启
 * @date 2020-04-15 4:19 下午
 * @description 消费者启动
 */
@SpringBootApplication
public class AnnotationConsumer {
    public static void main(String[] args) {
        SpringApplication.run(AnnotationConsumer.class, args);
    }
}
