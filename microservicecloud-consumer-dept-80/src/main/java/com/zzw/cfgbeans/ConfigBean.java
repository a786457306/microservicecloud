package com.zzw.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Author: Daydreamer
 * Date:2019/10/13
 */

// 即spring中的applicationContext.xml
@Configuration
public class ConfigBean {

    // 配置bean id，返回bean对应的class的对象
    // 配置restTemplate以便于远程调用
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
