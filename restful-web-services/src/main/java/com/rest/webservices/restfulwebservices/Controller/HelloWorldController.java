package com.rest.webservices.restfulwebservices.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
    
    @GetMapping("/hello-world")
    
    public String helloWorldInternationalized(){
        return "Hello World !";
    }
}
