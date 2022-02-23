package com.spring.mvc.orm;

import com.spring.mvc.QuizObject.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

// данный класс получает общее количество вопросов в БД
@Component
public class GetAllCountNumberQuestion {

    public int randomNum(){
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Question.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            int result = session.createQuery
                            ("select count (*) " + " as count FROM library_questions")
                    //необходимо проверить работоспособность данного запроса !!! важно !!!
                    .getMaxResults();
            session.getTransaction().commit();
            return result;
        }
        finally {
            factory.close();
        }
    }
}
