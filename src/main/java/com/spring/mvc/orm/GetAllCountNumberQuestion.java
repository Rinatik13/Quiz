package com.spring.mvc.orm;

import com.spring.mvc.QuizObject.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

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
//            String res = session.createQuery
//                            ("select count (*) from library_questions")
//                    .uniqueResult().toString();
//
            List<Question> questionList = session.createQuery("from Question")
                    .getResultList();
                    //необходимо проверить работоспособность данного запроса !!! важно !!!
            session.getTransaction().commit();
            int result = questionList.size();
            return result;
        }
        finally {
            factory.close();
        }
    }
}
