package com.zhouj.endless.dubbo.consumer.controller;

import com.zhouj.endless.dubbo.api.service.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 天启
 * @date 2020-04-15 4:28 下午
 * @description Dubbo消费者
 */
@RestController
public class DemoServiceController {
    @Reference(version = "1.0.0", url = "dubbo://127.0.0.1:12345")
    private DemoService demoService;

    @RequestMapping("/hello")
    public String sayHello(@RequestParam("name") String name) {
        return demoService.sayHello(name);
    }

}
