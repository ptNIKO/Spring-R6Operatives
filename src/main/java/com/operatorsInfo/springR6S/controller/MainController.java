package com.operatorsInfo.springR6S.controller;

import com.operatorsInfo.springR6S.model.Operative;
import com.operatorsInfo.springR6S.repos.OperativeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MainController {

    @Autowired
    private OperativeRepo operativeRepo;

    @GetMapping()
    public String main(Model model) {
        Iterable<Operative> operatives = operativeRepo.findAll();
        model.addAttribute("operatives", operatives);
        return "mainPage";
    }

}
