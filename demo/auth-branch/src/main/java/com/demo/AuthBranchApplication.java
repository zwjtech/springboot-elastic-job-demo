package com.demo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin//允许跨越访问
@SpringBootApplication//springBoot项目入口
@EnableDubboConfiguration  //dubbo加载
@MapperScan(basePackages = "com.demo.dao")
@ComponentScan(basePackages = "com.demo")
@ImportResource(locations = {"classpath:elastic-job.xml"})
public class AuthBranchApplication {
	public static void main(String[] args) {
		SpringApplication.run(AuthBranchApplication.class, args);
	}
}
