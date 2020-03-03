package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();

        int result1 = calculator.add(2,3);

        if (result1==5) {
            System.out.println("test of adding OK");
        }else{
            System.out.println("Error!");
        }
        int result2 = calculator.subtract(3,2);

        if (result2==1) {
            System.out.println("test of subtracting OK");
        }else{
            System.out.println("Error!");
        }
    }
}
