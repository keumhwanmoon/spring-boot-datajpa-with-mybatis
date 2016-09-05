package com.jason.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author jason, Moon
 * @since 2016. 9. 2.
 */
@Configuration
@MapperScan(value = "com.jason.mapper")
public class MyBatisConfig {
}
