package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    public static double getAverage(int[] numbers) {

        IntStream
                .range(0, numbers.length)
                .map(s->numbers[s])
                .forEach(System.out::println);

        double result = IntStream
                .range(0, numbers.length)
                .map(s->numbers[s])
                .average()
                .getAsDouble();
        return result;
    }
}

