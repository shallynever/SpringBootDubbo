package com.zhouj.endless.dubbo.provider.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * dubbo配置类
 *
 * @author zero
 */
@Configuration
@ImportResource(locations = "classpath:dubbo-provider.xml")
public class DubboConfig {
}
