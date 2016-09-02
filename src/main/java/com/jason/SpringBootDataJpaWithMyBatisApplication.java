package com.jason;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@MapperScan(value = "com.jason.entity.mybatis")
public class SpringBootDataJpaWithMyBatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaWithMyBatisApplication.class, args);
	}
}
