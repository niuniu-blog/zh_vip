package com.vip.zh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author zhangxinqiang
 */
@SpringBootApplication
@EnableScheduling
@MapperScan("com.vip.zh.dao")
public class ZhApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhApplication.class, args);
    }

}
