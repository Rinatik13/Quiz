package com.spring.mvc.orm;

import com.spring.mvc.QuizObject.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

@Component
public class AddNewPersonSql {

    public void addNewPersonSql(Person person) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            Person personAdd = new Person(person.getName(), person.getLogin(), person.getPassword());
            session.beginTransaction();
            session.save(personAdd);
            session.getTransaction().commit();
        }
        finally {
            factory.close();
        }
    }

}
