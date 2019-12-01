package com.atguigu.controller;

import com.atguigu.resolver.Myresolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Configuration指明当前类是一个配置类，就是来替代之前的spring配置文件
 */
@Configuration
public class Mycongfig extends WebMvcConfigurerAdapter {


    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/main.html").setViewName("login");
    }

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new Myhandler()).addPathPatterns("/**").excludePathPatterns("");
//    }


    /**
     * @bean注解，为spring容器中添加组件，组件id为方法名
     * @return
     */
    @Bean
    public  Dog dog(){
        return new Dog("wangwang");

    }
    @Bean(name="getperson")
    public Person getperson(){
        return new Person();
    }

    public LocaleResolver getresolver(){
        return new Myresolver();
    }

}
