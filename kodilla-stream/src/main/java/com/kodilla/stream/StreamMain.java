package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.SaySomething;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        SaySomething saySomething = new SaySomething();
        saySomething.say();


        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("To jest tekst do upiekszenia", (a) -> ("ABC" + a + "ABC"));
        poemBeautifier.beautify("To jest tekst do upiekszenia", (a) -> a.toUpperCase());
        poemBeautifier.beautify("To jest tekst do upiekszenia", (a) -> a.replaceAll("jest", "juz nie jest"));
        poemBeautifier.beautify("To jest tekst do upiekszenia", (a) -> a.substring(0, 14));
    }
}
