package com.company;


public class Fizzbuzz {
    public static String[] calcFizzbuzz()
    {
        String[] fizzbuzz = new String[100];
        int value = 1;
        for(int i = 0; i < fizzbuzz.length; i++) {
            if (value % 3 == 0 && value % 5 == 0) {
                fizzbuzz[i] = "Fizzbuzz";
            } else if (value % 3 == 0) {
                fizzbuzz[i] = "Fizz";
            } else if (value % 5 == 0) {
                fizzbuzz[i] = "Buzz";
            } else
                fizzbuzz[i] = Integer.toString(value);
            value++;
        }
        return fizzbuzz;
    }

    public static void printFizzbuzz(String[] fizzbuzz)
    {
        for(int i = 0; i < fizzbuzz.length; i++)
        {
            System.out.println(fizzbuzz[i]);
        }
    }

}
