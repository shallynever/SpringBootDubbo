package com.zhouj.endless.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 天启
 * @date 2020-04-15 4:18 下午
 * @description 提供者启动
 */
@SpringBootApplication
public class  AnnotationProvider{
    public static void main(String[] args) {
        SpringApplication.run(AnnotationProvider.class, args);
    }
}
