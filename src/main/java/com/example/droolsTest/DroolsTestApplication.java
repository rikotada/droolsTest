package com.example.droolsTest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(basePackages = {"com.example.droolsTest.DroolsTestLayer.Mapper"})
public class DroolsTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DroolsTestApplication.class, args);
	}
	


}
