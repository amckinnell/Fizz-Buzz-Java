package com.valuablecode.kata;

public class FizzBuzz {

    public String classify(int n) {
        if (n % 3 == 0 && n % 5 == 0)
            return "fizzbuzz";

        if (n % 5 == 0)
            return "buzz";

        if (n % 3 == 0)
            return "fizz";

        return Integer.toString(n);
    }

}
