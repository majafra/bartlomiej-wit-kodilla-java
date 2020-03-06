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

        ArrayList<Integer>results = oddNumbersExterminator.exterminate(numbers);

        //Then
        ArrayList<Integer> expected = new ArrayList<Integer>();

        expected.add(2);
        expected.add(4);
        expected.add(6);

        Assert.assertEquals(expected, results);
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer>results= oddNumbersExterminator.exterminate(numbers);

        //Then
        ArrayList<Integer> expected = new ArrayList<Integer>();
        Assert.assertEquals(expected, results);
    }
}