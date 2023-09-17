package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestCases_Feline {

    @Test
    public void checkEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> expected = feline.eatMeat();
        assertEquals(expected, List.of("Животные", "Птицы", "Рыба"));
    }

    @Test
    public void checkCatsFamily(){
        Feline feline = new Feline();
        String actual = feline.getFamily();
        assertEquals("Кошачьи", actual);
    }
    @Test
    public void checkKittensCount(){
        Feline feline = new Feline();
        int actual = feline.getKittens();
        assertEquals(1, actual);
    }
}
