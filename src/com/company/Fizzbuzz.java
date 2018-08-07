package com.company;

import java.lang.reflect.Array;

public class Fizzbuzz {
    public static Object[] calcFizzbuzz()
    {
        Object[] fizzbuzz = new Object[100];
        int i = 1;
        for(int count = 0; count < fizzbuzz.length; count++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzbuzz[count] = "Fizzbuzz";
            } else if (i % 3 == 0) {
                fizzbuzz[count] = "Fizz";
            } else if (i % 5 == 0) {
                fizzbuzz[count] = "Buzz";
            } else
                fizzbuzz[count] = i;
            i++;
        }
        return fizzbuzz;
    }

}
