package com.spring.mvc.controllers;

import com.spring.mvc.QuizConfiguration.MyConfiguration;
import com.spring.mvc.QuizObject.Question;
import com.spring.mvc.logic.MixerQuestion;
import com.spring.mvc.logic.RandomNumberQuestion;
import com.spring.mvc.orm.GetAllCountNumberQuestion;
import com.spring.mvc.orm.GetInfoQuestion;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

// плохо реализована связанная с бинами. пока как то так.
// в планах допилить работу с бинами
// надо реализовать данный код в отдельном классе, так как это по сути основная логика
@Controller
public class GameController {
    @RequestMapping ("game")
    public String quizGame(HttpServletRequest request, Model model){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfiguration.class);
        MixerQuestion myQuestion = context.getBean("quizMixerQuestion", MixerQuestion.class);
        GetInfoQuestion getInfoQuestion = new GetInfoQuestion();
        RandomNumberQuestion randomNumberQuestion = new RandomNumberQuestion();
        GetAllCountNumberQuestion getAllCountNumberQuestion = new GetAllCountNumberQuestion();
        int result = getAllCountNumberQuestion.randomNum();
        result = randomNumberQuestion.getRundomNumber(result);
        Question question = getInfoQuestion.getInfo(result);
        String[] myQuestionResult = myQuestion.mixerResult(question);
        model.addAttribute("questionView", myQuestionResult[0]);
        model.addAttribute("questionAnswer1",myQuestionResult[1]);
        model.addAttribute("questionAnswer2",myQuestionResult[2]);
        model.addAttribute("questionAnswer3",myQuestionResult[3]);
        model.addAttribute("questionAnswer4",myQuestionResult[4]);

        return "gameView";
    }
}
