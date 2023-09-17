package com.example;


import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestCases_Lion {

    @Mock
    private Feline feline;
    private ExpectedException expectedEx;

    @Test
    public void checkKittens() throws Exception{
        Lion lion = new Lion(feline, "Самец");
        int actual = lion.getKittens();
        assertEquals(1, actual);
    }

    @Test
    public void checkFood() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        List<String> actualFood = lion.getFood();
        assertEquals(List.of("Животные","Птицы", "Рыба"), actualFood);
    }

    @Test
    public void isLionMale()throws Exception{
        Lion lion = new Lion(feline, "Самец");
        boolean expected = true;
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }

    @Test
    public void isLionFemale()throws Exception{
        Lion lion = new Lion(feline, "Самка");
        boolean expected = false;
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }
}


