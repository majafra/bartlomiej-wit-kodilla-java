package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.List;

public class SecondChallenge {
    public String probablyIWillThrowException(double x, double y) throws Exception {
        List<Integer> myList = new ArrayList<>();
        if(x >= 2 || x < 1 || y == 1.5) {
            throw new Exception();
        }
        return "Done!";
    }
}
