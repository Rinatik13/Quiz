package com.spring.mvc.orm;

import com.spring.mvc.QuizObject.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

// реализуем метод получения данных пользователя для отображения актуальной информации о нём
// получаем id пользователя и по этому отправляем запрос в БД
@Component
public class GetInfoPerson implements GetInfoSql{

    @Override
    public Person getInfo(int idObject) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            Person person = session.get(Person.class, idObject);
            session.getTransaction().commit();
            return person;
        }
        finally {
            factory.close();
        }
    }
}
