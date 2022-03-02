package com.spring.mvc.controllers;

import com.spring.mvc.orm.GetBooleanLoginAndPassword;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class StartController {
    @RequestMapping("/")
    public String myStartView(){

        return "startView";
    }
}
