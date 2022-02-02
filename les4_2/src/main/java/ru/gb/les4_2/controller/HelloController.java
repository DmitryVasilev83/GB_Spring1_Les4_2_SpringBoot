package ru.gb.les4_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @GetMapping
    public String helloMessage(){
        return "Hello my Spring Boot";
    }

    @GetMapping("/hello")
    public String helloMessageJsp(Model model){
        model.addAttribute("msg", "Hello from Spring Boot");
        return "message";
    }
}
