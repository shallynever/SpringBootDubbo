package com.zhouj.endless.dubbo.provider.config;

import com.zhouj.endless.dubbo.provider.service.DemoServiceImpl;
import com.zhouj.endless.dubbo.service.api.DemoService;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.MethodConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.ProviderConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 天启
 * @date 2020-04-16 3:17 下午
 * @description
 */
@Configuration
public class DubboConfig {

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("user-service-provider");
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("127.0.0.1");
        registryConfig.setPort(2181);
        registryConfig.setProtocol("zookeeper");
        registryConfig.setCheck(false);
        return registryConfig;
    }

    @Bean
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20880);
        return protocolConfig;
    }

    @Bean
    public ServiceConfig<DemoService> serviceConfig(DemoServiceImpl demoService) {
        ServiceConfig<DemoService> serviceConfig = new ServiceConfig<>();
        serviceConfig.setInterface(DemoService.class);
        serviceConfig.setRef(demoService);
        serviceConfig.setVersion("1.0.0");
        //配置每一个method的属性
        MethodConfig methodConfig = new MethodConfig();
        methodConfig.setName("sayHello");
        methodConfig.setTimeout(3000);
        methodConfig.setRetries(1);
        //将method的设置关联到service的配置中
        List<MethodConfig> methods = new ArrayList();
        methods.add(methodConfig);
        serviceConfig.setMethods(methods);
        return serviceConfig;
    }

    @Bean
    public ProviderConfig providerConfig() {
        ProviderConfig providerConfig = new ProviderConfig();
        providerConfig.setTimeout(3000);
        providerConfig.setRetries(3);
        return providerConfig;
    }

}
