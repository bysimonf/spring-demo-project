package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;




@Controller
public class HomeController {

    @GetMapping("/impressum")
    public String impressum(){
        return "impressum";
    }
}
