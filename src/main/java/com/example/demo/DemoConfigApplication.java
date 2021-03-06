package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.bean.TestBean;

@SpringBootApplication
@Configuration
@EnableConfigServer
@EnableEurekaClient
public class DemoConfigApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoConfigApplication.class, args);
  }

  @Bean(initMethod = "init", destroyMethod = "close")
  public TestBean getTestBean() {
    return new TestBean();
  }
}
