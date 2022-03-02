package com.spring.mvc.logic;

import com.spring.mvc.QuizObject.Question;
import org.springframework.stereotype.Component;

// реализуем "миксер", получаем 5 стринговых значений
// 1 значение сам вопрос
// 2 значение правильный ответ
// 3-5 значение не правильные ответы
// в результаты выводится Вопрос и 4 ответа в случайном порядке

@Component
public class MixerQuestion {
    public String[] mixerResult(Question question){
        String[] cloneAnswer = new String[4];
        String[] myMixerResult = new String[5];
        myMixerResult[0] = question.getQuestion();
        cloneAnswer[0] = question.getCorrect_answer();
        cloneAnswer[1] = question.getIncorrect_answer_1();
        cloneAnswer[2] = question.getIncorrect_answer_2();
        cloneAnswer[3] = question.getIncorrect_answer_3();

        GetRandomNumber getRandomNumber = new GetRandomNumber();

        for (int i = 0; i<4; i++){
            int r = getRandomNumber.getRundomNumber(cloneAnswer.length-1);
            String text = cloneAnswer[i];
            cloneAnswer[i] = cloneAnswer[r];
            cloneAnswer[r] = text;
        }

        myMixerResult[1] = cloneAnswer[0];
        myMixerResult[2] = cloneAnswer[1];
        myMixerResult[3] = cloneAnswer[2];
        myMixerResult[4] = cloneAnswer[3];

        return myMixerResult;
    }
}