package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
           secondChallenge.probablyIWillThrowException(1.2,1.0);

            } catch (Exception e) {
            System.out.println("Nie podano co najmniej jednej z wymaganych liczb");
        } finally {
            System.out.println("Ukończono działanie programu");
        }
    }
}
