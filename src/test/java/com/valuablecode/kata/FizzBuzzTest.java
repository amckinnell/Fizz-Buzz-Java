package com.valuablecode.kata;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.valuablecode.kata.FizzBuzz;

public class FizzBuzzTest {

    final FizzBuzz sut = new FizzBuzz();

    @Test
    public void classify_regular_numbers_as_is() {
        assertThat(sut.classify(1), equalTo("1"));
        assertThat(sut.classify(2), equalTo("2"));
    }

    @Test
    public void classify_divisible_by_3_as_fizz() {
        assertThat(sut.classify(3), equalTo("fizz"));
        assertThat(sut.classify(6), equalTo("fizz"));
    }

    @Test
    public void classify_divisible_5_as_buzz() {
        assertThat(sut.classify(5), equalTo("buzz"));
        assertThat(sut.classify(10), equalTo("buzz"));
    }

    @Test
    public void classify_divisible_by_both_3_and_5_as_fizzbuzz() {
        assertThat(sut.classify(15), equalTo("fizzbuzz"));
        assertThat(sut.classify(30), equalTo("fizzbuzz"));
    }

}
