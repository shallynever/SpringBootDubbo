/*
 *  ------------------------------------------------------------------
 *  Copyright © 2017 Hangzhou DtDream Technology Co.,Lt d. All rights reserved.
 *  ------------------------------------------------------------------
 *        Product: DTPAY
 *    Module Name: dtpay-center-dubbo
 *   Date Created: 2017-05-27
 *    Description:
 *  ------------------------------------------------------------------
 *  Modification History
 *  DATE            Name           Description
 *  ------------------------------------------------------------------
 *  2017-05-27     荆轲 0888
 *  ------------------------------------------------------------------
 */
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
