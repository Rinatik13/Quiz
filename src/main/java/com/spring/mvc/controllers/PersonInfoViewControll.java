package com.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonInfoViewControll {
    @RequestMapping("personInfoView")
    public String personInfoView(){
        return "personInfoView";
    }
}
