package com.example;


import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestCasesLion {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    @Mock
    private Feline feline;

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
    public void isLionFemale()throws Exception {
        Lion lion = new Lion(feline, "Самка");
        boolean expected = false;
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);

    }
        @Test
        public void newLionThrowsException() throws Exception {
            expectedException.expect(Exception.class);
            expectedException.expectMessage("Используйте допустимые значения пола животного - самец или самка");

            new Lion(feline, "Не определено");
        }
    }


