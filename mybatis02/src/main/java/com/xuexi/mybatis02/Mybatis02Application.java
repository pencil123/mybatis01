package com.xuexi.mybatis02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xuexi.mybatis02.dao")
public class Mybatis02Application {

  public static void main(String[] args) {
    SpringApplication.run(Mybatis02Application.class, args);
  }
}
