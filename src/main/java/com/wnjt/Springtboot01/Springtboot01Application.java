package com.wnjt.Springtboot01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wnjt.Springtboot01.dao")
public class Springtboot01Application {

	public static void main(String[] args) {
		SpringApplication.run(Springtboot01Application.class, args);
	}

}
