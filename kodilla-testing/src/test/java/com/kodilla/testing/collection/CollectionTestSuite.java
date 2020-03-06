package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(13);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        oddNumbersExterminator.exterminate(numbers);
        //Then
        ArrayList<Integer> results = new ArrayList<Integer>();

        results.add(2);
        results.add(4);
        results.add(6);

        Assert.assertEquals(evenNumber, results);
    }
}
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> numbers1 = new ArrayList<Integer>();

        oddNumbersExterminator.exterminate(numbers1);
        //Then
        ArrayList<Integer> results1 = new ArrayList<Integer>();
        Assert.assertEquals(evenNumber, results1);
    }
}