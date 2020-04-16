package com.zhouj.endless.dubbo.consumer.controller;

import com.zhouj.endless.dubbo.service.api.DemoService;
import org.apache.dubbo.config.ReferenceConfig;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 天启
 * @date 2020-04-16 3:48 下午
 * @description
 */
@RestController
public class DemoServiceController {
    @Resource
    private ReferenceConfig<DemoService> referenceConfig;

    @RequestMapping("/hello")
    public String sayHello(@RequestParam("name") String name) {
        return referenceConfig.get().sayHello(name);
    }
}
