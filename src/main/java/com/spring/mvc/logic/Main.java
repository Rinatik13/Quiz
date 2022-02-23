package com.spring.mvc.logic;

import com.spring.mvc.QuizConfiguration.MyConfiguration;
import com.spring.mvc.QuizObject.Person;
import com.spring.mvc.orm.AddNewPersonSql;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        AddNewPersonSql addNewObjectSql = context.getBean("addNewPersonSql", AddNewPersonSql.class);
        Person person = new Person("Rinat", "Fanar13", "home");
        addNewObjectSql.addNewPersonSql(person);
        System.out.println(person.toString());
        context.close();

    }

}
