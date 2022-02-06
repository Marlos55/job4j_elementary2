package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        String in = "Привет, Бот.";
        String res = DummyBot.answer(in);
        String exp = "Привет, умник.";
        Assert.assertEquals(exp, res);
    }

    @Test
    public void whenByeBot() {
        String in = "Пока.";
        String res = DummyBot.answer(in);
        String exp = "До скорой встречи.";
        Assert.assertEquals(exp, res);
    }

    @Test
    public void whenUnknownBot() {
        String in = "Сколько будет 2 + 2?";
        String res = DummyBot.answer(in);
        String exp = "Это ставит меня в тупик. Задайте другой вопрос.";
        Assert.assertEquals(exp, res);
    }
}