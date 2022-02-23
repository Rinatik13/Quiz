package com.spring.mvc.orm;

import com.spring.mvc.QuizObject.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

// реализуем метод получения вопроса с БД по Id
// получаем данные класса question id, вопрос и 4 ответа
@Component
public class GetInfoQuestion implements GetInfoSql{

    @Override
    public Question getInfo(int idQuestion) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Question.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            Question question = session.get(Question.class, idQuestion);
            session.getTransaction().commit();
            return question;
        }
        finally {
            factory.close();
        }
    }

}
