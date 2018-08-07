package com.company;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzTest {

//    First test
    @Test
    public void returnArray() {
        Array[] test = new Array[100];
        assertArrayEquals(test, Fizzbuzz.printFizzbuzz());
    }
}