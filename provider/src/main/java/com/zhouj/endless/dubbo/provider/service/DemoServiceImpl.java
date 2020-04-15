package com.zhouj.endless.dubbo.provider.service;

import com.zhouj.endless.dubbo.api.service.DemoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author 天启
 * @date 2020-04-15 4:22 下午
 * @description Dubbo提供者
 */
@Service(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
