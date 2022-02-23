package com.spring.mvc.controllers;

import com.spring.mvc.QuizConfiguration.MyConfiguration;
import com.spring.mvc.QuizObject.Person;
import com.spring.mvc.orm.AddNewPersonSql;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ResultAddPerson {
    @RequestMapping("resultAddNewPerson")
    public String resultAddPerson(HttpServletRequest request, Model model){
        String personName = request.getParameter("person.name");
        String personLogin = request.getParameter("person.login");
        String personPassword = request.getParameter("person.password");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        Person person = new Person(personName,personLogin,personPassword);
        AddNewPersonSql newPersonSql = context.getBean("addNewPersonSql", AddNewPersonSql.class);
        newPersonSql.addNewPersonSql(person);
        context.close();

        return "resultAddPersonView";
    }
}
