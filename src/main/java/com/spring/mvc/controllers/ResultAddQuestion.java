package com.spring.mvc.controllers;

import com.spring.mvc.QuizConfiguration.MyConfiguration;
import com.spring.mvc.QuizObject.Person;
import com.spring.mvc.QuizObject.Question;
import com.spring.mvc.orm.AddNewPersonSql;
import com.spring.mvc.orm.AddNewQuestionSql;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

    @Controller
    public class ResultAddQuestion {
    @RequestMapping("resultAddQuestion")
    public String resultAddQuestion(HttpServletRequest request, Model model){
        String questionView = request.getParameter("questionView");
        String correctAnswer = request.getParameter("correct.answer");
        String incorrectAnswer1 = request.getParameter("incorrect.answer1");
        String incorrectAnswer2 = request.getParameter("incorrect.answer2");
        String incorrectAnswer3 = request.getParameter("incorrect.answer3");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        Question question = new Question(questionView,correctAnswer,incorrectAnswer1,incorrectAnswer2,incorrectAnswer3);
        AddNewQuestionSql addNewQuestionSql = context.getBean("addNewQuestion", AddNewQuestionSql.class);
        addNewQuestionSql.addNewQuestionSql(question);
        context.close();

        return "resultAddQuestion";
    }
}
