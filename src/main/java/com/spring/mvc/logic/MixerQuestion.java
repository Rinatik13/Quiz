package com.spring.mvc.logic;

import com.spring.mvc.*;
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
        myMixerResult[1] = question.getQuestion();
        cloneAnswer[0] = question.getCorrect_answer();
        cloneAnswer[1] = question.getIncorrect_answer_1();
        cloneAnswer[2] = question.getIncorrect_answer_2();
        cloneAnswer[3] = question.getIncorrect_answer_3();

// реализуем алгоритм Фишера - Йетса !!!
// Чтобы перемешать массив a из n элементов (индексы элементов от 0 до n - 1):
// для всех i от n − 1 до 1 выполнить
// j ← случайное число 0 ≤ j ≤ i
// обменять местами a[j] и a[i]

        for (int i = 0; i < 4; i++){
            int randomNum = (int) (Math.random() * 3) - 1;
            if (randomNum == 1){
                String randomAnswer = cloneAnswer[i];
                cloneAnswer[i] = cloneAnswer[i+1];
                cloneAnswer[i+1] = randomAnswer;
            }
            if (randomNum == 2){
                String randomAnswer = cloneAnswer[i+1];
                cloneAnswer[i+1] = cloneAnswer[i];
                cloneAnswer[i] = randomAnswer;
            }


        }
        for (int i = 0; i<4; i++){
            myMixerResult[i+1] = cloneAnswer[i];
        }
        return myMixerResult;
    }
}