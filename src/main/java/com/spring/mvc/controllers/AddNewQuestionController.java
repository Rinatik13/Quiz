package com.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddNewQuestionController {

    @RequestMapping("addQuestion")
    public String newQuestion (){
        return "addNewQuestion";
    }
}
