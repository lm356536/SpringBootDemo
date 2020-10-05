package com.liming.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.liming.mapper")
public class MyBatisPlusConfig {

}
