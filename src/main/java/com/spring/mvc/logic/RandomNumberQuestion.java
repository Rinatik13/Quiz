package com.spring.mvc.logic;

import org.springframework.stereotype.Component;

// получаем число количества вопров из БД и выдаём случайное число в заданном деапазоне
@Component
public class RandomNumberQuestion implements RundomNumber{

    @Override
    public int getRundomNumber(int x) {

        int result = ((int)Math.random() * ++x)-1;
        return result;
    }
}
