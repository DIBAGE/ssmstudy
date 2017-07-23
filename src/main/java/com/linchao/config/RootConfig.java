package com.linchao.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author : linchao
 * @date : 2017/7/23.
 * @description :
 */
@Configuration
@ComponentScan(basePackages = {"com.linchao"},
    excludeFilters = {@ComponentScan.Filter(type= FilterType.ANNOTATION, value = EnableWebMvc.class)})
public class RootConfig {
}
