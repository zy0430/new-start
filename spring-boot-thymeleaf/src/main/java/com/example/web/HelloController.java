package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String sayHello(ModelMap modelMap) {
        modelMap.addAttribute("message", "http://www.ityouknow.com");
        return "hello";
    }
}
