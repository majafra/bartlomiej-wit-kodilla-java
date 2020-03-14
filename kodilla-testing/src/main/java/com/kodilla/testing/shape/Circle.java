package com.kodilla.testing.shape;

class Circle implements Shape {

    private double a;

    public Circle(double a) {
        this.a = a;
    }

    public String getShapeName() {
        return "Circle";
    }

    public double getField() {
        return Math.PI * a * a;
    }
}