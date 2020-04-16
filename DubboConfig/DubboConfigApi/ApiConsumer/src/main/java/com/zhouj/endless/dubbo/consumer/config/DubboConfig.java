package com.zhouj.endless.dubbo.consumer.config;

import com.zhouj.endless.dubbo.service.api.DemoService;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ConsumerConfig;
import org.apache.dubbo.config.MethodConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 天启
 * @date 2020-04-16 3:48 下午
 * @description
 */
@Configuration
public class DubboConfig {
    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("api-consumer");
        return applicationConfig;
    }

    @Bean
    public ConsumerConfig consumerConfig() {
        ConsumerConfig consumerConfig = new ConsumerConfig();
        consumerConfig.setTimeout(30000);
        consumerConfig.setCheck(false);
        consumerConfig.setRetries(3);
        consumerConfig.setVersion("1.0.0");
        return consumerConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setPort(2181);
        registryConfig.setAddress("127.0.0.1");
        registryConfig.setCheck(true);
        registryConfig.setProtocol("zookeeper");
        return registryConfig;
    }

    @Bean
    public ReferenceConfig<DemoService> referenceConfig() {
        ReferenceConfig<DemoService> referenceConfig = new ReferenceConfig<>();
        referenceConfig.setInterface(DemoService.class);
        referenceConfig.setVersion("1.0.0");
        referenceConfig.setTimeout(10000);

        //配置每一个method的属性
        MethodConfig config = new MethodConfig();
        config.setName("sayHello");
        config.setTimeout(20000);
        config.setRetries(3);

        //将method的设置关联到service配置中
        List<MethodConfig> methodConfig = new ArrayList<>();
        methodConfig.add(config);
        referenceConfig.setMethods(methodConfig);
        return referenceConfig;
    }
}
