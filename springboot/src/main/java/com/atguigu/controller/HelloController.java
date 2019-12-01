package com.atguigu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

    @Qualifier("getperson")
    @Autowired
    private Person person;

    @Autowired
    private Dog dog;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {

        return "你好"+person;


    }

    @RequestMapping("/bb")
    public String bb(@RequestParam("name") String name) throws Exception {

            return name;
    }

    /**
     * 添加thymeleaf以后不用像springmvc一样配置视图解析器，会默认路径classpath/tempates/下找对应的页面
     * @return
     */
    @RequestMapping("/succse")
    public String succse(Map<String,Object> map,  HttpServletRequest req){
        //classpath:/templates/succse.htm
        map.put("person",person);
        map.put("useridd",req.getParameter("username"));
        map.put("users", Arrays.asList("zhangsan","li"));
        return "succse";
    }
    @RequestMapping("/user/login" )
    public String login(@RequestParam("username") String username ,@RequestParam("password") String password,Map<String,Object> map){
        if(username != null && password.equals("123456")){
            return "login";
        }else {
            map.put("msg", "用户名密码错误");
            return "index";
        }
    }
}

