package com.zhouj.endless.dubbo.consumer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author 天启
 * @date 2020-04-16 11:21 上午
 * @description
 */
@Configuration
@ImportResource(locations = "classpath:dubbo-consumer.xml")
public class DubboConfig {
}
