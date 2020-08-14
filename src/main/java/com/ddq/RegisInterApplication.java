package com.ddq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ddq.dao")
public class RegisInterApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisInterApplication.class, args);
	}

}
