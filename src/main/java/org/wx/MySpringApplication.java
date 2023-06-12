package org.wx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wuxin
 * @date 2023/06/12 14:20:24
 */
@SpringBootApplication
@MapperScan(basePackages = {"org.wx.dao"})
public class MySpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(MySpringApplication.class, args);
    }
}
