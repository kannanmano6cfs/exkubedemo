package com.learning.exkubedemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetController {

    @GetMapping("/")
    public String greet() {
        return "Hello World!! This is from Azure Web App Service created for FSSTech by Kannan!!";
    }
}
