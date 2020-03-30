package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    public static double getAverage(int[] numbers) {

        IntStream.rangeClosed(numbers[0], numbers.length).forEach(System.out::println);
        double result = IntStream.rangeClosed(numbers[0], numbers.length).average().getAsDouble();
        return result;
    }
}

