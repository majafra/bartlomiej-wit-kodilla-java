package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;
import java.io.*;

class OddNumbersExterminator{

    public void exterminate(ArrayList<Integer> numbers){

        ArrayList<Integer> evenNumber = new ArrayList<Integer>();

        int temporaryValue = 0;
        for (int n=0; n < numbers.size(); n++){
            temporaryValue = numbers.get(n);
            if (temporaryValue % 2 == 0){
                evenNumber.add(temporaryValue);
            }
        }
    }
}