package com.kodilla;

class Calculator {
    int a;
    int b;
    public int add(int a,int b){
        return a+b;
    }
    public int substract(int a, int b){
        return a-b;
    }
}
class Application{
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int result = calculator.add(10, 5);
        System.out.println(result);
    }
}

