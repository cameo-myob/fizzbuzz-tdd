package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzTest {

//    First test
    @Test
    public void return100Values() {
        Object[] test = new Object[100];
        assertEquals(test.length, Fizzbuzz.printFizzbuzz().length);
    }

    // Second test

    @Test
    public void testFizz(){
        Object[] test = new Object[100];
        test[2] = "Fizz";
        Object[] results = Fizzbuzz.printFizzbuzz();
        assertEquals(test[2], results[2]);
    }

    // Third test
    @Test
    public void testBuzz() {
        Object[] test = new Object[100];
        test[4] = "Buzz";
        Object[] results = Fizzbuzz.printFizzbuzz();
        assertEquals(test[4], results[4]);
    }

//    Fourth test
    @Test
    public void testFizzbuzz(){
        Object[] test = new Object[100];
        test[14] = "Fizzbuzz";
        Object[] results = Fizzbuzz.printFizzbuzz();
        assertEquals(test[14], results[14]);
    }
}