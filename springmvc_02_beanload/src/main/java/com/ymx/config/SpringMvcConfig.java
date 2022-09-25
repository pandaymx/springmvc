package com.ymx.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// 将该类设置为配置类
@ComponentScan("com.ymx.controller")
public class SpringMvcConfig {

}