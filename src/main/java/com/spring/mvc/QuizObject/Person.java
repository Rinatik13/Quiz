package com.spring.mvc.QuizObject;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

// в данном классе прописаны все поля которые несут информацию о пользователе
// поле id показывает порядковый номер пользователя в БД
// поле name показывает имя пользователя которое он ввёл при регистрации
// поле login показывает логин пользователя которое он ввёл при регистрации
// поле password показывает пароль введёный при регистрации
// поле scope показывает количество заработанных баллов за всё время


@Entity
@Table(name = "person")
@Component
public class Person {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @Column(name = "scope")
    private int scope;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && scope == person.scope && name.equals(person.name) && login.equals(person.login) && password.equals(person.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, login, password, scope);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", scope=" + scope +
                '}';
    }

    public int getId() {
        return id;
    }

    public Person() {
    }

    public Person(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.scope = 0;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getScope() {
        return scope;
    }

    public void setScope(int scope) {
        this.scope = scope;
    }
}