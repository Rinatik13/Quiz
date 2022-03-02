package com.spring.mvc.controllers;

import com.spring.mvc.orm.GetBooleanLoginAndPassword;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ResultLoginAndPasswordController {
    @RequestMapping("resultLoginAndPassword")
    public String resultLoginPassword(HttpServletRequest request, Model model){
        String login = request.getParameter("person.login");
        String password = request.getParameter("person.password");
        GetBooleanLoginAndPassword getBooleanLoginAndPassword = new GetBooleanLoginAndPassword();
        // прописываем что выводить при положительном вводе логина и пароля
        if (getBooleanLoginAndPassword.loginAndPassword(login,password)){
            model.addAttribute("resultLoginPassword", "Start game!");
            model.addAttribute("resultAction","game");
            model.addAttribute("resultSubmitValue", "START");
            return "personInfo";
        }
        // прописываем что выводить при отрицательном вводе логина и пароля
        else {
            model.addAttribute("resultLoginPassword", "Incorrected Login and Password!");
            model.addAttribute("resultAction","startView");
            model.addAttribute("resultSubmitValue", "BACK");
            return "personInfo";
        }
    }
}
