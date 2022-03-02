package com.spring.mvc.orm;

import com.spring.mvc.QuizObject.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class GetBooleanLoginAndPassword {
    public boolean loginAndPassword (String p_login, String p_password) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .buildSessionFactory();
        try
            {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        Person personList = (Person) session.createQuery("from Person " + "where login = " + p_login)
                .getResultList()
                .get(0);
        session.getTransaction().commit();
        boolean result;

        result = (personList.equals(p_password));
        //надо исправить проверку пароля и выдачу булевого значения
                return result;
            }
        finally {
            factory.close();
        }
        }
    }
