package com.company;

import java.lang.reflect.Array;

public class Fizzbuzz {
    public static Object[] printFizzbuzz()
    {
        Object[] fizzbuzz = new Object[100];
        fizzbuzz[2] = "Fizz";
        fizzbuzz[4] = "Buzz";
        fizzbuzz[14] = "Fizzbuzz";
        return fizzbuzz;
    }
}
