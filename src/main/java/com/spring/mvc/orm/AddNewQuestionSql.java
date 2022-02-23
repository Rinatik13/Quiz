package com.spring.mvc.orm;

import com.spring.mvc.QuizObject.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

// реализуем метод добавления нового вопроса с ответами в БД
// Автоматически ему задёться id, correct_answer являеться правильным ответом
@Component
public class AddNewQuestionSql {
    public void addNewQuestionSql(Question question){
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Question.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            Question questionAdd = new Question(question.getQuestion(),
                    question.getCorrect_answer(),
                    question.getIncorrect_answer_1(),
                    question.getIncorrect_answer_2(),
                    question.getIncorrect_answer_3());
            session.beginTransaction();
            session.save(questionAdd);
            session.getTransaction().commit();
        }
        finally {
            factory.close();
        }
    }
}
