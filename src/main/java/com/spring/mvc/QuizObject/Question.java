package com.spring.mvc.QuizObject;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// В данном классе отображается информация по вопросу
// В поле id_question отображается номер в БД
// В поле question отображается вопрос
// В поле correct_answer отображается правильный ответ на вопрос
// В полях incorrect_answer_1 - incorrect_answer_3 отображаются
// неправильные ответы

@Entity
@Table(name = "library_questions")
@Component
public class Question {
    @Id
    @Column(name = "id_question")
    private int id_question;
    @Column(name = "question")
    private String question;
    @Column(name = "correct_answer")
    private String correct_answer;
    @Column(name = "incorrect_answer_1")
    private String incorrect_answer_1;
    @Column(name = "incorrect_answer_2")
    private String incorrect_answer_2;
    @Column(name = "incorrect_answer_3")
    private String incorrect_answer_3;

    public Question(String question, String correct_answer, String incorrect_answer_1, String incorrect_answer_2, String incorrect_answer_3) {
        this.question = question;
        this.correct_answer = correct_answer;
        this.incorrect_answer_1 = incorrect_answer_1;
        this.incorrect_answer_2 = incorrect_answer_2;
        this.incorrect_answer_3 = incorrect_answer_3;
    }

    public int getId_question() {
        return id_question;
    }

    public void setId_question(int id_question) {
        this.id_question = id_question;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrect_answer() {
        return correct_answer;
    }

    public void setCorrect_answer(String correct_answer) {
        this.correct_answer = correct_answer;
    }

    public String getIncorrect_answer_1() {
        return incorrect_answer_1;
    }

    public void setIncorrect_answer_1(String incorrect_answer_1) {
        this.incorrect_answer_1 = incorrect_answer_1;
    }

    public String getIncorrect_answer_2() {
        return incorrect_answer_2;
    }

    public void setIncorrect_answer_2(String incorrect_answer_2) {
        this.incorrect_answer_2 = incorrect_answer_2;
    }

    public String getIncorrect_answer_3() {
        return incorrect_answer_3;
    }

    public void setIncorrect_answer_3(String incorrect_answer_3) {
        this.incorrect_answer_3 = incorrect_answer_3;
    }

    public Question() {
    }


    @Override
    public String toString() {
        return "Question{" +
                "id_question=" + id_question +
                ", question='" + question + '\'' +
                ", correct_answer='" + correct_answer + '\'' +
                ", incorrect_answer_1='" + incorrect_answer_1 + '\'' +
                ", incorrect_answer_2='" + incorrect_answer_2 + '\'' +
                ", incorrect_answer_3='" + incorrect_answer_3 + '\'' +
                '}';
    }
}