package com.stolaine.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.stolaine.spring.model"})
public class CDPlayerConfig {
}
