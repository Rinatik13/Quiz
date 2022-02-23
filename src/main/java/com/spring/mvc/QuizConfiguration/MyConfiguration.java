package com.spring.mvc.QuizConfiguration;

import com.spring.mvc.QuizObject.Person;
import com.spring.mvc.logic.MixerQuestion;
import com.spring.mvc.orm.AddNewPersonSql;
import com.spring.mvc.orm.GetInfoPerson;
import com.spring.mvc.orm.GetInfoQuestion;
import com.spring.mvc.orm.GetInfoSql;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
    @Bean
    public AddNewPersonSql addNewPersonSql(){
        return new AddNewPersonSql();
    }

    @Bean
    public Person person(){
        return new Person();
    }

    @Bean
    public GetInfoSql getInfoPerson(){
        return new GetInfoPerson();
    }

    @Bean
    public GetInfoSql getInfoQuestion(){
        return new GetInfoQuestion();
    }

    @Bean
    public MixerQuestion quizMixerQuestion(){
        return new MixerQuestion();
    }
}
