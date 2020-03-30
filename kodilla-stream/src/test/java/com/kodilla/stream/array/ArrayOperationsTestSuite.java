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
        numbers[0] = 6;
        numbers[1] = 6;
        numbers[2] = 6;
        numbers[3] = 6;
        numbers[4] = 6;
        //When
        double result = getAverage(numbers);
        //Then
        Assert.assertEquals(6.0, result,0);
    }
}
