package com.kunming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.mybatis.spring.annotation.MapperScan;

@RestController
@SpringBootApplication
@MapperScan("com.kunming.mysqldemo.dao")
public class Oppo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Oppo1Application.class, args);
//		BigDecimal a1=new BigDecimal("23.546565214585");
//		BigDecimal a2=new BigDecimal("3.546565214585");
//		System.out.println(a1.compareTo(a2));
	}


}
