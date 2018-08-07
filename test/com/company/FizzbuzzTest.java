package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzTest {

//    First test
    @Test
    public void returnValues() {
        Object[] test = new Object[100];
        assertArrayEquals(test, Fizzbuzz.printFizzbuzz());
    }

//    @Test
//    public void testFizz(){
//        Object[] test = new Object[100];
//        test[2] = "Fizz";
//        Object[] results = Fizzbuzz.printFizzbuzz();
//        assertEquals(test[2], results[2]);
//    }
}