package com.ymx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {
    @ResponseBody
    @RequestMapping("/book/save")
    public String save(){
        System.out.println("book save");
        return "{'module':'book save'}";
    }
}
