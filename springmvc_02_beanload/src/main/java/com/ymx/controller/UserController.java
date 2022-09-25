package com.ymx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// springmvc的专属bean
@Controller
public class UserController {
    // 设置当前控制器方法相应内容为当前返回值
    @ResponseBody
    @RequestMapping("/save")
    public String save(){
        System.out.println("user save");
        return "{'module':'springmvc'}";
    }
}
