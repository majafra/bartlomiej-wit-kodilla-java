package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

import static com.kodilla.stream.array.ArrayOperations.*;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int numbers[] = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        //When
        double result = getAverage(numbers);
        //Then
        Assert.assertEquals(3.0, result,0);
    }
}
