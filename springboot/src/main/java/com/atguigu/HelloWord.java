package com.atguigu;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 标准一个主程序类，说明这个一个srpingboot应用
 * @SpringBootApplication将主程序类所在的包和子包扫描进spring容器内
 * @importResource将导入spring的配置文件，不推荐使用这种方式
 */
@SpringBootApplication
//@ImportResource(locations = {"spring.xml"})
public class HelloWord {
    public static void main(String[] args) {

        //spring应用启动起来
        SpringApplication.run(HelloWord.class,args);

    }

}
