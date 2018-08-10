package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzTest {

//    First test
    @Test
    public void return100Values() {
        String[] test = new String[100];
        assertEquals(test.length, Fizzbuzz.calcFizzbuzz().length);
    }

    // Second test

    @Test
    public void testFizz(){
        String[] test = new String[100];
        test[2] = "Fizz";
        String[] results = Fizzbuzz.calcFizzbuzz();
        assertEquals(test[2], results[2]);
    }

    // Third test
    @Test
    public void testBuzz() {
        String[] test = new String[100];
        test[4] = "Buzz";
        String[] results = Fizzbuzz.calcFizzbuzz();
        assertEquals(test[4], results[4]);
    }

//    Fourth test
    @Test
    public void testFizzbuzz(){
        String[] test = new String[100];
        test[14] = "Fizzbuzz";
        String[] results = Fizzbuzz.calcFizzbuzz();
        assertEquals(test[14], results[14]);
    }
}