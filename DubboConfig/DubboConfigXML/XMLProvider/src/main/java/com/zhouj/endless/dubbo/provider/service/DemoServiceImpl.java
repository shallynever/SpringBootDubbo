package com.zhouj.endless.dubbo.provider.service;

import com.zhouj.endless.dubbo.service.api.DemoService;
import org.springframework.stereotype.Service;

/**
 * @author 天启
 * @date 2020-04-16 11:05 上午
 * @description
 */
@Service(value = "demoService")
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello," + name;
    }
}
