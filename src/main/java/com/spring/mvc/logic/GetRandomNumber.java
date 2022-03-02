package com.spring.mvc.logic;

import org.springframework.stereotype.Component;

// реализуем получение случайного числа в промежутке от 1 до переменной х
@Component
public class GetRandomNumber implements RundomNumber{

    @Override
    public int getRundomNumber(int x) {

        int result = 1 + (int) (Math.random() * x);
        return result;
    }
}
