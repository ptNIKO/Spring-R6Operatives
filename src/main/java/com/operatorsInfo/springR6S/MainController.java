package com.operatorsInfo.springR6S;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping()
    public String main(Model model) {

        return "mainPage";
    }
}